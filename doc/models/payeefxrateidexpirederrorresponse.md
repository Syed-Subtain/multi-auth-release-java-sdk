
# PAYEEFXRATEIDEXPIREDERRORRESPONSE

## Structure

`PAYEEFXRATEIDEXPIREDERRORRESPONSE`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PayeeFxRateIdExpired3IssueEnum`](../../doc/models/payee-fx-rate-id-expired-3-issue-enum.md) | Optional | - | PayeeFxRateIdExpired3IssueEnum getIssue() | setIssue(PayeeFxRateIdExpired3IssueEnum issue) |
| `Description` | [`PayeeFxRateIdExpired3DescriptionEnum`](../../doc/models/payee-fx-rate-id-expired-3-description-enum.md) | Optional | - | PayeeFxRateIdExpired3DescriptionEnum getDescription() | setDescription(PayeeFxRateIdExpired3DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "PAYEE_FX_RATE_ID_EXPIRED",
  "description": "The specified FX Rate ID has expired. Please specify a different FX Rate Id and try the request again. Alternately, remove the FX Rate ID to process the request using the default exchange rate."
}
```

