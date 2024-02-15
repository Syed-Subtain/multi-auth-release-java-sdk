
# REFUNDAMOUNTTOOLOW

## Structure

`REFUNDAMOUNTTOOLOW`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`CapturesRefund422IssuesItemsAnyof11IssueEnum`](../../doc/models/captures-refund-422-issues-items-anyof-11-issue-enum.md) | Optional | - | CapturesRefund422IssuesItemsAnyof11IssueEnum getIssue() | setIssue(CapturesRefund422IssuesItemsAnyof11IssueEnum issue) |
| `Description` | [`CapturesRefund422IssuesItemsAnyof11DescriptionEnum`](../../doc/models/captures-refund-422-issues-items-anyof-11-description-enum.md) | Optional | - | CapturesRefund422IssuesItemsAnyof11DescriptionEnum getDescription() | setDescription(CapturesRefund422IssuesItemsAnyof11DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "REFUND_AMOUNT_TOO_LOW",
  "description": "The amount after applying currency conversion is zero and hence the capture cannot be refunded. The currency conversion is required because the currency of the capture is different than the currency in which the amount was settled into the payee account."
}
```

