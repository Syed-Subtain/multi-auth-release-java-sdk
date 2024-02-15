
# INVALIDPLATFORMFEESACCOUNT

## Structure

`INVALIDPLATFORMFEESACCOUNT`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`InvalidPlatformFeesAccountIssueEnum`](../../doc/models/invalid-platform-fees-account-issue-enum.md) | Optional | - | InvalidPlatformFeesAccountIssueEnum getIssue() | setIssue(InvalidPlatformFeesAccountIssueEnum issue) |
| `Description` | [`InvalidPlatformFeesAccountDescriptionEnum`](../../doc/models/invalid-platform-fees-account-description-enum.md) | Optional | - | InvalidPlatformFeesAccountDescriptionEnum getDescription() | setDescription(InvalidPlatformFeesAccountDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "INVALID_PLATFORM_FEES_ACCOUNT",
  "description": "The specified platform_fees payee account is either invalid or account setup is incomplete.Please work with your PayPal Account Manager to enable this option for your account."
}
```

