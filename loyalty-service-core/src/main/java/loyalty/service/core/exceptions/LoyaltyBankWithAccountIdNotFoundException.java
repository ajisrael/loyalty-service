package loyalty.service.core.exceptions;

import static loyalty.service.core.constants.ExceptionMessages.LOYALTY_BANK_WITH_ACCOUNT_ID_DOES_NOT_EXIST;

public class LoyaltyBankWithAccountIdNotFoundException extends RuntimeException {
    public LoyaltyBankWithAccountIdNotFoundException(String accountId) {
        super(String.format(LOYALTY_BANK_WITH_ACCOUNT_ID_DOES_NOT_EXIST, accountId));
    }
}
