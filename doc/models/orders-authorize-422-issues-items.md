
# Orders Authorize 422 Issues Items

## Structure

`OrdersAuthorize422IssuesItems`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`ActionDoesNotMatchIntentIssueEnum`](../../doc/models/action-does-not-match-intent-issue-enum.md) | Optional | - | ActionDoesNotMatchIntentIssueEnum getIssue() | setIssue(ActionDoesNotMatchIntentIssueEnum issue) |
| `Description` | [`ActionDoesNotMatchIntentDescriptionEnum`](../../doc/models/action-does-not-match-intent-description-enum.md) | Optional | - | ActionDoesNotMatchIntentDescriptionEnum getDescription() | setDescription(ActionDoesNotMatchIntentDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "ACTION_DOES_NOT_MATCH_INTENT",
  "description": "Order was created with an intent to 'CAPTURE'. Please use v2/checkout/orders/order_id/capture to complete the transaction or alternately Create an order with an intent of 'AUTHORIZE'."
}
```

