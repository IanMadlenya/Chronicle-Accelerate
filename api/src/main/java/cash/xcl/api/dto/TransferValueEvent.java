package cash.xcl.api.dto;

import net.openhft.chronicle.bytes.Bytes;
import net.openhft.chronicle.bytes.BytesIn;
import net.openhft.chronicle.bytes.BytesOut;

public class TransferValueEvent extends SignedMessage {

    private TransferValueCommand transferValueCommand = new TransferValueCommand();

    public TransferValueEvent(long sourceAddress, long eventTime, TransferValueCommand transferValueCommand) {
        super(sourceAddress, eventTime);
        this.transferValueCommand = transferValueCommand;
    }

    public TransferValueEvent() {
        super();
    }

    @Override
    protected void readMarshallable2(BytesIn<?> bytes) {
        transferValueCommand = ((Bytes<?>) bytes).readMarshallableLength16(TransferValueCommand.class, transferValueCommand);
    }

    @Override
    protected void writeMarshallable2(BytesOut<?> bytes) {
        bytes.writeMarshallableLength16(transferValueCommand);
    }

    @Override
    public int messageType() {
        return MessageTypes.TRANSFER_VALUE_EVENT;
    }

    public TransferValueCommand transferValueCommand() {
        return transferValueCommand;
    }

    public TransferValueEvent transferValueCommand(TransferValueCommand transferValueCommand) {
        this.transferValueCommand = transferValueCommand;
        return this;
    }
}
