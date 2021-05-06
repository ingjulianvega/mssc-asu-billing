package ingjulianvega.ximic.msscasubilling.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Billing implements Serializable {

    static final long serialVersionUID = 8985294312046126138L;

    private String paymentMethod;
    private int quantity;

}
