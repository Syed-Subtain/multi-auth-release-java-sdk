
# PREFERREDPAYMENTSOURCEMISMATCHERROR

## Structure

`PREFERREDPAYMENTSOURCEMISMATCHERROR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PreferredPaymentSourceMismatch1IssueEnum`](../../doc/models/preferred-payment-source-mismatch-1-issue-enum.md) | Optional | - | PreferredPaymentSourceMismatch1IssueEnum getIssue() | setIssue(PreferredPaymentSourceMismatch1IssueEnum issue) |
| `Description` | [`PreferredPaymentSourceMismatch1DescriptionEnum`](../../doc/models/preferred-payment-source-mismatch-1-description-enum.md) | Optional | - | PreferredPaymentSourceMismatch1DescriptionEnum getDescription() | setDescription(PreferredPaymentSourceMismatch1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "PREFERRED_PAYMENT_SOURCE_MISMATCH",
  "description": "Payment Source must exactly match the Preferred Payment Source that was provided during order creation."
}
```

