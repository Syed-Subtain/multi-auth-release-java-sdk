
# PENDINGCAPTURE

## Structure

`PENDINGCAPTURE`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`CapturesRefund422IssuesItemsAnyof15IssueEnum`](../../doc/models/captures-refund-422-issues-items-anyof-15-issue-enum.md) | Optional | - | CapturesRefund422IssuesItemsAnyof15IssueEnum getIssue() | setIssue(CapturesRefund422IssuesItemsAnyof15IssueEnum issue) |
| `Description` | [`CapturesRefund422IssuesItemsAnyof15DescriptionEnum`](../../doc/models/captures-refund-422-issues-items-anyof-15-description-enum.md) | Optional | - | CapturesRefund422IssuesItemsAnyof15DescriptionEnum getDescription() | setDescription(CapturesRefund422IssuesItemsAnyof15DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "PENDING_CAPTURE",
  "description": "Cannot initiate a refund as the capture is pending. Capture is typically pending when the payer has funded the transaction using e-check/bank funded."
}
```

