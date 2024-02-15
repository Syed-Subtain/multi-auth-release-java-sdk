
# Invalid Platform Fees Amount 1

## Structure

`InvalidPlatformFeesAmount1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`InvalidPlatformFeesAmount1IssueEnum`](../../doc/models/invalid-platform-fees-amount-1-issue-enum.md) | Optional | - | InvalidPlatformFeesAmount1IssueEnum getIssue() | setIssue(InvalidPlatformFeesAmount1IssueEnum issue) |
| `Description` | [`InvalidPlatformFeesAmount1DescriptionEnum`](../../doc/models/invalid-platform-fees-amount-1-description-enum.md) | Optional | - | InvalidPlatformFeesAmount1DescriptionEnum getDescription() | setDescription(InvalidPlatformFeesAmount1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "INVALID_PLATFORM_FEES_AMOUNT",
  "description": "The platform_fees amount cannot be greater than order amount."
}
```

