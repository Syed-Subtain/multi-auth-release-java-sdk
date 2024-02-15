
# REFUNDNOTPERMITTEDDUETOCHARGEBACK

## Structure

`REFUNDNOTPERMITTEDDUETOCHARGEBACK`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`CapturesRefund422IssuesItemsAnyof20IssueEnum`](../../doc/models/captures-refund-422-issues-items-anyof-20-issue-enum.md) | Optional | - | CapturesRefund422IssuesItemsAnyof20IssueEnum getIssue() | setIssue(CapturesRefund422IssuesItemsAnyof20IssueEnum issue) |
| `Description` | [`CapturesRefund422IssuesItemsAnyof20DescriptionEnum`](../../doc/models/captures-refund-422-issues-items-anyof-20-description-enum.md) | Optional | - | CapturesRefund422IssuesItemsAnyof20DescriptionEnum getDescription() | setDescription(CapturesRefund422IssuesItemsAnyof20DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "REFUND_NOT_PERMITTED_DUE_TO_CHARGEBACK",
  "description": "Refunds are not allowed on this capture due to a chargeback on the card or bank. Please contact the payee to resolve the chargeback."
}
```

