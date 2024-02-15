
# PAYMENTALREADYAPPROVED

## Structure

`PAYMENTALREADYAPPROVED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PaymentAlreadyApprovedIssueEnum`](../../doc/models/payment-already-approved-issue-enum.md) | Optional | - | PaymentAlreadyApprovedIssueEnum getIssue() | setIssue(PaymentAlreadyApprovedIssueEnum issue) |
| `Description` | [`PaymentAlreadyApprovedDescriptionEnum`](../../doc/models/payment-already-approved-description-enum.md) | Optional | - | PaymentAlreadyApprovedDescriptionEnum getDescription() | setDescription(PaymentAlreadyApprovedDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "PAYMENT_ALREADY_APPROVED",
  "description": "The payment has already been approved.  Please capture the order, or create and confirm a new order with this payment source."
}
```

