
# REFUNDCAPTURECURRENCYMISMATCH

## Structure

`REFUNDCAPTURECURRENCYMISMATCH`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`CapturesRefund422IssuesItemsAnyof7IssueEnum`](../../doc/models/captures-refund-422-issues-items-anyof-7-issue-enum.md) | Optional | - | CapturesRefund422IssuesItemsAnyof7IssueEnum getIssue() | setIssue(CapturesRefund422IssuesItemsAnyof7IssueEnum issue) |
| `Description` | [`CapturesRefund422IssuesItemsAnyof7DescriptionEnum`](../../doc/models/captures-refund-422-issues-items-anyof-7-description-enum.md) | Optional | - | CapturesRefund422IssuesItemsAnyof7DescriptionEnum getDescription() | setDescription(CapturesRefund422IssuesItemsAnyof7DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "REFUND_CAPTURE_CURRENCY_MISMATCH",
  "description": "Refund must be in the same currency as the capture"
}
```

