
# CURRENCYNOTSUPPORTEDFORCARDTYPE

## Structure

`CURRENCYNOTSUPPORTEDFORCARDTYPE`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`CurrencyNotSupportedForCardTypeIssueEnum`](../../doc/models/currency-not-supported-for-card-type-issue-enum.md) | Optional | - | CurrencyNotSupportedForCardTypeIssueEnum getIssue() | setIssue(CurrencyNotSupportedForCardTypeIssueEnum issue) |
| `Description` | [`CurrencyNotSupportedForCardTypeDescriptionEnum`](../../doc/models/currency-not-supported-for-card-type-description-enum.md) | Optional | - | CurrencyNotSupportedForCardTypeDescriptionEnum getDescription() | setDescription(CurrencyNotSupportedForCardTypeDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "CURRENCY_NOT_SUPPORTED_FOR_CARD_TYPE",
  "description": "The issued currency code of this card is not supported for direct card payments. Please refer https://developer.paypal.com/api/rest/reference/currency-codes/ for list of supported currency codes."
}
```

