package ingjulianvega.ximic.msscasubilling.web.Mappers;


import ingjulianvega.ximic.msscasubilling.domain.BillingEntity;
import ingjulianvega.ximic.msscasubilling.web.model.BillingDto;
import org.mapstruct.Mapper;

import java.util.ArrayList;
import java.util.List;

@Mapper(uses = DateMapper.class)
public interface BillingMapper {
    BillingDto billingEntityToBillingDto(BillingEntity billingEntity);

    BillingEntity billingDtoToBillingEntity(BillingDto billingDto);

    ArrayList<BillingDto> billingEntityListToBillingDtoList(List<BillingEntity> billingEntityList);
}