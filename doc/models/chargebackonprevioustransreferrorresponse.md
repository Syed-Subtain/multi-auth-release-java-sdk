
# CHARGEBACKONPREVIOUSTRANSREFERRORRESPONSE

## Structure

`CHARGEBACKONPREVIOUSTRANSREFERRORRESPONSE`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PrevTxRefHasChargebackEnum`](../../doc/models/prev-tx-ref-has-chargeback-enum.md) | Optional | - | PrevTxRefHasChargebackEnum getIssue() | setIssue(PrevTxRefHasChargebackEnum issue) |
| `Description` | [`CaptureWithChargebackNotUsableErrorEnum`](../../doc/models/capture-with-chargeback-not-usable-error-enum.md) | Optional | - | CaptureWithChargebackNotUsableErrorEnum getDescription() | setDescription(CaptureWithChargebackNotUsableErrorEnum description) |

## Example (as JSON)

```json
{
  "issue": "PREVIOUS_TRANSACTION_REFERENCE_HAS_CHARGEBACK",
  "description": "The capture referenced by `previous_transaction_reference` has a chargeback and hence cannot be used for this order. Please use a `previous_transaction_reference` which does not have a chargeback."
}
```

