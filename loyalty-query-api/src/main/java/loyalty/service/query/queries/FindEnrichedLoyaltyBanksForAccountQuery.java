package loyalty.service.query.queries;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class FindEnrichedLoyaltyBanksForAccountQuery extends AbstractQuery {

    private String accountId;
}
