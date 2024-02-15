
# Orders Confirm 422 Issues Items

## Structure

`OrdersConfirm422IssuesItems`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`OrderAlreadyCapturedIssueEnum`](../../doc/models/order-already-captured-issue-enum.md) | Optional | - | OrderAlreadyCapturedIssueEnum getIssue() | setIssue(OrderAlreadyCapturedIssueEnum issue) |
| `Description` | [`OrderAlreadyCapturedDescriptionEnum`](../../doc/models/order-already-captured-description-enum.md) | Optional | - | OrderAlreadyCapturedDescriptionEnum getDescription() | setDescription(OrderAlreadyCapturedDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "ORDER_ALREADY_CAPTURED",
  "description": "Order already captured. If 'intent=CAPTURE' only one capture per order is allowed."
}
```

