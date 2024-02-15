
# PAYMENTSOURCEMISMATCH

## Structure

`PAYMENTSOURCEMISMATCH`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PaymentSourceMismatchIssueEnum`](../../doc/models/payment-source-mismatch-issue-enum.md) | Optional | - | PaymentSourceMismatchIssueEnum getIssue() | setIssue(PaymentSourceMismatchIssueEnum issue) |
| `Description` | [`PaymentSourceMismatchDescriptionEnum`](../../doc/models/payment-source-mismatch-description-enum.md) | Optional | - | PaymentSourceMismatchDescriptionEnum getDescription() | setDescription(PaymentSourceMismatchDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "PAYMENT_SOURCE_MISMATCH",
  "description": "The `payment_source` in the request must match the `payment_source` used for the authorization or capture referenced by `previous_transaction_reference`. Please use `previous_transaction_reference` whose `payment_source` matches with the `payment_source` specified in the order."
}
```

