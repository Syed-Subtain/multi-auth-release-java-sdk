
# TRANSACTIONREFUSEDERRORRESPONSE

## Structure

`TRANSACTIONREFUSEDERRORRESPONSE`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`TransactionRefused2IssueEnum`](../../doc/models/transaction-refused-2-issue-enum.md) | Optional | - | TransactionRefused2IssueEnum getIssue() | setIssue(TransactionRefused2IssueEnum issue) |
| `Description` | [`TransactionRefused2DescriptionEnum`](../../doc/models/transaction-refused-2-description-enum.md) | Optional | - | TransactionRefused2DescriptionEnum getDescription() | setDescription(TransactionRefused2DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "TRANSACTION_REFUSED",
  "description": "The request was refused."
}
```

