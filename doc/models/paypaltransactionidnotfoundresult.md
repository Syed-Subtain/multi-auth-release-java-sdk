
# PAYPALTRANSACTIONIDNOTFOUNDRESULT

## Structure

`PAYPALTRANSACTIONIDNOTFOUNDRESULT`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PaypalTransactionIdNotFound2IssueEnum`](../../doc/models/paypal-transaction-id-not-found-2-issue-enum.md) | Optional | - | PaypalTransactionIdNotFound2IssueEnum getIssue() | setIssue(PaypalTransactionIdNotFound2IssueEnum issue) |
| `Description` | [`PaypalTransactionIdNotFound2DescriptionEnum`](../../doc/models/paypal-transaction-id-not-found-2-description-enum.md) | Optional | - | PaypalTransactionIdNotFound2DescriptionEnum getDescription() | setDescription(PaypalTransactionIdNotFound2DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "PAYPAL_TRANSACTION_ID_NOT_FOUND",
  "description": "Specified `paypal_transaction_id` was not found. Verify the value and try the request again."
}
```

