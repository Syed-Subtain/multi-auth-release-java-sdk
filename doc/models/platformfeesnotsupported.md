
# PLATFORMFEESNOTSUPPORTED

## Structure

`PLATFORMFEESNOTSUPPORTED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PlatformFeesNotSupportedIssueEnum`](../../doc/models/platform-fees-not-supported-issue-enum.md) | Optional | - | PlatformFeesNotSupportedIssueEnum getIssue() | setIssue(PlatformFeesNotSupportedIssueEnum issue) |
| `Description` | [`PlatformFeesNotSupportedDescriptionEnum`](../../doc/models/platform-fees-not-supported-description-enum.md) | Optional | - | PlatformFeesNotSupportedDescriptionEnum getDescription() | setDescription(PlatformFeesNotSupportedDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "PLATFORM_FEES_NOT_SUPPORTED",
  "description": "The API Caller is not enabled to process transactions by specifying 'platform_fees'. Please work with your PayPal Account Manager to enable this option for your account."
}
```

