
# PLATFORMFEENOTENABLED

## Structure

`PLATFORMFEENOTENABLED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`CapturesRefund422IssuesItemsAnyof24IssueEnum`](../../doc/models/captures-refund-422-issues-items-anyof-24-issue-enum.md) | Optional | - | CapturesRefund422IssuesItemsAnyof24IssueEnum getIssue() | setIssue(CapturesRefund422IssuesItemsAnyof24IssueEnum issue) |
| `Description` | [`CapturesRefund422IssuesItemsAnyof24DescriptionEnum`](../../doc/models/captures-refund-422-issues-items-anyof-24-description-enum.md) | Optional | - | CapturesRefund422IssuesItemsAnyof24DescriptionEnum getDescription() | setDescription(CapturesRefund422IssuesItemsAnyof24DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "PLATFORM_FEE_NOT_ENABLED",
  "description": "The API Caller account is not setup to be able to process refunds with 'platform_fees'. Please contact your Account Manager. This feature is useful when you want to contribute a portion of the 'platform_fees' you had capture as part of the refund being processed."
}
```

