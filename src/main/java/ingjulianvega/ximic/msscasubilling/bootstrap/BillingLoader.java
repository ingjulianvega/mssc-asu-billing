package ingjulianvega.ximic.msscasubilling.bootstrap;

import ingjulianvega.ximic.msscasubilling.domain.BillingEntity;
import ingjulianvega.ximic.msscasubilling.domain.repositories.BillingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@RequiredArgsConstructor
@Component
public class BillingLoader implements CommandLineRunner {

    private final BillingRepository billingRepository;

    @Override
    public void run(String... args) throws Exception {
        if (billingRepository.count() == 0) {
            loadBillingObjects();
        }
    }

    private void loadBillingObjects() {
        billingRepository.saveAll(Arrays.asList(
                BillingEntity.builder()
                        .paymentMethod("PSE")
                        .quantity(75000)
                        .build(),
                BillingEntity.builder()
                        .paymentMethod("Tarjeta de credito")
                        .quantity(75000)
                        .build(),
                BillingEntity.builder()
                        .paymentMethod("Efectivo")
                        .quantity(75000)
                        .build(),
                BillingEntity.builder()
                        .paymentMethod("Transferencia bancaria")
                        .quantity(75000)
                        .build()
        ));
    }
}