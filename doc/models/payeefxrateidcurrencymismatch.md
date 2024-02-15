
# PAYEEFXRATEIDCURRENCYMISMATCH

## Structure

`PAYEEFXRATEIDCURRENCYMISMATCH`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PayeeFxRateIdCurrencyMismatchIssueEnum`](../../doc/models/payee-fx-rate-id-currency-mismatch-issue-enum.md) | Optional | - | PayeeFxRateIdCurrencyMismatchIssueEnum getIssue() | setIssue(PayeeFxRateIdCurrencyMismatchIssueEnum issue) |
| `Description` | [`PayeeFxRateIdCurrencyMismatchDescriptionEnum`](../../doc/models/payee-fx-rate-id-currency-mismatch-description-enum.md) | Optional | - | PayeeFxRateIdCurrencyMismatchDescriptionEnum getDescription() | setDescription(PayeeFxRateIdCurrencyMismatchDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "PAYEE_FX_RATE_ID_CURRENCY_MISMATCH",
  "description": "The specified FX Rate ID is for a currency that does not match with the currency of this request. Please specify a different FX Rate ID and try the request again. Alternately, remove the FX Rate ID to process the request using the default exchange rate."
}
```

