
# PAYPALTRANSACTIONIDNOTFOUNDERROR

## Structure

`PAYPALTRANSACTIONIDNOTFOUNDERROR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PaypalTransactionIdNotFound1IssueEnum`](../../doc/models/paypal-transaction-id-not-found-1-issue-enum.md) | Optional | - | PaypalTransactionIdNotFound1IssueEnum getIssue() | setIssue(PaypalTransactionIdNotFound1IssueEnum issue) |
| `Description` | [`PaypalTransactionIdNotFound1DescriptionEnum`](../../doc/models/paypal-transaction-id-not-found-1-description-enum.md) | Optional | - | PaypalTransactionIdNotFound1DescriptionEnum getDescription() | setDescription(PaypalTransactionIdNotFound1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "PAYPAL_TRANSACTION_ID_NOT_FOUND",
  "description": "Specified `paypal_transaction_id` was not found. Verify the value and try the request again."
}
```

