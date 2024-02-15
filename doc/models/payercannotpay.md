
# PAYERCANNOTPAY

## Structure

`PAYERCANNOTPAY`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PayerCannotPayIssueEnum`](../../doc/models/payer-cannot-pay-issue-enum.md) | Optional | - | PayerCannotPayIssueEnum getIssue() | setIssue(PayerCannotPayIssueEnum issue) |
| `Description` | [`PayerCannotPayDescriptionEnum`](../../doc/models/payer-cannot-pay-description-enum.md) | Optional | - | PayerCannotPayDescriptionEnum getDescription() | setDescription(PayerCannotPayDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "PAYER_CANNOT_PAY",
  "description": "Combination of payer and payee settings mean that this buyer cannot pay this seller."
}
```

