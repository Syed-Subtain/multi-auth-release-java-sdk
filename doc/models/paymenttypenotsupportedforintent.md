
# PAYMENTTYPENOTSUPPORTEDFORINTENT

## Structure

`PAYMENTTYPENOTSUPPORTEDFORINTENT`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PaymentTypeNotSupportedForIntentIssueEnum`](../../doc/models/payment-type-not-supported-for-intent-issue-enum.md) | Optional | - | PaymentTypeNotSupportedForIntentIssueEnum getIssue() | setIssue(PaymentTypeNotSupportedForIntentIssueEnum issue) |
| `Description` | [`PaymentTypeNotSupportedForIntentDescriptionEnum`](../../doc/models/payment-type-not-supported-for-intent-description-enum.md) | Optional | - | PaymentTypeNotSupportedForIntentDescriptionEnum getDescription() | setDescription(PaymentTypeNotSupportedForIntentDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "PAYMENT_TYPE_NOT_SUPPORTED_FOR_INTENT",
  "description": "Provided payment type not supported for order intent. Payment authorizations are supported only for order with `intent=AUTHORIZE` and payment captures are supported only for order with `intent=CAPTURE`."
}
```

