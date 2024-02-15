
# REFUNDFAILEDINSUFFICIENTFUNDS

## Structure

`REFUNDFAILEDINSUFFICIENTFUNDS`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`CapturesRefund422IssuesItemsAnyof12IssueEnum`](../../doc/models/captures-refund-422-issues-items-anyof-12-issue-enum.md) | Optional | - | CapturesRefund422IssuesItemsAnyof12IssueEnum getIssue() | setIssue(CapturesRefund422IssuesItemsAnyof12IssueEnum issue) |
| `Description` | [`CapturesRefund422IssuesItemsAnyof12DescriptionEnum`](../../doc/models/captures-refund-422-issues-items-anyof-12-description-enum.md) | Optional | - | CapturesRefund422IssuesItemsAnyof12DescriptionEnum getDescription() | setDescription(CapturesRefund422IssuesItemsAnyof12DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "REFUND_FAILED_INSUFFICIENT_FUNDS",
  "description": "Capture could not be refunded due to insufficient funds. Please check to see if you have sufficient funds in your PayPal account or if the bank account linked to your PayPal account is verified and has sufficient funds."
}
```

