
# Error Details 11

The error details. Required for client-side `4XX` errors.

## Structure

`ErrorDetails11`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Field` | `String` | Optional | The field that caused the error. If this field is in the body, set this value to the field's JSON pointer value. Required for client-side errors. | String getField() | setField(String field) |
| `Value` | `String` | Optional | The value of the field that caused the error. | String getValue() | setValue(String value) |
| `Location` | `String` | Optional | The location of the field that caused the error. Value is `body`, `path`, or `query`.<br>**Default**: `"body"` | String getLocation() | setLocation(String location) |
| `Issue` | `String` | Required, Constant | The unique, fine-grained application-level error code.<br>**Default**: `"PERMISSION_DENIED"` | String getIssue() | setIssue(String issue) |
| `Description` | [`PermissionDeniedDescriptionEnum`](../../doc/models/permission-denied-description-enum.md) | Optional | The human-readable description for an issue. The description can change over the lifetime of an API, so clients must not depend on this value. | PermissionDeniedDescriptionEnum getDescription() | setDescription(PermissionDeniedDescriptionEnum description) |

## Example (as JSON)

```json
{
  "location": "body",
  "issue": "PERMISSION_DENIED",
  "field": "field4",
  "value": "value2",
  "description": "You do not have permission to access or perform operations on this resource."
}
```

