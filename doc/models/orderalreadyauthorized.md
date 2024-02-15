
# ORDERALREADYAUTHORIZED

## Structure

`ORDERALREADYAUTHORIZED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`OrderAlreadyAuthorizedIssueEnum`](../../doc/models/order-already-authorized-issue-enum.md) | Optional | - | OrderAlreadyAuthorizedIssueEnum getIssue() | setIssue(OrderAlreadyAuthorizedIssueEnum issue) |
| `Description` | [`OrderAlreadyAuthorizedDescriptionEnum`](../../doc/models/order-already-authorized-description-enum.md) | Optional | - | OrderAlreadyAuthorizedDescriptionEnum getDescription() | setDescription(OrderAlreadyAuthorizedDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "ORDER_ALREADY_AUTHORIZED",
  "description": "Order already captured. If 'intent=CAPTURE' only one capture per order is allowed."
}
```

