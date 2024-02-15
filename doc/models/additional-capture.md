
# Additional Capture

A captured payment.

## Structure

`AdditionalCapture`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Status` | [`CaptureStatusStatusEnum`](../../doc/models/capture-status-status-enum.md) | Optional | The status of the captured payment. | CaptureStatusStatusEnum getStatus() | setStatus(CaptureStatusStatusEnum status) |
| `StatusDetails` | [`CaptureStatusDetails`](../../doc/models/capture-status-details.md) | Optional | The details of the captured payment status. | CaptureStatusDetails getStatusDetails() | setStatusDetails(CaptureStatusDetails statusDetails) |
| `Id` | `String` | Optional | The PayPal-generated ID for the captured payment. | String getId() | setId(String id) |
| `Amount` | [`Money`](../../doc/models/money.md) | Optional | The amount for this captured payment. | Money getAmount() | setAmount(Money amount) |
| `InvoiceId` | `String` | Optional | The API caller-provided external invoice number for this order. Appears in both the payer's transaction history and the emails that the payer receives. | String getInvoiceId() | setInvoiceId(String invoiceId) |
| `CustomId` | `String` | Optional | The API caller-provided external ID. Used to reconcile API caller-initiated transactions with PayPal transactions. Appears in transaction and settlement reports.<br>**Constraints**: *Maximum Length*: `127` | String getCustomId() | setCustomId(String customId) |
| `NetworkTransactionReference` | [`NetworkTransactionReference1`](../../doc/models/network-transaction-reference-1.md) | Optional | Reference values used by the card network to identify a transaction. | NetworkTransactionReference1 getNetworkTransactionReference() | setNetworkTransactionReference(NetworkTransactionReference1 networkTransactionReference) |
| `SellerProtection` | [`SellerProtection`](../../doc/models/seller-protection.md) | Optional | - | SellerProtection getSellerProtection() | setSellerProtection(SellerProtection sellerProtection) |
| `FinalCapture` | `Boolean` | Optional | Indicates whether you can make additional captures against the authorized payment. Set to `true` if you do not intend to capture additional payments against the authorization. Set to `false` if you intend to capture additional payments against the authorization.<br>**Default**: `false` | Boolean getFinalCapture() | setFinalCapture(Boolean finalCapture) |
| `SellerReceivableBreakdown` | [`SellerReceivableBreakdown`](../../doc/models/seller-receivable-breakdown.md) | Optional | - | SellerReceivableBreakdown getSellerReceivableBreakdown() | setSellerReceivableBreakdown(SellerReceivableBreakdown sellerReceivableBreakdown) |
| `DisbursementMode` | [`DisbursementModeEnum`](../../doc/models/disbursement-mode-enum.md) | Optional | The funds that are held on behalf of the merchant.<br>**Default**: `DisbursementModeEnum.INSTANT`<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `16`, *Pattern*: `^[A-Z_]+$` | DisbursementModeEnum getDisbursementMode() | setDisbursementMode(DisbursementModeEnum disbursementMode) |
| `Links` | [`List<LinkDescription>`](../../doc/models/link-description.md) | Optional | An array of related [HATEOAS links](/docs/api/reference/api-responses/#hateoas-links). | List<LinkDescription> getLinks() | setLinks(List<LinkDescription> links) |
| `ProcessorResponse` | [`ProcessorResponse`](../../doc/models/processor-response.md) | Optional | An object that provides additional processor information for a direct credit card transaction. | ProcessorResponse getProcessorResponse() | setProcessorResponse(ProcessorResponse processorResponse) |
| `CreateTime` | `String` | Optional | The date and time when the transaction occurred, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).<br>**Constraints**: *Minimum Length*: `20`, *Maximum Length*: `64`, *Pattern*: `^[0-9]{4}-(0[1-9]\|1[0-2])-(0[1-9]\|[1-2][0-9]\|3[0-1])[T,t]([0-1][0-9]\|2[0-3]):[0-5][0-9]:([0-5][0-9]\|60)([.][0-9]+)?([Zz]\|[+-][0-9]{2}:[0-9]{2})$` | String getCreateTime() | setCreateTime(String createTime) |
| `UpdateTime` | `String` | Optional | The date and time when the transaction was last updated, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).<br>**Constraints**: *Minimum Length*: `20`, *Maximum Length*: `64`, *Pattern*: `^[0-9]{4}-(0[1-9]\|1[0-2])-(0[1-9]\|[1-2][0-9]\|3[0-1])[T,t]([0-1][0-9]\|2[0-3]):[0-5][0-9]:([0-5][0-9]\|60)([.][0-9]+)?([Zz]\|[+-][0-9]{2}:[0-9]{2})$` | String getUpdateTime() | setUpdateTime(String updateTime) |
| `SupplementaryData` | [`SupplementaryData1`](../../doc/models/supplementary-data-1.md) | Optional | An object that provides supplementary/additional data related to a payment transaction. | SupplementaryData1 getSupplementaryData() | setSupplementaryData(SupplementaryData1 supplementaryData) |
| `Payee` | [`SupplementaryData1`](../../doc/models/supplementary-data-1.md) | Optional | The details associated with the merchant for this transaction. | SupplementaryData1 getPayee() | setPayee(SupplementaryData1 payee) |

## Example (as JSON)

```json
{
  "final_capture": false,
  "disbursement_mode": "INSTANT",
  "status": "PARTIALLY_REFUNDED",
  "status_details": {
    "reason": "CHARGEBACK"
  },
  "id": "id2",
  "amount": {
    "currency_code": "currency_code6",
    "value": "value0"
  },
  "invoice_id": "invoice_id2"
}
```

