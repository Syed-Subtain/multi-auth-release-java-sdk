
# PLATFORMFEEPAYEECANNOTBESAMEASPAYER

## Structure

`PLATFORMFEEPAYEECANNOTBESAMEASPAYER`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PlatformFeePayeeCannotBeSameAsPayerIssueEnum`](../../doc/models/platform-fee-payee-cannot-be-same-as-payer-issue-enum.md) | Optional | - | PlatformFeePayeeCannotBeSameAsPayerIssueEnum getIssue() | setIssue(PlatformFeePayeeCannotBeSameAsPayerIssueEnum issue) |
| `Description` | [`PayerCannotPayThemselvesErrorEnum`](../../doc/models/payer-cannot-pay-themselves-error-enum.md) | Optional | - | PayerCannotPayThemselvesErrorEnum getDescription() | setDescription(PayerCannotPayThemselvesErrorEnum description) |

## Example (as JSON)

```json
{
  "issue": "PLATFORM_FEE_PAYEE_CANNOT_BE_SAME_AS_PAYER",
  "description": "The payer cannot pay themselves. The recipient account of the platform fees must be different from the payer account."
}
```

