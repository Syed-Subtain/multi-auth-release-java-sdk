
# REFUNDTIMELIMITEXCEEDED

## Structure

`REFUNDTIMELIMITEXCEEDED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`CapturesRefund422IssuesItemsAnyof9IssueEnum`](../../doc/models/captures-refund-422-issues-items-anyof-9-issue-enum.md) | Optional | - | CapturesRefund422IssuesItemsAnyof9IssueEnum getIssue() | setIssue(CapturesRefund422IssuesItemsAnyof9IssueEnum issue) |
| `Description` | [`CapturesRefund422IssuesItemsAnyof9DescriptionEnum`](../../doc/models/captures-refund-422-issues-items-anyof-9-description-enum.md) | Optional | - | CapturesRefund422IssuesItemsAnyof9DescriptionEnum getDescription() | setDescription(CapturesRefund422IssuesItemsAnyof9DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "REFUND_TIME_LIMIT_EXCEEDED",
  "description": "You are over the time limit to perform a refund on this capture"
}
```

