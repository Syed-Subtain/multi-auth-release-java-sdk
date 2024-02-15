
# TRANSACTIONDISPUTED

## Structure

`TRANSACTIONDISPUTED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`CapturesRefund422IssuesItemsAnyof21IssueEnum`](../../doc/models/captures-refund-422-issues-items-anyof-21-issue-enum.md) | Optional | - | CapturesRefund422IssuesItemsAnyof21IssueEnum getIssue() | setIssue(CapturesRefund422IssuesItemsAnyof21IssueEnum issue) |
| `Description` | [`CapturesRefund422IssuesItemsAnyof21DescriptionEnum`](../../doc/models/captures-refund-422-issues-items-anyof-21-description-enum.md) | Optional | - | CapturesRefund422IssuesItemsAnyof21DescriptionEnum getDescription() | setDescription(CapturesRefund422IssuesItemsAnyof21DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "TRANSACTION_DISPUTED",
  "description": "Partial refunds cannot be offered at this time because there is an open case on this transaction. Visit the PayPal Resolution Center to review this case."
}
```

