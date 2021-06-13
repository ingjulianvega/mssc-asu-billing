package ingjulianvega.ximic.msscasubilling.web.controller;


import ingjulianvega.ximic.msscasubilling.services.BillingService;
import ingjulianvega.ximic.msscasubilling.web.model.Billing;
import ingjulianvega.ximic.msscasubilling.web.model.BillingDto;
import ingjulianvega.ximic.msscasubilling.web.model.BillingList;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class BillingController implements BillingI {

    private final BillingService billingService;

    @Override
    public ResponseEntity<BillingList> get(Boolean usingCache) {
        return new ResponseEntity<>(billingService.get(usingCache), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<BillingDto> getById(@NotNull UUID id) {
        return new ResponseEntity<>(billingService.getById(id), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> create(@NotNull @Valid Billing billing) {
        billingService.create(billing);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Void> updateById(@NotNull UUID id, @NotNull @Valid Billing billing) {
        billingService.updateById(id, billing);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @Override
    public ResponseEntity<Void> deleteById(@NotNull UUID id) {
        billingService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
