
# CURRENCYNOTSUPPORTEDFORBANK

## Structure

`CURRENCYNOTSUPPORTEDFORBANK`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`CurrencyNotSupportedForBankIssueEnum`](../../doc/models/currency-not-supported-for-bank-issue-enum.md) | Optional | - | CurrencyNotSupportedForBankIssueEnum getIssue() | setIssue(CurrencyNotSupportedForBankIssueEnum issue) |
| `Description` | [`CurrencyNotSupportedForBankDescriptionEnum`](../../doc/models/currency-not-supported-for-bank-description-enum.md) | Optional | - | CurrencyNotSupportedForBankDescriptionEnum getDescription() | setDescription(CurrencyNotSupportedForBankDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "CURRENCY_NOT_SUPPORTED_FOR_BANK",
  "description": "The payment_source does not support the currency of the Order. For ACH debit, only USD is supported and for SEPA debit, only EUR is supported."
}
```

