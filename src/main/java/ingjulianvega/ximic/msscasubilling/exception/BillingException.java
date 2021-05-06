package ingjulianvega.ximic.msscasubilling.exception;

import lombok.Getter;

@Getter
public class BillingException extends RuntimeException {

    private final String code;

    public BillingException(final String code, final String message) {
        super(message);
        this.code = code;
    }
}

