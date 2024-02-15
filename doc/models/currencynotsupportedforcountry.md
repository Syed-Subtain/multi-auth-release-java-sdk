
# CURRENCYNOTSUPPORTEDFORCOUNTRY

## Structure

`CURRENCYNOTSUPPORTEDFORCOUNTRY`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`CurrencyNotSupportedForCountryIssueEnum`](../../doc/models/currency-not-supported-for-country-issue-enum.md) | Optional | - | CurrencyNotSupportedForCountryIssueEnum getIssue() | setIssue(CurrencyNotSupportedForCountryIssueEnum issue) |
| `Description` | [`CurrencyNotSupportedForCountryDescriptionEnum`](../../doc/models/currency-not-supported-for-country-description-enum.md) | Optional | - | CurrencyNotSupportedForCountryDescriptionEnum getDescription() | setDescription(CurrencyNotSupportedForCountryDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "CURRENCY_NOT_SUPPORTED_FOR_COUNTRY",
  "description": "For the payment_source specified, the currency of the Order is restricted by the country in which the payee account is based. Please refer https://developer.paypal.com/api/rest/reference/currency-codes/ for list of supported currency codes."
}
```

