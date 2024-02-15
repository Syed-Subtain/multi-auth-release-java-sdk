
# Cobranded Card Object

Details about the merchant cobranded card used for order purchase.

## Structure

`CobrandedCardObject`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Labels` | `List<String>` | Optional | Array of labels for the cobranded card.<br>**Constraints**: *Minimum Items*: `1`, *Maximum Items*: `25`, *Minimum Length*: `1`, *Maximum Length*: `256` | List<String> getLabels() | setLabels(List<String> labels) |
| `Payee` | [`MerchantBase`](../../doc/models/merchant-base.md) | Optional | Merchant associated with the purchase. | MerchantBase getPayee() | setPayee(MerchantBase payee) |
| `Amount` | [`Money`](../../doc/models/money.md) | Optional | Amount that was charged to the cobranded card. | Money getAmount() | setAmount(Money amount) |

## Example (as JSON)

```json
{
  "labels": [
    "labels6",
    "labels7",
    "labels8"
  ],
  "payee": {
    "email_address": "email_address4",
    "merchant_id": "merchant_id6"
  },
  "amount": {
    "currency_code": "currency_code6",
    "value": "value0"
  }
}
```

