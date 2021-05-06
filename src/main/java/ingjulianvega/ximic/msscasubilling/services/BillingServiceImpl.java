package ingjulianvega.ximic.msscasubilling.services;

import ingjulianvega.ximic.msscasubilling.configuration.ErrorCodeMessages;
import ingjulianvega.ximic.msscasubilling.domain.BillingEntity;
import ingjulianvega.ximic.msscasubilling.domain.repositories.BillingRepository;
import ingjulianvega.ximic.msscasubilling.exception.BillingException;
import ingjulianvega.ximic.msscasubilling.web.Mappers.BillingMapper;
import ingjulianvega.ximic.msscasubilling.web.model.Billing;
import ingjulianvega.ximic.msscasubilling.web.model.BillingDto;
import ingjulianvega.ximic.msscasubilling.web.model.BillingList;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@RequiredArgsConstructor
@Slf4j
@Service
public class BillingServiceImpl implements BillingService {

    private final BillingRepository billingRepository;
    private final BillingMapper billingMapper;


    @Cacheable(cacheNames = "billingListCache")
    @Override
    public BillingList get() {
        log.debug("get()...");
        return BillingList
                .builder()
                .billingDtoList(billingMapper.billingEntityListToBillingDtoList(billingRepository.findAll()))
                .build();
    }

    @Cacheable(cacheNames = "billingCache")
    @Override
    public BillingDto getById(UUID id) {
        log.debug("getById()...");
        return billingMapper.billingEntityToBillingDto(
                billingRepository.findById(id)
                        .orElseThrow(() -> new BillingException(ErrorCodeMessages.BILLING_NOT_FOUND, "")));
    }

    @Override
    public void create(Billing billing) {
        log.debug("create()...");
        billingMapper.billingEntityToBillingDto(
                billingRepository.save(
                        billingMapper.billingDtoToBillingEntity(
                                BillingDto
                                        .builder()
                                        .paymentMethod(billing.getPaymentMethod())
                                        .quantity(billing.getQuantity())
                                        .build())));
    }

    @Override
    public void updateById(UUID id, Billing billing) {
        log.debug("updateById...");
        BillingEntity billingEntity = billingRepository.findById(id)
                .orElseThrow(() -> new BillingException(ErrorCodeMessages.BILLING_NOT_FOUND, ""));

        billingEntity.setPaymentMethod(billing.getPaymentMethod());
        billingEntity.setQuantity(billing.getQuantity());
        billingRepository.save(billingEntity);
    }

    @Override
    public void deleteById(UUID id) {
        log.debug("deleteById...");
        billingRepository.deleteById(id);
    }
}
