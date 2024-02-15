
# CURRENCYNOTSUPPORTEDFORBANKERROR

## Structure

`CURRENCYNOTSUPPORTEDFORBANKERROR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`CurrencyNotSupportedForBank1IssueEnum`](../../doc/models/currency-not-supported-for-bank-1-issue-enum.md) | Optional | - | CurrencyNotSupportedForBank1IssueEnum getIssue() | setIssue(CurrencyNotSupportedForBank1IssueEnum issue) |
| `Description` | [`CurrencyNotSupportedForBank1DescriptionEnum`](../../doc/models/currency-not-supported-for-bank-1-description-enum.md) | Optional | - | CurrencyNotSupportedForBank1DescriptionEnum getDescription() | setDescription(CurrencyNotSupportedForBank1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "CURRENCY_NOT_SUPPORTED_FOR_BANK",
  "description": "The payment_source does not support the currency of the Order. For ACH debit, only USD is supported and for SEPA debit, only EUR is supported."
}
```

