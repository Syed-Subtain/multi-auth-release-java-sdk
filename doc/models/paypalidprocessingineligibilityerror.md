
# PAYPALIDPROCESSINGINELIGIBILITYERROR

## Structure

`PAYPALIDPROCESSINGINELIGIBILITYERROR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`NotEligiblePaypalTransactionIdProcessingEnum`](../../doc/models/not-eligible-paypal-transaction-id-processing-enum.md) | Optional | - | NotEligiblePaypalTransactionIdProcessingEnum getIssue() | setIssue(NotEligiblePaypalTransactionIdProcessingEnum issue) |
| `Description` | [`PaypalTransactionIdProcessingPermissionErrorEnum`](../../doc/models/paypal-transaction-id-processing-permission-error-enum.md) | Optional | - | PaypalTransactionIdProcessingPermissionErrorEnum getDescription() | setDescription(PaypalTransactionIdProcessingPermissionErrorEnum description) |

## Example (as JSON)

```json
{
  "issue": "NOT_ELIGIBLE_FOR_PAYPAL_TRANSACTION_ID_PROCESSING",
  "description": "API caller is not enable to process payments using `paypal_transaction_id`. Please contact customer support to request permissions to process transactions with PayPal transaction ID."
}
```

