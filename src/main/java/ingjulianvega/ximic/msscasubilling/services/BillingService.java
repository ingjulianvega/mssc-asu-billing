package ingjulianvega.ximic.msscasubilling.services;


import ingjulianvega.ximic.msscasubilling.web.model.Billing;
import ingjulianvega.ximic.msscasubilling.web.model.BillingDto;
import ingjulianvega.ximic.msscasubilling.web.model.BillingList;

import java.util.UUID;

public interface BillingService {
    BillingList get(Boolean usingCache);

    BillingDto getById(UUID id);

    void create(Billing billing);

    void updateById(UUID id, Billing billing);

    void deleteById(UUID id);

}
