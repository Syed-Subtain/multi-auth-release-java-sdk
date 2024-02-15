
# TRANSACTIONRECEIVINGLIMITEXCEEDED

## Structure

`TRANSACTIONRECEIVINGLIMITEXCEEDED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`TransactionReceivingLimitExceededIssueEnum`](../../doc/models/transaction-receiving-limit-exceeded-issue-enum.md) | Optional | - | TransactionReceivingLimitExceededIssueEnum getIssue() | setIssue(TransactionReceivingLimitExceededIssueEnum issue) |
| `Description` | [`TransactionReceivingLimitExceededDescriptionEnum`](../../doc/models/transaction-receiving-limit-exceeded-description-enum.md) | Optional | - | TransactionReceivingLimitExceededDescriptionEnum getDescription() | setDescription(TransactionReceivingLimitExceededDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "TRANSACTION_RECEIVING_LIMIT_EXCEEDED",
  "description": "The transaction exceeds the receiver's receiving limit."
}
```

