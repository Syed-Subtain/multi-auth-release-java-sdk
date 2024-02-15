
# Refund Allof 1

## Structure

`RefundAllof1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | The PayPal-generated ID for the refund. | String getId() | setId(String id) |
| `Amount` | [`Money`](../../doc/models/money.md) | Optional | The amount that the payee refunded to the payer. | Money getAmount() | setAmount(Money amount) |
| `InvoiceId` | `String` | Optional | The API caller-provided external invoice number for this order. Appears in both the payer's transaction history and the emails that the payer receives. | String getInvoiceId() | setInvoiceId(String invoiceId) |
| `CustomId` | `String` | Optional | The API caller-provided external ID. Used to reconcile API caller-initiated transactions with PayPal transactions. Appears in transaction and settlement reports.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `127`, *Pattern*: `^[A-Za-z0-9-_.,]*$` | String getCustomId() | setCustomId(String customId) |
| `AcquirerReferenceNumber` | `String` | Optional | Reference ID issued for the card transaction. This ID can be used to track the transaction across processors, card brands and issuing banks.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `36`, *Pattern*: `^[a-zA-Z0-9]+$` | String getAcquirerReferenceNumber() | setAcquirerReferenceNumber(String acquirerReferenceNumber) |
| `NoteToPayer` | `String` | Optional | The reason for the refund. Appears in both the payer's transaction history and the emails that the payer receives. | String getNoteToPayer() | setNoteToPayer(String noteToPayer) |
| `SellerPayableBreakdown` | [`MerchantPayableBreakdown`](../../doc/models/merchant-payable-breakdown.md) | Optional | The breakdown of the refund. | MerchantPayableBreakdown getSellerPayableBreakdown() | setSellerPayableBreakdown(MerchantPayableBreakdown sellerPayableBreakdown) |
| `Payer` | [`MerchantBase`](../../doc/models/merchant-base.md) | Optional | The details associated with the merchant for this transaction. | MerchantBase getPayer() | setPayer(MerchantBase payer) |
| `Links` | [`List<LinkDescription>`](../../doc/models/link-description.md) | Optional | An array of related [HATEOAS links](/docs/api/reference/api-responses/#hateoas-links). | List<LinkDescription> getLinks() | setLinks(List<LinkDescription> links) |

## Example (as JSON)

```json
{
  "id": "id6",
  "amount": {
    "currency_code": "currency_code6",
    "value": "value0"
  },
  "invoice_id": "invoice_id6",
  "custom_id": "custom_id4",
  "acquirer_reference_number": "acquirer_reference_number8"
}
```

