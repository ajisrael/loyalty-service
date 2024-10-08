package loyalty.service.core.constants;

public class DomainConstants {

    private DomainConstants() {
        throw new IllegalStateException("Constants class");
    }
    public static final String ACCOUNT = "Account";
    public static final String LOYALTY_BANK = "Loyalty Bank";
    public static final String BUSINESS = "Business";
    public static final String PAYMENT_ID = "Payment id";
    public static final String PENDING = "Pending";
    public static final String EARNED = "Earned";
    public static final String AUTHORIZED = "Authorized";
    public static final String CAPTURED = "Captured";

    public static final String REQUEST_ID = "requestId";
    public static final String REQUESTED_POINTS = "requestedPoints";
    public static final String VOID = "void";
    public static final String CAPTURE = "capture";

    public static final String DEFAULT_PAGE = "0";
    public static final String DEFAULT_PAGE_SIZE = "20";
}
