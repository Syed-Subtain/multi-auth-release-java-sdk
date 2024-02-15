
# TRANSACTIONREFUSED1

## Structure

`TRANSACTIONREFUSED1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`TransactionRefusedIssueEnum`](../../doc/models/transaction-refused-issue-enum.md) | Optional | - | TransactionRefusedIssueEnum getIssue() | setIssue(TransactionRefusedIssueEnum issue) |
| `Description` | [`TransactionRefusedDescription1Enum`](../../doc/models/transaction-refused-description-1-enum.md) | Optional | - | TransactionRefusedDescription1Enum getDescription() | setDescription(TransactionRefusedDescription1Enum description) |

## Example (as JSON)

```json
{
  "issue": "TRANSACTION_REFUSED",
  "description": "PayPal's internal controls prevent authorization from being captured."
}
```

