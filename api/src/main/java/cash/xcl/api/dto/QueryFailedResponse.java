package cash.xcl.api.dto;

/**
 * A generic application message has been reported.  These should be used as little as possible as they cannot be easily processed downstream.
 */
public class QueryFailedResponse extends SignedErrorMessage {

    public QueryFailedResponse(long sourceAddress, long eventTime, SignedMessage orig, String reason) {
        super(sourceAddress, eventTime, orig, reason);
    }

    public QueryFailedResponse(long sourceAddress, long eventTime, long origSourceAddress, long origEventTime, int origMessageType, String reason) {
        super(sourceAddress, eventTime, origSourceAddress, origEventTime, origMessageType, reason);
    }

    public QueryFailedResponse() {

    }

    @Override
    public int messageType() {
        return MessageTypes.QUERY_FAILED_RESPONSE;
    }
}
