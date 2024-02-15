
# ITEMCATEGORYNOTSUPPORTEDBYPAYMENTSOURCE

## Structure

`ITEMCATEGORYNOTSUPPORTEDBYPAYMENTSOURCE`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`ItemCategoryNotSupportedPaymentSourceEnum`](../../doc/models/item-category-not-supported-payment-source-enum.md) | Optional | - | ItemCategoryNotSupportedPaymentSourceEnum getIssue() | setIssue(ItemCategoryNotSupportedPaymentSourceEnum issue) |
| `Description` | [`PaymentSourceDoesNotSupportItemCategoryEnum`](../../doc/models/payment-source-does-not-support-item-category-enum.md) | Optional | - | PaymentSourceDoesNotSupportItemCategoryEnum getDescription() | setDescription(PaymentSourceDoesNotSupportItemCategoryEnum description) |

## Example (as JSON)

```json
{
  "issue": "ITEM_CATEGORY_NOT_SUPPORTED_BY_PAYMENT_SOURCE",
  "description": "The provided payment source does not support provided item category."
}
```

