package cash.xcl.api.dto;

import net.openhft.chronicle.bytes.BytesIn;
import net.openhft.chronicle.bytes.BytesOut;

public class DepositValueCommand extends TransferValueCommand {
    String description;

    @Override
    protected void readMarshallable2(BytesIn<?> bytes) {
        super.readMarshallable2(bytes);
        description = bytes.readUtf8();
    }

    @Override
    protected void writeMarshallable2(BytesOut<?> bytes) {
        super.writeMarshallable2(bytes);
        bytes.writeUtf8(description);
    }

    @Override
    public int messageType() {
        return MessageTypes.DEPOSIT_VALUE_COMMAND;
    }

    public String description() {
        return description;
    }

    public DepositValueCommand description(String description) {
        this.description = description;
        return this;
    }
}
