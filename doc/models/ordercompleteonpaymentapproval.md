
# ORDERCOMPLETEONPAYMENTAPPROVAL

## Structure

`ORDERCOMPLETEONPAYMENTAPPROVAL`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`OrderCompleteOnPaymentApprovalIssueEnum`](../../doc/models/order-complete-on-payment-approval-issue-enum.md) | Optional | - | OrderCompleteOnPaymentApprovalIssueEnum getIssue() | setIssue(OrderCompleteOnPaymentApprovalIssueEnum issue) |
| `Description` | [`OrderCompleteOnPaymentApprovalDescriptionEnum`](../../doc/models/order-complete-on-payment-approval-description-enum.md) | Optional | - | OrderCompleteOnPaymentApprovalDescriptionEnum getDescription() | setDescription(OrderCompleteOnPaymentApprovalDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "ORDER_COMPLETE_ON_PAYMENT_APPROVAL",
  "description": "A processing_instruction of `ORDER_COMPLETE_ON_PAYMENT_APPROVAL` is required for the specified payment_source. Please refer to the integration guide https://developer.paypal.com/docs/limited-release/alternative-payment-methods-with-orders/ for more details"
}
```

