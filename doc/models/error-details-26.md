
# Error Details 26

The error details. Required for client-side `4XX` errors.

## Structure

`ErrorDetails26`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Field` | `String` | Optional | The field that caused the error. If this field is in the body, set this value to the field's JSON pointer value. Required for client-side errors. | String getField() | setField(String field) |
| `Value` | `String` | Optional | The value of the field that caused the error. | String getValue() | setValue(String value) |
| `Location` | `String` | Optional | The location of the field that caused the error. Value is `body`, `path`, or `query`.<br>**Default**: `"body"` | String getLocation() | setLocation(String location) |
| `Issue` | `String` | Required, Constant | The unique, fine-grained application-level error code.<br>**Default**: `"CAPTURE_STATUS_NOT_VALID"` | String getIssue() | setIssue(String issue) |
| `Description` | [`CaptureStatusNotValidDescription2Enum`](../../doc/models/capture-status-not-valid-description-2-enum.md) | Optional | The human-readable description for an issue. The description can change over the lifetime of an API, so clients must not depend on this value. | CaptureStatusNotValidDescription2Enum getDescription() | setDescription(CaptureStatusNotValidDescription2Enum description) |

## Example (as JSON)

```json
{
  "location": "body",
  "issue": "CAPTURE_STATUS_NOT_VALID",
  "field": "field2",
  "value": "value6",
  "description": "Invalid capture status. Tracker information can only be added to captures in `COMPLETED` state."
}
```

