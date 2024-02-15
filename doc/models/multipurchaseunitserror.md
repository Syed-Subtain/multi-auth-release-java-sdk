
# MULTIPURCHASEUNITSERROR

## Structure

`MULTIPURCHASEUNITSERROR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`MerchantInitiatedMultiplePurchaseUnitsIssueEnum`](../../doc/models/merchant-initiated-multiple-purchase-units-issue-enum.md) | Optional | - | MerchantInitiatedMultiplePurchaseUnitsIssueEnum getIssue() | setIssue(MerchantInitiatedMultiplePurchaseUnitsIssueEnum issue) |
| `Description` | [`ErrMerchInitMultiUnitsNotSupportedEnum`](../../doc/models/err-merch-init-multi-units-not-supported-enum.md) | Optional | - | ErrMerchInitMultiUnitsNotSupportedEnum getDescription() | setDescription(ErrMerchInitMultiUnitsNotSupportedEnum description) |

## Example (as JSON)

```json
{
  "issue": "MERCHANT_INITIATED_WITH_MULTIPLE_PURCHASE_UNITS",
  "description": "`stored_payment_source.payment_initiator` = `MERCHANT` is not supported if more than one purchase_unit is present in the Order. Merchant initiated payments are not supported from orders with more than one purchase_unit. Please retry the request with multiple Order requests (one for each purchase_unit)."
}
```

