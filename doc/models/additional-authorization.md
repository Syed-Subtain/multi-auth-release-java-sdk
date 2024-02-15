
# Additional Authorization

The authorized payment transaction.

## Structure

`AdditionalAuthorization`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Status` | [`AuthorizationStatusStatusEnum`](../../doc/models/authorization-status-status-enum.md) | Optional | The status for the authorized payment. | AuthorizationStatusStatusEnum getStatus() | setStatus(AuthorizationStatusStatusEnum status) |
| `StatusDetails` | [`AuhorizationStatusDetails`](../../doc/models/auhorization-status-details.md) | Optional | The details of the authorized order pending status. | AuhorizationStatusDetails getStatusDetails() | setStatusDetails(AuhorizationStatusDetails statusDetails) |
| `Id` | `String` | Optional | The PayPal-generated ID for the authorized payment. | String getId() | setId(String id) |
| `Amount` | [`Money`](../../doc/models/money.md) | Optional | The amount for this authorized payment. | Money getAmount() | setAmount(Money amount) |
| `InvoiceId` | `String` | Optional | The API caller-provided external invoice number for this order. Appears in both the payer's transaction history and the emails that the payer receives. | String getInvoiceId() | setInvoiceId(String invoiceId) |
| `CustomId` | `String` | Optional | The API caller-provided external ID. Used to reconcile API caller-initiated transactions with PayPal transactions. Appears in transaction and settlement reports.<br>**Constraints**: *Maximum Length*: `127` | String getCustomId() | setCustomId(String customId) |
| `NetworkTransactionReference` | [`NetworkTransactionReference1`](../../doc/models/network-transaction-reference-1.md) | Optional | Reference values used by the card network to identify a transaction. | NetworkTransactionReference1 getNetworkTransactionReference() | setNetworkTransactionReference(NetworkTransactionReference1 networkTransactionReference) |
| `SellerProtection` | [`SellerProtection`](../../doc/models/seller-protection.md) | Optional | - | SellerProtection getSellerProtection() | setSellerProtection(SellerProtection sellerProtection) |
| `ExpirationTime` | `String` | Optional | The date and time when the authorized payment expires, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).<br>**Constraints**: *Minimum Length*: `20`, *Maximum Length*: `64`, *Pattern*: `^[0-9]{4}-(0[1-9]\|1[0-2])-(0[1-9]\|[1-2][0-9]\|3[0-1])[T,t]([0-1][0-9]\|2[0-3]):[0-5][0-9]:([0-5][0-9]\|60)([.][0-9]+)?([Zz]\|[+-][0-9]{2}:[0-9]{2})$` | String getExpirationTime() | setExpirationTime(String expirationTime) |
| `Links` | [`List<LinkDescription>`](../../doc/models/link-description.md) | Optional | An array of related [HATEOAS links](/docs/api/reference/api-responses/#hateoas-links). | List<LinkDescription> getLinks() | setLinks(List<LinkDescription> links) |
| `CreateTime` | `String` | Optional | The date and time when the transaction occurred, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).<br>**Constraints**: *Minimum Length*: `20`, *Maximum Length*: `64`, *Pattern*: `^[0-9]{4}-(0[1-9]\|1[0-2])-(0[1-9]\|[1-2][0-9]\|3[0-1])[T,t]([0-1][0-9]\|2[0-3]):[0-5][0-9]:([0-5][0-9]\|60)([.][0-9]+)?([Zz]\|[+-][0-9]{2}:[0-9]{2})$` | String getCreateTime() | setCreateTime(String createTime) |
| `UpdateTime` | `String` | Optional | The date and time when the transaction was last updated, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).<br>**Constraints**: *Minimum Length*: `20`, *Maximum Length*: `64`, *Pattern*: `^[0-9]{4}-(0[1-9]\|1[0-2])-(0[1-9]\|[1-2][0-9]\|3[0-1])[T,t]([0-1][0-9]\|2[0-3]):[0-5][0-9]:([0-5][0-9]\|60)([.][0-9]+)?([Zz]\|[+-][0-9]{2}:[0-9]{2})$` | String getUpdateTime() | setUpdateTime(String updateTime) |
| `SupplementaryData` | [`SupplementaryData1`](../../doc/models/supplementary-data-1.md) | Optional | An object that provides supplementary/additional data related to a payment transaction. | SupplementaryData1 getSupplementaryData() | setSupplementaryData(SupplementaryData1 supplementaryData) |
| `Payee` | [`MerchantBase`](../../doc/models/merchant-base.md) | Optional | The details associated with the merchant for this transaction. | MerchantBase getPayee() | setPayee(MerchantBase payee) |

## Example (as JSON)

```json
{
  "status": "DENIED",
  "status_details": {
    "reason": "PENDING_REVIEW"
  },
  "id": "id6",
  "amount": {
    "currency_code": "currency_code6",
    "value": "value0"
  },
  "invoice_id": "invoice_id4"
}
```

