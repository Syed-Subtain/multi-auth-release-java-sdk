
# MAXPAYMENTATTEMPTSEXCEEDEDERRORRESPONSE

## Structure

`MAXPAYMENTATTEMPTSEXCEEDEDERRORRESPONSE`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`MaxNumberOfPaymentAttemptsExceeded2IssueEnum`](../../doc/models/max-number-of-payment-attempts-exceeded-2-issue-enum.md) | Optional | - | MaxNumberOfPaymentAttemptsExceeded2IssueEnum getIssue() | setIssue(MaxNumberOfPaymentAttemptsExceeded2IssueEnum issue) |
| `Description` | [`ExceededMaxPaymentAttemptsDescEnum`](../../doc/models/exceeded-max-payment-attempts-desc-enum.md) | Optional | - | ExceededMaxPaymentAttemptsDescEnum getDescription() | setDescription(ExceededMaxPaymentAttemptsDescEnum description) |

## Example (as JSON)

```json
{
  "issue": "MAX_NUMBER_OF_PAYMENT_ATTEMPTS_EXCEEDED",
  "description": "You have exceeded the maximum number of payment attempts."
}
```

