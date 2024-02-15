
# PAYPALTRANSACTIONIDEXPIRED

## Structure

`PAYPALTRANSACTIONIDEXPIRED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PaypalTransactionIdExpiredIssueEnum`](../../doc/models/paypal-transaction-id-expired-issue-enum.md) | Optional | - | PaypalTransactionIdExpiredIssueEnum getIssue() | setIssue(PaypalTransactionIdExpiredIssueEnum issue) |
| `Description` | [`PaypalTransactionIdExpiredDescriptionEnum`](../../doc/models/paypal-transaction-id-expired-description-enum.md) | Optional | - | PaypalTransactionIdExpiredDescriptionEnum getDescription() | setDescription(PaypalTransactionIdExpiredDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "PAYPAL_TRANSACTION_ID_EXPIRED",
  "description": "Specified `paypal_transaction_id` has expired. PayPal transaction ID expires 4 years after the date of the initial transaction."
}
```

