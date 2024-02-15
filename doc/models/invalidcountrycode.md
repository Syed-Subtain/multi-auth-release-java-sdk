
# INVALIDCOUNTRYCODE

## Structure

`INVALIDCOUNTRYCODE`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`InvalidCountryCodeIssueEnum`](../../doc/models/invalid-country-code-issue-enum.md) | Optional | - | InvalidCountryCodeIssueEnum getIssue() | setIssue(InvalidCountryCodeIssueEnum issue) |
| `Description` | [`InvalidCountryCodeDescriptionEnum`](../../doc/models/invalid-country-code-description-enum.md) | Optional | - | InvalidCountryCodeDescriptionEnum getDescription() | setDescription(InvalidCountryCodeDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "INVALID_COUNTRY_CODE",
  "description": "Country code is invalid. Please refer to https://developer.paypal.com/api/rest/reference/country-codes/ for a list of supported country codes."
}
```

