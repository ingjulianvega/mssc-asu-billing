package ingjulianvega.ximic.msscasubilling.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BillingList implements Serializable {

    static final long serialVersionUID = 8232549348231851206L;

    public ArrayList<BillingDto> billingDtoList;
}
