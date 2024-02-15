
# TRANSACTIONRECEIVELIMITEXCEEDEDERRORRESPONSE

## Structure

`TRANSACTIONRECEIVELIMITEXCEEDEDERRORRESPONSE`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`TransactionReceivingLimitExceeded2IssueEnum`](../../doc/models/transaction-receiving-limit-exceeded-2-issue-enum.md) | Optional | - | TransactionReceivingLimitExceeded2IssueEnum getIssue() | setIssue(TransactionReceivingLimitExceeded2IssueEnum issue) |
| `Description` | [`TransactionReceivingLimitExceeded2DescriptionEnum`](../../doc/models/transaction-receiving-limit-exceeded-2-description-enum.md) | Optional | - | TransactionReceivingLimitExceeded2DescriptionEnum getDescription() | setDescription(TransactionReceivingLimitExceeded2DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "TRANSACTION_RECEIVING_LIMIT_EXCEEDED",
  "description": "The transaction exceeds the receiver's receiving limit."
}
```

