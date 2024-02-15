
# REFUNDISRESTRICTED

## Structure

`REFUNDISRESTRICTED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`CapturesRefund422IssuesItemsAnyof23IssueEnum`](../../doc/models/captures-refund-422-issues-items-anyof-23-issue-enum.md) | Optional | - | CapturesRefund422IssuesItemsAnyof23IssueEnum getIssue() | setIssue(CapturesRefund422IssuesItemsAnyof23IssueEnum issue) |
| `Description` | [`CapturesRefund422IssuesItemsAnyof23DescriptionEnum`](../../doc/models/captures-refund-422-issues-items-anyof-23-description-enum.md) | Optional | - | CapturesRefund422IssuesItemsAnyof23DescriptionEnum getDescription() | setDescription(CapturesRefund422IssuesItemsAnyof23DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "REFUND_IS_RESTRICTED",
  "description": "This refund can only be processed by the API caller that had 'captured' the transaction. If you facilitate your transactions via a platform/partner, please initiate a refund through them."
}
```

