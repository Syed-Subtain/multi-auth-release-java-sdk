
# ORDERCOMPLETEDORVOIDED

## Structure

`ORDERCOMPLETEDORVOIDED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`OrderCompletedOrVoidedIssueEnum`](../../doc/models/order-completed-or-voided-issue-enum.md) | Optional | - | OrderCompletedOrVoidedIssueEnum getIssue() | setIssue(OrderCompletedOrVoidedIssueEnum issue) |
| `Description` | [`OrderCompletedOrVoidedDescriptionEnum`](../../doc/models/order-completed-or-voided-description-enum.md) | Optional | - | OrderCompletedOrVoidedDescriptionEnum getDescription() | setDescription(OrderCompletedOrVoidedDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "ORDER_COMPLETED_OR_VOIDED",
  "description": "Order is voided or completed and hence cannot be authorized."
}
```

