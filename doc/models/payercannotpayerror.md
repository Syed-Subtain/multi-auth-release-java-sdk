
# PAYERCANNOTPAYERROR

## Structure

`PAYERCANNOTPAYERROR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PayerCannotPay1IssueEnum`](../../doc/models/payer-cannot-pay-1-issue-enum.md) | Optional | - | PayerCannotPay1IssueEnum getIssue() | setIssue(PayerCannotPay1IssueEnum issue) |
| `Description` | [`PayerCannotPay1DescriptionEnum`](../../doc/models/payer-cannot-pay-1-description-enum.md) | Optional | - | PayerCannotPay1DescriptionEnum getDescription() | setDescription(PayerCannotPay1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "PAYER_CANNOT_PAY",
  "description": "Payer cannot pay for this transaction. Please contact the payer to find other ways to pay for this transaction."
}
```

