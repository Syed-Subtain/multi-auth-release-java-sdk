
# ORDERALREADYCOMPLETED

## Structure

`ORDERALREADYCOMPLETED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`OrderAlreadyCompletedIssueEnum`](../../doc/models/order-already-completed-issue-enum.md) | Optional | - | OrderAlreadyCompletedIssueEnum getIssue() | setIssue(OrderAlreadyCompletedIssueEnum issue) |
| `Description` | [`OrderAlreadyCompletedDescriptionEnum`](../../doc/models/order-already-completed-description-enum.md) | Optional | - | OrderAlreadyCompletedDescriptionEnum getDescription() | setDescription(OrderAlreadyCompletedDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "ORDER_ALREADY_COMPLETED",
  "description": "The order cannot be patched after it is completed."
}
```

