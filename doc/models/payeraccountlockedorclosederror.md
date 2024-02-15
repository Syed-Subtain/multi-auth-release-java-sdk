
# PAYERACCOUNTLOCKEDORCLOSEDERROR

## Structure

`PAYERACCOUNTLOCKEDORCLOSEDERROR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PayerAccountLockedOrClosed1IssueEnum`](../../doc/models/payer-account-locked-or-closed-1-issue-enum.md) | Optional | - | PayerAccountLockedOrClosed1IssueEnum getIssue() | setIssue(PayerAccountLockedOrClosed1IssueEnum issue) |
| `Description` | [`PayerAccountLockedOrClosed1DescriptionEnum`](../../doc/models/payer-account-locked-or-closed-1-description-enum.md) | Optional | - | PayerAccountLockedOrClosed1DescriptionEnum getDescription() | setDescription(PayerAccountLockedOrClosed1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "PAYER_ACCOUNT_LOCKED_OR_CLOSED",
  "description": "The payer account cannot be used for this transaction."
}
```

