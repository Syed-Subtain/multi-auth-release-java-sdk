
# PREVIOUSTRANSACTIONREFERENCEHASCHARGEBACK

## Structure

`PREVIOUSTRANSACTIONREFERENCEHASCHARGEBACK`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PreviousTransactionReferenceChargebackEnum`](../../doc/models/previous-transaction-reference-chargeback-enum.md) | Optional | - | PreviousTransactionReferenceChargebackEnum getIssue() | setIssue(PreviousTransactionReferenceChargebackEnum issue) |
| `Description` | [`CaptureWithChargebackNotUsableEnum`](../../doc/models/capture-with-chargeback-not-usable-enum.md) | Optional | - | CaptureWithChargebackNotUsableEnum getDescription() | setDescription(CaptureWithChargebackNotUsableEnum description) |

## Example (as JSON)

```json
{
  "issue": "PREVIOUS_TRANSACTION_REFERENCE_HAS_CHARGEBACK",
  "description": "The capture referenced by `previous_transaction_reference` has a chargeback and hence cannot be used for this order. Please use a `previous_transaction_reference` which does not have a chargeback."
}
```

