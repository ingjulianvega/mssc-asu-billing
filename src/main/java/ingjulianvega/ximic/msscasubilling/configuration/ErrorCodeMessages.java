package ingjulianvega.ximic.msscasubilling.configuration;

import lombok.experimental.UtilityClass;

@UtilityClass
public class ErrorCodeMessages {

    public static final String BILLING_NOT_FOUND_API_CODE = "401";
    public static final String BILLING_NOT_FOUND_ERROR = "BILLING_NOT_FOUND";
    public static final String BILLING_NOT_FOUND_MESSAGE = "No se encontrĂ³ el pago";
    public static final String BILLING_NOT_FOUND_SOLUTION = "Verifique los datos";

    public static final String ARGUMENT_NOT_VALID_API_CODE = "402";
    public static final String ARGUMENT_NOT_VALID_ERROR = "ARGUMENT_NOT_VALID";
    public static final String ARGUMENT_NOT_VALID_SOLUTION = "Verifique los datos";
}
