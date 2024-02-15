
# MAXNUMBEROFREFUNDSEXCEEDED

## Structure

`MAXNUMBEROFREFUNDSEXCEEDED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`CapturesRefund422IssuesItemsAnyof14IssueEnum`](../../doc/models/captures-refund-422-issues-items-anyof-14-issue-enum.md) | Optional | - | CapturesRefund422IssuesItemsAnyof14IssueEnum getIssue() | setIssue(CapturesRefund422IssuesItemsAnyof14IssueEnum issue) |
| `Description` | [`CapturesRefund422IssuesItemsAnyof14DescriptionEnum`](../../doc/models/captures-refund-422-issues-items-anyof-14-description-enum.md) | Optional | - | CapturesRefund422IssuesItemsAnyof14DescriptionEnum getDescription() | setDescription(CapturesRefund422IssuesItemsAnyof14DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "MAX_NUMBER_OF_REFUNDS_EXCEEDED",
  "description": "You have exceeded the maximum number of refund attempts for this capture."
}
```

