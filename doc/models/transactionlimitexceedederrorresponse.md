
# TRANSACTIONLIMITEXCEEDEDERRORRESPONSE

## Structure

`TRANSACTIONLIMITEXCEEDEDERRORRESPONSE`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`TransactionLimitExceeded2IssueEnum`](../../doc/models/transaction-limit-exceeded-2-issue-enum.md) | Optional | - | TransactionLimitExceeded2IssueEnum getIssue() | setIssue(TransactionLimitExceeded2IssueEnum issue) |
| `Description` | [`TransactionLimitExceeded2DescriptionEnum`](../../doc/models/transaction-limit-exceeded-2-description-enum.md) | Optional | - | TransactionLimitExceeded2DescriptionEnum getDescription() | setDescription(TransactionLimitExceeded2DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "TRANSACTION_LIMIT_EXCEEDED",
  "description": "Total payment amount exceeded transaction limit."
}
```

