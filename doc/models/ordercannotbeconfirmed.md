
# ORDERCANNOTBECONFIRMED

## Structure

`ORDERCANNOTBECONFIRMED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`OrderCannotBeConfirmedIssueEnum`](../../doc/models/order-cannot-be-confirmed-issue-enum.md) | Optional | - | OrderCannotBeConfirmedIssueEnum getIssue() | setIssue(OrderCannotBeConfirmedIssueEnum issue) |
| `Description` | [`OrderCannotBeConfirmedDescriptionEnum`](../../doc/models/order-cannot-be-confirmed-description-enum.md) | Optional | - | OrderCannotBeConfirmedDescriptionEnum getDescription() | setDescription(OrderCannotBeConfirmedDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "ORDER_CANNOT_BE_CONFIRMED",
  "description": "An order with status = 'COMPLETED' cannot be confirmed again."
}
```

