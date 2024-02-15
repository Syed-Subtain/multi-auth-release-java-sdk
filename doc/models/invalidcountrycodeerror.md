
# INVALIDCOUNTRYCODEERROR

## Structure

`INVALIDCOUNTRYCODEERROR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`InvalidCountryCode1IssueEnum`](../../doc/models/invalid-country-code-1-issue-enum.md) | Optional | - | InvalidCountryCode1IssueEnum getIssue() | setIssue(InvalidCountryCode1IssueEnum issue) |
| `Description` | [`InvalidCountryCode1DescriptionEnum`](../../doc/models/invalid-country-code-1-description-enum.md) | Optional | - | InvalidCountryCode1DescriptionEnum getDescription() | setDescription(InvalidCountryCode1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "INVALID_COUNTRY_CODE",
  "description": "Country code is invalid. Please refer to https://developer.paypal.com/api/rest/reference/country-codes/ for a list of supported country codes."
}
```

