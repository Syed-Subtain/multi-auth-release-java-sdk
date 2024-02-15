
# PAYPALIDPROCESSINGINELIGIBILITYERRORRESPONSE

## Structure

`PAYPALIDPROCESSINGINELIGIBILITYERRORRESPONSE`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`NotEligiblePaypalTxIdProcessingIssueEnum`](../../doc/models/not-eligible-paypal-tx-id-processing-issue-enum.md) | Optional | - | NotEligiblePaypalTxIdProcessingIssueEnum getIssue() | setIssue(NotEligiblePaypalTxIdProcessingIssueEnum issue) |
| `Description` | [`PaypalTxIdProcessingPermissionNeededDescEnum`](../../doc/models/paypal-tx-id-processing-permission-needed-desc-enum.md) | Optional | - | PaypalTxIdProcessingPermissionNeededDescEnum getDescription() | setDescription(PaypalTxIdProcessingPermissionNeededDescEnum description) |

## Example (as JSON)

```json
{
  "issue": "NOT_ELIGIBLE_FOR_PAYPAL_TRANSACTION_ID_PROCESSING",
  "description": "API caller is not enable to process payments using `paypal_transaction_id`. Please contact customer support to request permissions to process transactions with PayPal transaction ID."
}
```

