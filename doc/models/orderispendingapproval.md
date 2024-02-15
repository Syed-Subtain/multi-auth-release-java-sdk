
# ORDERISPENDINGAPPROVAL

## Structure

`ORDERISPENDINGAPPROVAL`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`OrderIsPendingApprovalIssueEnum`](../../doc/models/order-is-pending-approval-issue-enum.md) | Optional | - | OrderIsPendingApprovalIssueEnum getIssue() | setIssue(OrderIsPendingApprovalIssueEnum issue) |
| `Description` | [`OrderIsPendingApprovalDescriptionEnum`](../../doc/models/order-is-pending-approval-description-enum.md) | Optional | - | OrderIsPendingApprovalDescriptionEnum getDescription() | setDescription(OrderIsPendingApprovalDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "ORDER_IS_PENDING_APPROVAL",
  "description": "The order was confirmed and payer action completed but order approval processing from PayPal is pending. No action is needed from Payee or Payer. Please wait until order status changes to 'APPROVED'."
}
```

