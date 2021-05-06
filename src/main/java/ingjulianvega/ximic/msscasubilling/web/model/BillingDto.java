package ingjulianvega.ximic.msscasubilling.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BillingDto implements Serializable {

    static final long serialVersionUID = -2164180391528710825L;

    private UUID id;
    private String paymentMethod;
    private int quantity;

}