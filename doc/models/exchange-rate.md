
# Exchange Rate

The exchange rate that determines the amount to convert from one currency to another currency.

## Structure

`ExchangeRate`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SourceCurrency` | `String` | Optional | The source currency from which to convert an amount.<br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `3` | String getSourceCurrency() | setSourceCurrency(String sourceCurrency) |
| `TargetCurrency` | `String` | Optional | The target currency to which to convert an amount.<br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `3` | String getTargetCurrency() | setTargetCurrency(String targetCurrency) |
| `Value` | `String` | Optional | The target currency amount. Equivalent to one unit of the source currency. Formatted as integer or decimal value with one to 15 digits to the right of the decimal point. | String getValue() | setValue(String value) |

## Example (as JSON)

```json
{
  "source_currency": "source_currency0",
  "target_currency": "target_currency2",
  "value": "value2"
}
```

