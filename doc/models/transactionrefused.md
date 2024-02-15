
# TRANSACTIONREFUSED

## Structure

`TRANSACTIONREFUSED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`TransactionRefusedIssueEnum`](../../doc/models/transaction-refused-issue-enum.md) | Optional | - | TransactionRefusedIssueEnum getIssue() | setIssue(TransactionRefusedIssueEnum issue) |
| `Description` | [`TransactionRefusedDescriptionEnum`](../../doc/models/transaction-refused-description-enum.md) | Optional | - | TransactionRefusedDescriptionEnum getDescription() | setDescription(TransactionRefusedDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "TRANSACTION_REFUSED",
  "description": "The request was refused."
}
```

