
# PARTIALREFUNDNOTALLOWED

## Structure

`PARTIALREFUNDNOTALLOWED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`CapturesRefund422IssuesItemsAnyof13IssueEnum`](../../doc/models/captures-refund-422-issues-items-anyof-13-issue-enum.md) | Optional | - | CapturesRefund422IssuesItemsAnyof13IssueEnum getIssue() | setIssue(CapturesRefund422IssuesItemsAnyof13IssueEnum issue) |
| `Description` | [`CapturesRefund422IssuesItemsAnyof13DescriptionEnum`](../../doc/models/captures-refund-422-issues-items-anyof-13-description-enum.md) | Optional | - | CapturesRefund422IssuesItemsAnyof13DescriptionEnum getDescription() | setDescription(CapturesRefund422IssuesItemsAnyof13DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "PARTIAL_REFUND_NOT_ALLOWED",
  "description": "You cannot do a refund less than the original capture amount."
}
```

