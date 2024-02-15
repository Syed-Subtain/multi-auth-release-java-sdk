
# ORDEREXPIRED

## Structure

`ORDEREXPIRED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`OrderExpiredIssueEnum`](../../doc/models/order-expired-issue-enum.md) | Optional | - | OrderExpiredIssueEnum getIssue() | setIssue(OrderExpiredIssueEnum issue) |
| `Description` | [`OrderExpiredDescriptionEnum`](../../doc/models/order-expired-description-enum.md) | Optional | - | OrderExpiredDescriptionEnum getDescription() | setDescription(OrderExpiredDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "ORDER_EXPIRED",
  "description": "Order is expired and hence cannot be authorized. Please contact Customer Support if you need to increase your order validity period."
}
```

