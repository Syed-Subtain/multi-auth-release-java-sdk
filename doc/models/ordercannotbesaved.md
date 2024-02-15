
# ORDERCANNOTBESAVED

## Structure

`ORDERCANNOTBESAVED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`OrderCannotBeSavedIssueEnum`](../../doc/models/order-cannot-be-saved-issue-enum.md) | Optional | - | OrderCannotBeSavedIssueEnum getIssue() | setIssue(OrderCannotBeSavedIssueEnum issue) |
| `Description` | [`OrderCannotBeSavedDescriptionEnum`](../../doc/models/order-cannot-be-saved-description-enum.md) | Optional | - | OrderCannotBeSavedDescriptionEnum getDescription() | setDescription(OrderCannotBeSavedDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "ORDER_CANNOT_BE_SAVED",
  "description": "The option to save an order is only available if the `intent` is AUTHORIZE and `processing_instruction` uses one of the `ORDER_SAVED` options. For example, `intent`=AUTHORIZE, `processing_instruction`=ORDER_SAVED_EXPLICITLY. Please change the intent and/or processing_instruction` and try again."
}
```

