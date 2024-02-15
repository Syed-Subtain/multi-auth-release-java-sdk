
# PAYEEFXRATEIDEXPIREDERROR

## Structure

`PAYEEFXRATEIDEXPIREDERROR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PayeeFxRateIdExpired2IssueEnum`](../../doc/models/payee-fx-rate-id-expired-2-issue-enum.md) | Optional | - | PayeeFxRateIdExpired2IssueEnum getIssue() | setIssue(PayeeFxRateIdExpired2IssueEnum issue) |
| `Description` | [`PayeeFxRateIdExpired2DescriptionEnum`](../../doc/models/payee-fx-rate-id-expired-2-description-enum.md) | Optional | - | PayeeFxRateIdExpired2DescriptionEnum getDescription() | setDescription(PayeeFxRateIdExpired2DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "PAYEE_FX_RATE_ID_EXPIRED",
  "description": "The specified FX Rate ID has expired. Please specify a different FX Rate Id and try the request again. Alternately, remove the FX Rate ID to process the request using the default exchange rate."
}
```

