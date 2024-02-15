
# REFUNDAMOUNTEXCEEDED

## Structure

`REFUNDAMOUNTEXCEEDED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`CapturesRefund422IssuesItemsAnyof10IssueEnum`](../../doc/models/captures-refund-422-issues-items-anyof-10-issue-enum.md) | Optional | - | CapturesRefund422IssuesItemsAnyof10IssueEnum getIssue() | setIssue(CapturesRefund422IssuesItemsAnyof10IssueEnum issue) |
| `Description` | [`CapturesRefund422IssuesItemsAnyof10DescriptionEnum`](../../doc/models/captures-refund-422-issues-items-anyof-10-description-enum.md) | Optional | - | CapturesRefund422IssuesItemsAnyof10DescriptionEnum getDescription() | setDescription(CapturesRefund422IssuesItemsAnyof10DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "REFUND_AMOUNT_EXCEEDED",
  "description": "The refund amount must be less than or equal to the capture amount that has not yet been refunded."
}
```

