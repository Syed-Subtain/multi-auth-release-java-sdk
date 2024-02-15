
# PAYPALTRANSACTIONIDNOTFOUND

## Structure

`PAYPALTRANSACTIONIDNOTFOUND`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PaypalTransactionIdNotFoundIssueEnum`](../../doc/models/paypal-transaction-id-not-found-issue-enum.md) | Optional | - | PaypalTransactionIdNotFoundIssueEnum getIssue() | setIssue(PaypalTransactionIdNotFoundIssueEnum issue) |
| `Description` | [`PaypalTransactionIdNotFoundDescriptionEnum`](../../doc/models/paypal-transaction-id-not-found-description-enum.md) | Optional | - | PaypalTransactionIdNotFoundDescriptionEnum getDescription() | setDescription(PaypalTransactionIdNotFoundDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "PAYPAL_TRANSACTION_ID_NOT_FOUND",
  "description": "Specified `paypal_transaction_id` was not found. Verify the value and try the request again."
}
```

