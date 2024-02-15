
# Payee Account Locked or Closed 1

## Structure

`PayeeAccountLockedOrClosed1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PayeeAccountLockedOrClosed1IssueEnum`](../../doc/models/payee-account-locked-or-closed-1-issue-enum.md) | Optional | - | PayeeAccountLockedOrClosed1IssueEnum getIssue() | setIssue(PayeeAccountLockedOrClosed1IssueEnum issue) |
| `Description` | [`PayeeAccountLockedOrClosed1DescriptionEnum`](../../doc/models/payee-account-locked-or-closed-1-description-enum.md) | Optional | - | PayeeAccountLockedOrClosed1DescriptionEnum getDescription() | setDescription(PayeeAccountLockedOrClosed1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "PAYEE_ACCOUNT_LOCKED_OR_CLOSED",
  "description": "The merchant account is locked or closed."
}
```

