
# PLATFORMFEEEXCEEDED

## Structure

`PLATFORMFEEEXCEEDED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`CapturesRefund422IssuesItemsAnyof22IssueEnum`](../../doc/models/captures-refund-422-issues-items-anyof-22-issue-enum.md) | Optional | - | CapturesRefund422IssuesItemsAnyof22IssueEnum getIssue() | setIssue(CapturesRefund422IssuesItemsAnyof22IssueEnum issue) |
| `Description` | [`CapturesRefund422IssuesItemsAnyof22DescriptionEnum`](../../doc/models/captures-refund-422-issues-items-anyof-22-description-enum.md) | Optional | - | CapturesRefund422IssuesItemsAnyof22DescriptionEnum getDescription() | setDescription(CapturesRefund422IssuesItemsAnyof22DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "PLATFORM_FEE_EXCEEDED",
  "description": "Platform fee amount specified exceeds the amount that is available for refund. You can only refund up to the available platform fee amount. This error is also returned when no platform_fee was specified or was zero when the payment was captured."
}
```

