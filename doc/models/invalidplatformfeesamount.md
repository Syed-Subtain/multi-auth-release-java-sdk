
# INVALIDPLATFORMFEESAMOUNT

## Structure

`INVALIDPLATFORMFEESAMOUNT`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`InvalidPlatformFeesAmountIssueEnum`](../../doc/models/invalid-platform-fees-amount-issue-enum.md) | Optional | - | InvalidPlatformFeesAmountIssueEnum getIssue() | setIssue(InvalidPlatformFeesAmountIssueEnum issue) |
| `Description` | [`InvalidPlatformFeesAmountDescriptionEnum`](../../doc/models/invalid-platform-fees-amount-description-enum.md) | Optional | - | InvalidPlatformFeesAmountDescriptionEnum getDescription() | setDescription(InvalidPlatformFeesAmountDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "INVALID_PLATFORM_FEES_AMOUNT",
  "description": "The platform_fees amount cannot be greater than order amount."
}
```

