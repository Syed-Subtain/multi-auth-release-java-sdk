
# PAYEEBLOCKEDTRANSACTIONERRORRESPONSE

## Structure

`PAYEEBLOCKEDTRANSACTIONERRORRESPONSE`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PayeeBlockedTransaction2IssueEnum`](../../doc/models/payee-blocked-transaction-2-issue-enum.md) | Optional | - | PayeeBlockedTransaction2IssueEnum getIssue() | setIssue(PayeeBlockedTransaction2IssueEnum issue) |
| `Description` | [`PayeeBlockedTransaction2DescriptionEnum`](../../doc/models/payee-blocked-transaction-2-description-enum.md) | Optional | - | PayeeBlockedTransaction2DescriptionEnum getDescription() | setDescription(PayeeBlockedTransaction2DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "PAYEE_BLOCKED_TRANSACTION",
  "description": "The Fraud settings for this seller are such that this payment cannot be executed."
}
```

