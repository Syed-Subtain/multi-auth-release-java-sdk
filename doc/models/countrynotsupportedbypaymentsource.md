
# COUNTRYNOTSUPPORTEDBYPAYMENTSOURCE

## Structure

`COUNTRYNOTSUPPORTEDBYPAYMENTSOURCE`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`CountryNotSupportedByPaymentSourceIssueEnum`](../../doc/models/country-not-supported-by-payment-source-issue-enum.md) | Optional | - | CountryNotSupportedByPaymentSourceIssueEnum getIssue() | setIssue(CountryNotSupportedByPaymentSourceIssueEnum issue) |
| `Description` | [`UnsupportedCountryCodePaymentSourceEnum`](../../doc/models/unsupported-country-code-payment-source-enum.md) | Optional | - | UnsupportedCountryCodePaymentSourceEnum getDescription() | setDescription(UnsupportedCountryCodePaymentSourceEnum description) |

## Example (as JSON)

```json
{
  "issue": "COUNTRY_NOT_SUPPORTED_BY_PAYMENT_SOURCE",
  "description": "Country code provided is not supported by the provided payment source."
}
```

