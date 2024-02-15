
# Capture Allof 1

## Structure

`CaptureAllof1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | The PayPal-generated ID for the captured payment. | String getId() | setId(String id) |
| `Amount` | [`Money`](../../doc/models/money.md) | Optional | The amount for this captured payment. | Money getAmount() | setAmount(Money amount) |
| `InvoiceId` | `String` | Optional | The API caller-provided external invoice number for this order. Appears in both the payer's transaction history and the emails that the payer receives. | String getInvoiceId() | setInvoiceId(String invoiceId) |
| `CustomId` | `String` | Optional | The API caller-provided external ID. Used to reconcile API caller-initiated transactions with PayPal transactions. Appears in transaction and settlement reports.<br>**Constraints**: *Maximum Length*: `127` | String getCustomId() | setCustomId(String customId) |
| `NetworkTransactionReference` | [`NetworkTransactionReference`](../../doc/models/network-transaction-reference.md) | Optional | Reference values used by the card network to identify a transaction. | NetworkTransactionReference getNetworkTransactionReference() | setNetworkTransactionReference(NetworkTransactionReference networkTransactionReference) |
| `SellerProtection` | [`SellerProtection`](../../doc/models/seller-protection.md) | Optional | - | SellerProtection getSellerProtection() | setSellerProtection(SellerProtection sellerProtection) |
| `FinalCapture` | `Boolean` | Optional | Indicates whether you can make additional captures against the authorized payment. Set to `true` if you do not intend to capture additional payments against the authorization. Set to `false` if you intend to capture additional payments against the authorization.<br>**Default**: `false` | Boolean getFinalCapture() | setFinalCapture(Boolean finalCapture) |
| `SellerReceivableBreakdown` | [`SellerReceivableBreakdown`](../../doc/models/seller-receivable-breakdown.md) | Optional | - | SellerReceivableBreakdown getSellerReceivableBreakdown() | setSellerReceivableBreakdown(SellerReceivableBreakdown sellerReceivableBreakdown) |
| `DisbursementMode` | [`DisbursementModeEnum`](../../doc/models/disbursement-mode-enum.md) | Optional | The funds that are held on behalf of the merchant.<br>**Default**: `DisbursementModeEnum.INSTANT`<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `16`, *Pattern*: `^[A-Z_]+$` | DisbursementModeEnum getDisbursementMode() | setDisbursementMode(DisbursementModeEnum disbursementMode) |
| `Links` | [`List<LinkDescription>`](../../doc/models/link-description.md) | Optional | An array of related [HATEOAS links](/docs/api/reference/api-responses/#hateoas-links). | List<LinkDescription> getLinks() | setLinks(List<LinkDescription> links) |
| `ProcessorResponse` | [`ProcessorResponse`](../../doc/models/processor-response.md) | Optional | An object that provides additional processor information for a direct credit card transaction. | ProcessorResponse getProcessorResponse() | setProcessorResponse(ProcessorResponse processorResponse) |

## Example (as JSON)

```json
{
  "final_capture": false,
  "disbursement_mode": "INSTANT",
  "id": "id2",
  "amount": {
    "currency_code": "currency_code6",
    "value": "value0"
  },
  "invoice_id": "invoice_id2",
  "custom_id": "custom_id0",
  "network_transaction_reference": {
    "id": "id8",
    "date": "date6",
    "network": "SWITCH",
    "acquirer_reference_number": "acquirer_reference_number0"
  }
}
```

