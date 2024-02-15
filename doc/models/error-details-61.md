
# Error Details 61

The error details. Required for client-side `4XX` errors.

## Structure

`ErrorDetails61`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Field` | `String` | Optional | The field that caused the error. If this field is in the body, set this value to the field's JSON pointer value. Required for client-side errors. | String getField() | setField(String field) |
| `Value` | `String` | Optional | The value of the field that caused the error. | String getValue() | setValue(String value) |
| `Location` | `String` | Optional | The location of the field that caused the error. Value is `body`, `path`, or `query`.<br>**Default**: `"body"` | String getLocation() | setLocation(String location) |
| `Issue` | `String` | Required, Constant | The unique, fine-grained application-level error code.<br>**Default**: `"INVALID_CURRENCY_CODE"` | String getIssue() | setIssue(String issue) |
| `Description` | [`InvalidCurrencyCodeDescription3Enum`](../../doc/models/invalid-currency-code-description-3-enum.md) | Optional | The human-readable description for an issue. The description can change over the lifetime of an API, so clients must not depend on this value. | InvalidCurrencyCodeDescription3Enum getDescription() | setDescription(InvalidCurrencyCodeDescription3Enum description) |

## Example (as JSON)

```json
{
  "location": "body",
  "issue": "INVALID_CURRENCY_CODE",
  "field": "field0",
  "value": "value8",
  "description": "Currency code is invalid or is not currently supported. Please refer https://developer.paypal.com/docs/api/reference/currency-codes/ for list of supported currency codes."
}
```

