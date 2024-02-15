
# IBANCOUNTRYNOTSUPPORTED

## Structure

`IBANCOUNTRYNOTSUPPORTED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`IbanCountryNotSupportedIssueEnum`](../../doc/models/iban-country-not-supported-issue-enum.md) | Optional | - | IbanCountryNotSupportedIssueEnum getIssue() | setIssue(IbanCountryNotSupportedIssueEnum issue) |
| `Description` | [`IbanCountryNotSupportedDescriptionEnum`](../../doc/models/iban-country-not-supported-description-enum.md) | Optional | - | IbanCountryNotSupportedDescriptionEnum getDescription() | setDescription(IbanCountryNotSupportedDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "IBAN_COUNTRY_NOT_SUPPORTED",
  "description": "Country code of issuer bank for the provided IBAN is not supported for SEPA debit payments."
}
```

