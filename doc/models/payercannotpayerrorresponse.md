
# PAYERCANNOTPAYERRORRESPONSE

## Structure

`PAYERCANNOTPAYERRORRESPONSE`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PayerCannotPay2IssueEnum`](../../doc/models/payer-cannot-pay-2-issue-enum.md) | Optional | - | PayerCannotPay2IssueEnum getIssue() | setIssue(PayerCannotPay2IssueEnum issue) |
| `Description` | [`PayerCannotPay2DescriptionEnum`](../../doc/models/payer-cannot-pay-2-description-enum.md) | Optional | - | PayerCannotPay2DescriptionEnum getDescription() | setDescription(PayerCannotPay2DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "PAYER_CANNOT_PAY",
  "description": "Payer cannot pay for this transaction. Please contact the payer to find other ways to pay for this transaction."
}
```

