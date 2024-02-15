
# PAYERCANNOTPAY1

## Structure

`PAYERCANNOTPAY1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PayerCannotPayIssueEnum`](../../doc/models/payer-cannot-pay-issue-enum.md) | Optional | - | PayerCannotPayIssueEnum getIssue() | setIssue(PayerCannotPayIssueEnum issue) |
| `Description` | [`PayerCannotPay1DescriptionEnum`](../../doc/models/payer-cannot-pay-1-description-enum.md) | Optional | - | PayerCannotPay1DescriptionEnum getDescription() | setDescription(PayerCannotPay1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "PAYER_CANNOT_PAY",
  "description": "Payer cannot pay for this transaction. Please contact the payer to find other ways to pay for this transaction."
}
```

