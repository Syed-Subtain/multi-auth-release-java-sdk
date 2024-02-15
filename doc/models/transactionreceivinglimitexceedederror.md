
# TRANSACTIONRECEIVINGLIMITEXCEEDEDERROR

## Structure

`TRANSACTIONRECEIVINGLIMITEXCEEDEDERROR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`TransactionReceivingLimitExceeded1IssueEnum`](../../doc/models/transaction-receiving-limit-exceeded-1-issue-enum.md) | Optional | - | TransactionReceivingLimitExceeded1IssueEnum getIssue() | setIssue(TransactionReceivingLimitExceeded1IssueEnum issue) |
| `Description` | [`TransactionReceivingLimitExceeded1DescriptionEnum`](../../doc/models/transaction-receiving-limit-exceeded-1-description-enum.md) | Optional | - | TransactionReceivingLimitExceeded1DescriptionEnum getDescription() | setDescription(TransactionReceivingLimitExceeded1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "TRANSACTION_RECEIVING_LIMIT_EXCEEDED",
  "description": "The transaction exceeds the receiver's receiving limit."
}
```

