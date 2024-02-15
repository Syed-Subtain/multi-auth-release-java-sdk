
# PAYEEFXRATEIDEXPIRED

## Structure

`PAYEEFXRATEIDEXPIRED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PayeeFxRateIdExpiredIssueEnum`](../../doc/models/payee-fx-rate-id-expired-issue-enum.md) | Optional | - | PayeeFxRateIdExpiredIssueEnum getIssue() | setIssue(PayeeFxRateIdExpiredIssueEnum issue) |
| `Description` | [`PayeeFxRateIdExpiredDescriptionEnum`](../../doc/models/payee-fx-rate-id-expired-description-enum.md) | Optional | - | PayeeFxRateIdExpiredDescriptionEnum getDescription() | setDescription(PayeeFxRateIdExpiredDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "PAYEE_FX_RATE_ID_EXPIRED",
  "description": "The specified FX Rate ID has expired. Please specify a different FX Rate Id and try the request again. Alternately, remove the FX Rate ID to process the request using the default exchange rate."
}
```

