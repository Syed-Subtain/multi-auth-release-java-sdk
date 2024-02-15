
# INVALIDACCOUNTSTATUS

## Structure

`INVALIDACCOUNTSTATUS`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`InvalidAccountStatusIssueEnum`](../../doc/models/invalid-account-status-issue-enum.md) | Optional | - | InvalidAccountStatusIssueEnum getIssue() | setIssue(InvalidAccountStatusIssueEnum issue) |
| `Description` | [`InvalidAccountStatusDescriptionEnum`](../../doc/models/invalid-account-status-description-enum.md) | Optional | - | InvalidAccountStatusDescriptionEnum getDescription() | setDescription(InvalidAccountStatusDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "INVALID_ACCOUNT_STATUS",
  "description": "Account validations failed for the user."
}
```

