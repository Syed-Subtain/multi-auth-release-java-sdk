
# PAYEEBLOCKEDTRANSACTION

## Structure

`PAYEEBLOCKEDTRANSACTION`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PayeeBlockedTransactionIssueEnum`](../../doc/models/payee-blocked-transaction-issue-enum.md) | Optional | - | PayeeBlockedTransactionIssueEnum getIssue() | setIssue(PayeeBlockedTransactionIssueEnum issue) |
| `Description` | [`PayeeBlockedTransactionDescriptionEnum`](../../doc/models/payee-blocked-transaction-description-enum.md) | Optional | - | PayeeBlockedTransactionDescriptionEnum getDescription() | setDescription(PayeeBlockedTransactionDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "PAYEE_BLOCKED_TRANSACTION",
  "description": "The Fraud settings for this seller are such that this payment cannot be executed."
}
```

