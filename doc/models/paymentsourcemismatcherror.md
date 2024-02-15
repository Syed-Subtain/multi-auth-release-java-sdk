
# PAYMENTSOURCEMISMATCHERROR

## Structure

`PAYMENTSOURCEMISMATCHERROR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PaymentSourceMismatch1IssueEnum`](../../doc/models/payment-source-mismatch-1-issue-enum.md) | Optional | - | PaymentSourceMismatch1IssueEnum getIssue() | setIssue(PaymentSourceMismatch1IssueEnum issue) |
| `Description` | [`PaymentSourceMismatch1DescriptionEnum`](../../doc/models/payment-source-mismatch-1-description-enum.md) | Optional | - | PaymentSourceMismatch1DescriptionEnum getDescription() | setDescription(PaymentSourceMismatch1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "PAYMENT_SOURCE_MISMATCH",
  "description": "The `payment_source` in the request must match the `payment_source` used for the authorization or capture referenced by `previous_transaction_reference`. Please use `previous_transaction_reference` whose `payment_source` matches with the `payment_source` specified in the order."
}
```

