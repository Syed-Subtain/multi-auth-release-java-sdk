
# Error Details 17

The error details. Required for client-side `4XX` errors.

## Structure

`ErrorDetails17`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Field` | `String` | Optional | The field that caused the error. If this field is in the body, set this value to the field's JSON pointer value. Required for client-side errors. | String getField() | setField(String field) |
| `Value` | `String` | Optional | The value of the field that caused the error. | String getValue() | setValue(String value) |
| `Location` | `String` | Optional | The location of the field that caused the error. Value is `body`, `path`, or `query`.<br>**Default**: `"body"` | String getLocation() | setLocation(String location) |
| `Issue` | `String` | Required, Constant | The unique, fine-grained application-level error code.<br>**Default**: `"ACTION_DOES_NOT_MATCH_INTENT"` | String getIssue() | setIssue(String issue) |
| `Description` | [`ActionDoesNotMatchIntentDescription2Enum`](../../doc/models/action-does-not-match-intent-description-2-enum.md) | Optional | The human-readable description for an issue. The description can change over the lifetime of an API, so clients must not depend on this value. | ActionDoesNotMatchIntentDescription2Enum getDescription() | setDescription(ActionDoesNotMatchIntentDescription2Enum description) |

## Example (as JSON)

```json
{
  "location": "body",
  "issue": "ACTION_DOES_NOT_MATCH_INTENT",
  "field": "field6",
  "value": "value4",
  "description": "Order was created with an intent to 'CAPTURE'. Please use v2/checkout/orders/order_id/capture to complete the transaction or alternately Create an order with an intent of 'AUTHORIZE'."
}
```

