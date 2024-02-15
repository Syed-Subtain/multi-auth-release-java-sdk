
# PAYPALTRANSACTIONIDEXPIREDERROR

## Structure

`PAYPALTRANSACTIONIDEXPIREDERROR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PaypalTransactionIdExpired1IssueEnum`](../../doc/models/paypal-transaction-id-expired-1-issue-enum.md) | Optional | - | PaypalTransactionIdExpired1IssueEnum getIssue() | setIssue(PaypalTransactionIdExpired1IssueEnum issue) |
| `Description` | [`PaypalTransactionIdExpired1DescriptionEnum`](../../doc/models/paypal-transaction-id-expired-1-description-enum.md) | Optional | - | PaypalTransactionIdExpired1DescriptionEnum getDescription() | setDescription(PaypalTransactionIdExpired1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "PAYPAL_TRANSACTION_ID_EXPIRED",
  "description": "Specified `paypal_transaction_id` has expired. PayPal transaction ID expires 4 years after the date of the initial transaction."
}
```

