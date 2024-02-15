
# ORDERALREADYCAPTUREDERROR

## Structure

`ORDERALREADYCAPTUREDERROR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`OrderAlreadyCaptured1IssueEnum`](../../doc/models/order-already-captured-1-issue-enum.md) | Optional | - | OrderAlreadyCaptured1IssueEnum getIssue() | setIssue(OrderAlreadyCaptured1IssueEnum issue) |
| `Description` | [`OrderAlreadyCaptured1DescriptionEnum`](../../doc/models/order-already-captured-1-description-enum.md) | Optional | - | OrderAlreadyCaptured1DescriptionEnum getDescription() | setDescription(OrderAlreadyCaptured1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "ORDER_ALREADY_CAPTURED",
  "description": "Order already captured.If 'intent=CAPTURE' only one capture per order is allowed."
}
```

