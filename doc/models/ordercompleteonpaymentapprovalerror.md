
# ORDERCOMPLETEONPAYMENTAPPROVALERROR

## Structure

`ORDERCOMPLETEONPAYMENTAPPROVALERROR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`OrderCompleteOnPaymentApproval1IssueEnum`](../../doc/models/order-complete-on-payment-approval-1-issue-enum.md) | Optional | - | OrderCompleteOnPaymentApproval1IssueEnum getIssue() | setIssue(OrderCompleteOnPaymentApproval1IssueEnum issue) |
| `Description` | [`OrderCompleteOnPaymentApproval1DescriptionEnum`](../../doc/models/order-complete-on-payment-approval-1-description-enum.md) | Optional | - | OrderCompleteOnPaymentApproval1DescriptionEnum getDescription() | setDescription(OrderCompleteOnPaymentApproval1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "ORDER_COMPLETE_ON_PAYMENT_APPROVAL",
  "description": "A processing_instruction of `ORDER_COMPLETE_ON_PAYMENT_APPROVAL` is required for the specified payment_source."
}
```

