
# Invalid Currency Code 1

## Structure

`InvalidCurrencyCode1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`InvalidCurrencyCode1IssueEnum`](../../doc/models/invalid-currency-code-1-issue-enum.md) | Optional | - | InvalidCurrencyCode1IssueEnum getIssue() | setIssue(InvalidCurrencyCode1IssueEnum issue) |
| `Description` | [`InvalidCurrencyCode1DescriptionEnum`](../../doc/models/invalid-currency-code-1-description-enum.md) | Optional | - | InvalidCurrencyCode1DescriptionEnum getDescription() | setDescription(InvalidCurrencyCode1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "INVALID_CURRENCY_CODE",
  "description": "Currency code is invalid or is not currently supported. Please refer https://developer.paypal.com/api/rest/reference/currency-codes/ for list of supported currency codes."
}
```

