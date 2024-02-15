
# IBANCOUNTRYNOTSUPPORTEDERROR

## Structure

`IBANCOUNTRYNOTSUPPORTEDERROR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`IbanCountryNotSupported1IssueEnum`](../../doc/models/iban-country-not-supported-1-issue-enum.md) | Optional | - | IbanCountryNotSupported1IssueEnum getIssue() | setIssue(IbanCountryNotSupported1IssueEnum issue) |
| `Description` | [`IbanCountryNotSupported1DescriptionEnum`](../../doc/models/iban-country-not-supported-1-description-enum.md) | Optional | - | IbanCountryNotSupported1DescriptionEnum getDescription() | setDescription(IbanCountryNotSupported1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "IBAN_COUNTRY_NOT_SUPPORTED",
  "description": "Country code of issuer bank for the provided IBAN is not supported for SEPA debit payments."
}
```

