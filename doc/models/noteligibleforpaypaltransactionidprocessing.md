
# NOTELIGIBLEFORPAYPALTRANSACTIONIDPROCESSING

## Structure

`NOTELIGIBLEFORPAYPALTRANSACTIONIDPROCESSING`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`NotEligibleForPaypalIdProcessingEnum`](../../doc/models/not-eligible-for-paypal-id-processing-enum.md) | Optional | - | NotEligibleForPaypalIdProcessingEnum getIssue() | setIssue(NotEligibleForPaypalIdProcessingEnum issue) |
| `Description` | [`PaypalTransactionIdProcessingPermissionNeededEnum`](../../doc/models/paypal-transaction-id-processing-permission-needed-enum.md) | Optional | - | PaypalTransactionIdProcessingPermissionNeededEnum getDescription() | setDescription(PaypalTransactionIdProcessingPermissionNeededEnum description) |

## Example (as JSON)

```json
{
  "issue": "NOT_ELIGIBLE_FOR_PAYPAL_TRANSACTION_ID_PROCESSING",
  "description": "API caller is not enable to process payments using `paypal_transaction_id`. Please contact customer support to request permissions to process transactions with PayPal transaction ID."
}
```

