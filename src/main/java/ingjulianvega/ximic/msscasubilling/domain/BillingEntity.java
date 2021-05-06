package ingjulianvega.ximic.msscasubilling.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class BillingEntity extends BaseEntity {

    @Column(length = 30, columnDefinition = "varchar(30)")
    private String paymentMethod;
    private int quantity;
}
