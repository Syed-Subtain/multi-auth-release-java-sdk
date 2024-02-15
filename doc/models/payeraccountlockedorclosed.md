
# PAYERACCOUNTLOCKEDORCLOSED

## Structure

`PAYERACCOUNTLOCKEDORCLOSED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PayerAccountLockedOrClosedIssueEnum`](../../doc/models/payer-account-locked-or-closed-issue-enum.md) | Optional | - | PayerAccountLockedOrClosedIssueEnum getIssue() | setIssue(PayerAccountLockedOrClosedIssueEnum issue) |
| `Description` | [`PayerAccountLockedOrClosedDescriptionEnum`](../../doc/models/payer-account-locked-or-closed-description-enum.md) | Optional | - | PayerAccountLockedOrClosedDescriptionEnum getDescription() | setDescription(PayerAccountLockedOrClosedDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "PAYER_ACCOUNT_LOCKED_OR_CLOSED",
  "description": "The payer account cannot be used for this transaction."
}
```

