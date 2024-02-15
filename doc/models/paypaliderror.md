
# PAYPALIDERROR

## Structure

`PAYPALIDERROR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`NotEligiblePaypalTxIdProcessingEnum`](../../doc/models/not-eligible-paypal-tx-id-processing-enum.md) | Optional | - | NotEligiblePaypalTxIdProcessingEnum getIssue() | setIssue(NotEligiblePaypalTxIdProcessingEnum issue) |
| `Description` | [`PaypalTxIdProcessingPermissionNeededEnum`](../../doc/models/paypal-tx-id-processing-permission-needed-enum.md) | Optional | - | PaypalTxIdProcessingPermissionNeededEnum getDescription() | setDescription(PaypalTxIdProcessingPermissionNeededEnum description) |

## Example (as JSON)

```json
{
  "issue": "NOT_ELIGIBLE_FOR_PAYPAL_TRANSACTION_ID_PROCESSING",
  "description": "API caller is not enable to process payments using `paypal_transaction_id`. Please contact customer support to request permissions to process transactions with PayPal transaction ID."
}
```

