
# UNSUPPORTEDSHIPPINGTYPE

## Structure

`UNSUPPORTEDSHIPPINGTYPE`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`UnsupportedShippingTypeIssueEnum`](../../doc/models/unsupported-shipping-type-issue-enum.md) | Optional | - | UnsupportedShippingTypeIssueEnum getIssue() | setIssue(UnsupportedShippingTypeIssueEnum issue) |
| `Description` | [`UnsupportedShippingTypeDescriptionEnum`](../../doc/models/unsupported-shipping-type-description-enum.md) | Optional | - | UnsupportedShippingTypeDescriptionEnum getDescription() | setDescription(UnsupportedShippingTypeDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "UNSUPPORTED_SHIPPING_TYPE",
  "description": "The provided `shipping.type` is only supported for `application_context.shipping_preference`=`SET_PROVIDED_ADDRESS` or `NO_SHIPPING`."
}
```

