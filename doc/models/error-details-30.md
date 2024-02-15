
# Error Details 30

The error details. Required for client-side `4XX` errors.

## Structure

`ErrorDetails30`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Field` | `String` | Optional | The field that caused the error. If this field is in the body, set this value to the field's JSON pointer value. Required for client-side errors. | String getField() | setField(String field) |
| `Value` | `String` | Optional | The value of the field that caused the error. | String getValue() | setValue(String value) |
| `Location` | `String` | Optional | The location of the field that caused the error. Value is `body`, `path`, or `query`.<br>**Default**: `"body"` | String getLocation() | setLocation(String location) |
| `Issue` | `String` | Required, Constant | The unique, fine-grained application-level error code.<br>**Default**: `"INVALID_JSON_POINTER_FORMAT"` | String getIssue() | setIssue(String issue) |
| `Description` | [`InvalidJsonPointerFormat1Description2Enum`](../../doc/models/invalid-json-pointer-format-1-description-2-enum.md) | Optional | The human-readable description for an issue. The description can change over the lifetime of an API, so clients must not depend on this value. | InvalidJsonPointerFormat1Description2Enum getDescription() | setDescription(InvalidJsonPointerFormat1Description2Enum description) |

## Example (as JSON)

```json
{
  "location": "body",
  "issue": "INVALID_JSON_POINTER_FORMAT",
  "field": "field8",
  "value": "value6",
  "description": "Path should be a valid [JSON Pointer](https://tools.ietf.org/html/rfc6901) that references a location within the request where the operation is performed."
}
```

