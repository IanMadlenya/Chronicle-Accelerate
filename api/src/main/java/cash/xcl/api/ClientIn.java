package cash.xcl.api;

import cash.xcl.api.dto.*;

/**
 * Any responses from the Server to the client needed, in addition to ServerOut.
 * <p>
 * Includes all Responses and any events which are expected to go back to a client.
 * In some cases the client may monitor Commands coming from the ServerOut
 */
public interface ClientIn {

    void commandFailedEvent(CommandFailedEvent commandFailedEvent);

    void queryFailedResponse(QueryFailedResponse queryFailedResponse);

    void createNewAddressEvent(CreateNewAddressEvent createNewAddressEvent);

    void transferValueEvent(TransferValueEvent transferValueEvent);

    void clusterTransferStep3Event(ClusterTransferStep3Event clusterTransferStep3Event);

    void depositValueEvent(DepositValueEvent depositValueEvent);

    void withdrawValueEvent(WithdrawValueEvent withdrawValueEvent);

    void executionReportEvent(ExecutionReportEvent executionReportEvent);

    // Responses
    void subscriptionSuccessResponse(SubscriptionSuccessResponse subscriptionSuccessResponse);

    void clusterStatusResponse(ClusterStatusResponse clusterStatusResponse);

    void clustersStatusResponse(ClustersStatusResponse clustersStatusResponse);

    void currentBalanceResponse(CurrentBalanceResponse currentBalanceResponse);

    void exchangeRateResponse(ExchangeRateResponse exchangeRateResponse);


}
