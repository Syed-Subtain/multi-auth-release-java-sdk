
# TRANSACTIONREFUSEDERROR

## Structure

`TRANSACTIONREFUSEDERROR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`TransactionRefused1IssueEnum`](../../doc/models/transaction-refused-1-issue-enum.md) | Optional | - | TransactionRefused1IssueEnum getIssue() | setIssue(TransactionRefused1IssueEnum issue) |
| `Description` | [`TransactionRefused1DescriptionEnum`](../../doc/models/transaction-refused-1-description-enum.md) | Optional | - | TransactionRefused1DescriptionEnum getDescription() | setDescription(TransactionRefused1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "TRANSACTION_REFUSED",
  "description": "The request was refused."
}
```

