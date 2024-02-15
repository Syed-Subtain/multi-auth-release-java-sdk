
# Authorization 2 Allof 1

## Structure

`Authorization2Allof1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SupplementaryData` | [`SupplementaryData1`](../../doc/models/supplementary-data-1.md) | Optional | An object that provides supplementary/additional data related to a payment transaction. | SupplementaryData1 getSupplementaryData() | setSupplementaryData(SupplementaryData1 supplementaryData) |
| `Payee` | [`MerchantBase`](../../doc/models/merchant-base.md) | Optional | The details associated with the merchant for this transaction. | MerchantBase getPayee() | setPayee(MerchantBase payee) |

## Example (as JSON)

```json
{
  "supplementary_data": {
    "related_ids": {
      "order_id": "order_id2",
      "authorization_id": "authorization_id0",
      "capture_id": "capture_id0"
    }
  },
  "payee": {
    "email_address": "email_address4",
    "merchant_id": "merchant_id6"
  }
}
```

