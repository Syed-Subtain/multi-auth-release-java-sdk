
# Error Details 15

The error details. Required for client-side `4XX` errors.

## Structure

`ErrorDetails15`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Field` | `String` | Optional | The field that caused the error. If this field is in the body, set this value to the field's JSON pointer value. Required for client-side errors. | String getField() | setField(String field) |
| `Value` | `String` | Optional | The value of the field that caused the error. | String getValue() | setValue(String value) |
| `Location` | `String` | Optional | The location of the field that caused the error. Value is `body`, `path`, or `query`.<br>**Default**: `"body"` | String getLocation() | setLocation(String location) |
| `Issue` | `String` | Required, Constant | The unique, fine-grained application-level error code.<br>**Default**: `"NOT_ELIGIBLE_FOR_TOKEN_PROCESSING"` | String getIssue() | setIssue(String issue) |
| `Description` | [`NotEligibleForTokenProcessingDescription2Enum`](../../doc/models/not-eligible-for-token-processing-description-2-enum.md) | Optional | The human-readable description for an issue. The description can change over the lifetime of an API, so clients must not depend on this value. | NotEligibleForTokenProcessingDescription2Enum getDescription() | setDescription(NotEligibleForTokenProcessingDescription2Enum description) |

## Example (as JSON)

```json
{
  "location": "body",
  "issue": "NOT_ELIGIBLE_FOR_TOKEN_PROCESSING",
  "field": "field4",
  "value": "value2",
  "description": "API caller is not enabled to process payments with the specified type of token. Please contact customer support to request permissions to process transactions with this type of token."
}
```

