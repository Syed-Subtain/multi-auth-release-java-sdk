
# TRANSACTIONLIMITEXCEEDED

## Structure

`TRANSACTIONLIMITEXCEEDED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`TransactionLimitExceededIssueEnum`](../../doc/models/transaction-limit-exceeded-issue-enum.md) | Optional | - | TransactionLimitExceededIssueEnum getIssue() | setIssue(TransactionLimitExceededIssueEnum issue) |
| `Description` | [`TransactionLimitExceededDescriptionEnum`](../../doc/models/transaction-limit-exceeded-description-enum.md) | Optional | - | TransactionLimitExceededDescriptionEnum getDescription() | setDescription(TransactionLimitExceededDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "TRANSACTION_LIMIT_EXCEEDED",
  "description": "Total payment amount exceeded transaction limit."
}
```

