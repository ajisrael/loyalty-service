package loyalty.service.core.events.transactions;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class AwardedTransactionCreatedEvent extends AbstractTransactionEvent {
}