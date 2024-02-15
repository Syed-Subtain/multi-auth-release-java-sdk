
# Authorizationsreauthorize 422 Issues Items

## Structure

`Authorizationsreauthorize422issuesItems`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`InvalidCurrencyCodeIssueEnum`](../../doc/models/invalid-currency-code-issue-enum.md) | Optional | - | InvalidCurrencyCodeIssueEnum getIssue() | setIssue(InvalidCurrencyCodeIssueEnum issue) |
| `Description` | [`InvalidCurrencyCodeDescription1Enum`](../../doc/models/invalid-currency-code-description-1-enum.md) | Optional | - | InvalidCurrencyCodeDescription1Enum getDescription() | setDescription(InvalidCurrencyCodeDescription1Enum description) |

## Example (as JSON)

```json
{
  "issue": "INVALID_CURRENCY_CODE",
  "description": "Currency code is invalid or is not currently supported. Please refer https://developer.paypal.com/docs/api/reference/currency-codes/ for list of supported currency codes."
}
```

