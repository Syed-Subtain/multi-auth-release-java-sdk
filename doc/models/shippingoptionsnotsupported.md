
# SHIPPINGOPTIONSNOTSUPPORTED

## Structure

`SHIPPINGOPTIONSNOTSUPPORTED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`ShippingOptionNotSupportedIssueEnum`](../../doc/models/shipping-option-not-supported-issue-enum.md) | Optional | - | ShippingOptionNotSupportedIssueEnum getIssue() | setIssue(ShippingOptionNotSupportedIssueEnum issue) |
| `Description` | [`ShippingOptionNotSupportedDescriptionEnum`](../../doc/models/shipping-option-not-supported-description-enum.md) | Optional | - | ShippingOptionNotSupportedDescriptionEnum getDescription() | setDescription(ShippingOptionNotSupportedDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "SHIPPING_OPTIONS_NOT_SUPPORTED",
  "description": "Shipping options are not supported when `shipping.type` is specified or when 'application_context.shipping_preference' is set as 'NO_SHIPPING' or 'SET_PROVIDED_ADDRESS'."
}
```

