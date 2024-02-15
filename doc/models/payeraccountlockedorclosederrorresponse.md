
# PAYERACCOUNTLOCKEDORCLOSEDERRORRESPONSE

## Structure

`PAYERACCOUNTLOCKEDORCLOSEDERRORRESPONSE`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PayerAccountLockedOrClosed2IssueEnum`](../../doc/models/payer-account-locked-or-closed-2-issue-enum.md) | Optional | - | PayerAccountLockedOrClosed2IssueEnum getIssue() | setIssue(PayerAccountLockedOrClosed2IssueEnum issue) |
| `Description` | [`PayerAccountLockedOrClosed2DescriptionEnum`](../../doc/models/payer-account-locked-or-closed-2-description-enum.md) | Optional | - | PayerAccountLockedOrClosed2DescriptionEnum getDescription() | setDescription(PayerAccountLockedOrClosed2DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "PAYER_ACCOUNT_LOCKED_OR_CLOSED",
  "description": "The payer account cannot be used for this transaction."
}
```

