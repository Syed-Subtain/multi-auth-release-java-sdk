
# Platform Fees Not Supported 1

## Structure

`PlatformFeesNotSupported1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PlatformFeesNotSupported1IssueEnum`](../../doc/models/platform-fees-not-supported-1-issue-enum.md) | Optional | - | PlatformFeesNotSupported1IssueEnum getIssue() | setIssue(PlatformFeesNotSupported1IssueEnum issue) |
| `Description` | [`PlatformFeesNotSupported1DescriptionEnum`](../../doc/models/platform-fees-not-supported-1-description-enum.md) | Optional | - | PlatformFeesNotSupported1DescriptionEnum getDescription() | setDescription(PlatformFeesNotSupported1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "PLATFORM_FEES_NOT_SUPPORTED",
  "description": "The API Caller is not enabled to process transactions by specifying 'platform_fees'. Please work with your PayPal Account Manager to enable this option for your account."
}
```

