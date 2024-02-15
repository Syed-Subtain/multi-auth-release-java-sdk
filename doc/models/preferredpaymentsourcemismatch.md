
# PREFERREDPAYMENTSOURCEMISMATCH

## Structure

`PREFERREDPAYMENTSOURCEMISMATCH`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PreferredPaymentSourceMismatchIssueEnum`](../../doc/models/preferred-payment-source-mismatch-issue-enum.md) | Optional | - | PreferredPaymentSourceMismatchIssueEnum getIssue() | setIssue(PreferredPaymentSourceMismatchIssueEnum issue) |
| `Description` | [`PreferredPaymentSourceMismatchDescriptionEnum`](../../doc/models/preferred-payment-source-mismatch-description-enum.md) | Optional | - | PreferredPaymentSourceMismatchDescriptionEnum getDescription() | setDescription(PreferredPaymentSourceMismatchDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "PREFERRED_PAYMENT_SOURCE_MISMATCH",
  "description": "Payment Source must exactly match the Preferred Payment Source that was provided during order creation."
}
```

