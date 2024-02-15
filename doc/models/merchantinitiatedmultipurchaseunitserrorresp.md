
# MERCHANTINITIATEDMULTIPURCHASEUNITSERRORRESP

## Structure

`MERCHANTINITIATEDMULTIPURCHASEUNITSERRORRESP`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`MerchInitMultiPurchaseUnitsEnum`](../../doc/models/merch-init-multi-purchase-units-enum.md) | Optional | - | MerchInitMultiPurchaseUnitsEnum getIssue() | setIssue(MerchInitMultiPurchaseUnitsEnum issue) |
| `Description` | [`ErrMerchInitMultiUnitsNotSupportedDescEnum`](../../doc/models/err-merch-init-multi-units-not-supported-desc-enum.md) | Optional | - | ErrMerchInitMultiUnitsNotSupportedDescEnum getDescription() | setDescription(ErrMerchInitMultiUnitsNotSupportedDescEnum description) |

## Example (as JSON)

```json
{
  "issue": "MERCHANT_INITIATED_WITH_MULTIPLE_PURCHASE_UNITS",
  "description": "`stored_payment_source.payment_initiator` = `MERCHANT` is not supported if more than one purchase_unit is present in the Order. Merchant initiated payments are not supported from orders with more than one purchase_unit. Please retry the request with multiple Order requests (one for each purchase_unit)."
}
```

