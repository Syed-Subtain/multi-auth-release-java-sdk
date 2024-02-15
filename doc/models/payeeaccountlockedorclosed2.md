
# PAYEEACCOUNTLOCKEDORCLOSED2

## Structure

`PAYEEACCOUNTLOCKEDORCLOSED2`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PayeeAccountLockedOrClosedIssueEnum`](../../doc/models/payee-account-locked-or-closed-issue-enum.md) | Optional | - | PayeeAccountLockedOrClosedIssueEnum getIssue() | setIssue(PayeeAccountLockedOrClosedIssueEnum issue) |
| `Description` | [`PayeeAccountLockedOrClosedDescription1Enum`](../../doc/models/payee-account-locked-or-closed-description-1-enum.md) | Optional | - | PayeeAccountLockedOrClosedDescription1Enum getDescription() | setDescription(PayeeAccountLockedOrClosedDescription1Enum description) |

## Example (as JSON)

```json
{
  "issue": "PAYEE_ACCOUNT_LOCKED_OR_CLOSED",
  "description": "Transaction could not complete because payee account is locked or closed."
}
```

