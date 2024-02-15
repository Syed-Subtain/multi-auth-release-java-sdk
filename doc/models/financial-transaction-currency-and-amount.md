
# Financial Transaction Currency and Amount

The currency and amount for a financial transaction, such as a balance or payment due.

## Structure

`FinancialTransactionCurrencyAndAmount`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CurrencyCode` | `String` | Required | The [3-character ISO-4217 currency code](/api/rest/reference/currency-codes/) that identifies the currency.<br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `3` | String getCurrencyCode() | setCurrencyCode(String currencyCode) |
| `Value` | `String` | Required | The value, which might be:<ul><li>An integer for currencies like `JPY` that are not typically fractional.</li><li>A decimal fraction for currencies like `TND` that are subdivided into thousandths.</li></ul>For the required number of decimal places for a currency code, see [Currency Codes](/api/rest/reference/currency-codes/).<br>**Constraints**: *Maximum Length*: `32`, *Pattern*: `^((-?[0-9]+)\|(-?([0-9]+)?[.][0-9]+))$` | String getValue() | setValue(String value) |

## Example (as JSON)

```json
{
  "currency_code": "currency_code2",
  "value": "value8"
}
```

