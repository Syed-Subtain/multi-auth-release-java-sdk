
# Payee Account Restricted 1

## Structure

`PayeeAccountRestricted1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PayeeAccountRestricted1IssueEnum`](../../doc/models/payee-account-restricted-1-issue-enum.md) | Optional | - | PayeeAccountRestricted1IssueEnum getIssue() | setIssue(PayeeAccountRestricted1IssueEnum issue) |
| `Description` | [`PayeeAccountRestricted1DescriptionEnum`](../../doc/models/payee-account-restricted-1-description-enum.md) | Optional | - | PayeeAccountRestricted1DescriptionEnum getDescription() | setDescription(PayeeAccountRestricted1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "PAYEE_ACCOUNT_RESTRICTED",
  "description": "The merchant account is restricted."
}
```

