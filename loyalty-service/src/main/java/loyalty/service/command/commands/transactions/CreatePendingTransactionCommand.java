package loyalty.service.command.commands.transactions;

import lombok.Builder;
import lombok.Getter;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Getter
@Builder
public class CreatePendingTransactionCommand {

    @TargetAggregateIdentifier
    private String loyaltyBankId;
    private int points;
}
