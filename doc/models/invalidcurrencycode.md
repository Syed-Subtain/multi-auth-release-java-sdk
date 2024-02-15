
# INVALIDCURRENCYCODE

## Structure

`INVALIDCURRENCYCODE`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`InvalidCurrencyCodeIssueEnum`](../../doc/models/invalid-currency-code-issue-enum.md) | Optional | - | InvalidCurrencyCodeIssueEnum getIssue() | setIssue(InvalidCurrencyCodeIssueEnum issue) |
| `Description` | [`InvalidCurrencyCodeDescriptionEnum`](../../doc/models/invalid-currency-code-description-enum.md) | Optional | - | InvalidCurrencyCodeDescriptionEnum getDescription() | setDescription(InvalidCurrencyCodeDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "INVALID_CURRENCY_CODE",
  "description": "Currency code is invalid or is not currently supported. Please refer https://developer.paypal.com/api/rest/reference/currency-codes/ for list of supported currency codes."
}
```

