package ingjulianvega.ximic.msscasubilling.domain.repositories;

import ingjulianvega.ximic.msscasubilling.domain.BillingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.UUID;

public interface BillingRepository extends JpaRepository<BillingEntity, UUID>, JpaSpecificationExecutor<BillingEntity> {
}
