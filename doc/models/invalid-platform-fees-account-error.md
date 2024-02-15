
# Invalid Platform Fees Account Error

## Structure

`InvalidPlatformFeesAccountError`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`InvalidPlatformFeesAccount1IssueEnum`](../../doc/models/invalid-platform-fees-account-1-issue-enum.md) | Optional | - | InvalidPlatformFeesAccount1IssueEnum getIssue() | setIssue(InvalidPlatformFeesAccount1IssueEnum issue) |
| `Description` | [`InvalidPlatformFeesAccount1DescriptionEnum`](../../doc/models/invalid-platform-fees-account-1-description-enum.md) | Optional | - | InvalidPlatformFeesAccount1DescriptionEnum getDescription() | setDescription(InvalidPlatformFeesAccount1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "INVALID_PLATFORM_FEES_ACCOUNT",
  "description": "The specified platform_fees payee account is either invalid or account setup is incomplete.Please work with your PayPal Account Manager to enable this option for your account."
}
```

