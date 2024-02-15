
# PAYPALTRANSACTIONIDNOTFOUNDERRORRESPONSE

## Structure

`PAYPALTRANSACTIONIDNOTFOUNDERRORRESPONSE`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PaypalTransactionIdNotFound3IssueEnum`](../../doc/models/paypal-transaction-id-not-found-3-issue-enum.md) | Optional | - | PaypalTransactionIdNotFound3IssueEnum getIssue() | setIssue(PaypalTransactionIdNotFound3IssueEnum issue) |
| `Description` | [`PaypalTransactionIdNotFound3DescriptionEnum`](../../doc/models/paypal-transaction-id-not-found-3-description-enum.md) | Optional | - | PaypalTransactionIdNotFound3DescriptionEnum getDescription() | setDescription(PaypalTransactionIdNotFound3DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "PAYPAL_TRANSACTION_ID_NOT_FOUND",
  "description": "Specified `paypal_transaction_id` was not found. Verify the value and try the request again."
}
```

