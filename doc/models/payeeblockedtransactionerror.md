
# PAYEEBLOCKEDTRANSACTIONERROR

## Structure

`PAYEEBLOCKEDTRANSACTIONERROR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PayeeBlockedTransaction1IssueEnum`](../../doc/models/payee-blocked-transaction-1-issue-enum.md) | Optional | - | PayeeBlockedTransaction1IssueEnum getIssue() | setIssue(PayeeBlockedTransaction1IssueEnum issue) |
| `Description` | [`PayeeBlockedTransaction1DescriptionEnum`](../../doc/models/payee-blocked-transaction-1-description-enum.md) | Optional | - | PayeeBlockedTransaction1DescriptionEnum getDescription() | setDescription(PayeeBlockedTransaction1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "PAYEE_BLOCKED_TRANSACTION",
  "description": "The Fraud settings for this seller are such that this payment cannot be executed."
}
```

