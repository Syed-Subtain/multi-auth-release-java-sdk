
# TRANSACTIONLIMITEXCEEDEDERROR

## Structure

`TRANSACTIONLIMITEXCEEDEDERROR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`TransactionLimitExceeded1IssueEnum`](../../doc/models/transaction-limit-exceeded-1-issue-enum.md) | Optional | - | TransactionLimitExceeded1IssueEnum getIssue() | setIssue(TransactionLimitExceeded1IssueEnum issue) |
| `Description` | [`TransactionLimitExceeded1DescriptionEnum`](../../doc/models/transaction-limit-exceeded-1-description-enum.md) | Optional | - | TransactionLimitExceeded1DescriptionEnum getDescription() | setDescription(TransactionLimitExceeded1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "TRANSACTION_LIMIT_EXCEEDED",
  "description": "Total payment amount exceeded transaction limit."
}
```

