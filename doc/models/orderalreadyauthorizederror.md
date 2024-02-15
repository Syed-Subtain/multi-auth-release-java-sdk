
# ORDERALREADYAUTHORIZEDERROR

## Structure

`ORDERALREADYAUTHORIZEDERROR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`OrderAlreadyAuthorized1IssueEnum`](../../doc/models/order-already-authorized-1-issue-enum.md) | Optional | - | OrderAlreadyAuthorized1IssueEnum getIssue() | setIssue(OrderAlreadyAuthorized1IssueEnum issue) |
| `Description` | [`OrderAlreadyAuthorized1DescriptionEnum`](../../doc/models/order-already-authorized-1-description-enum.md) | Optional | - | OrderAlreadyAuthorized1DescriptionEnum getDescription() | setDescription(OrderAlreadyAuthorized1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "ORDER_ALREADY_AUTHORIZED",
  "description": "Order already authorized.If 'intent=AUTHORIZE' only one authorization per order is allowed."
}
```

