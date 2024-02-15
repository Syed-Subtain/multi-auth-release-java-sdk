
# Error Details 141

The error details. Required for client-side `4XX` errors.

## Structure

`ErrorDetails141`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Field` | `String` | Optional | The field that caused the error. If this field is in the body, set this value to the field's JSON pointer value. Required for client-side errors. | String getField() | setField(String field) |
| `Value` | `String` | Optional | The value of the field that caused the error. | String getValue() | setValue(String value) |
| `Location` | `String` | Optional | The location of the field that caused the error. Value is `body`, `path`, or `query`.<br>**Default**: `"body"` | String getLocation() | setLocation(String location) |
| `Issue` | `String` | Required, Constant | The unique, fine-grained application-level error code.<br>**Default**: `"PREVIOUS_REQUEST_IN_PROGRESS"` | String getIssue() | setIssue(String issue) |
| `Description` | [`PreviousRequestInProgressDescription1Enum`](../../doc/models/previous-request-in-progress-description-1-enum.md) | Optional | The human-readable description for an issue. The description can change over the lifetime of an API, so clients must not depend on this value. | PreviousRequestInProgressDescription1Enum getDescription() | setDescription(PreviousRequestInProgressDescription1Enum description) |

## Example (as JSON)

```json
{
  "location": "body",
  "issue": "PREVIOUS_REQUEST_IN_PROGRESS",
  "field": "field4",
  "value": "value2",
  "description": "A previous request on this resource is currently in progress. Please wait for sometime and try again. It is best to space out the initial and the subsequent request(s) to avoid receiving this error."
}
```

