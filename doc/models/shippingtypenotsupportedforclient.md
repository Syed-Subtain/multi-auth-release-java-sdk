
# SHIPPINGTYPENOTSUPPORTEDFORCLIENT

## Structure

`SHIPPINGTYPENOTSUPPORTEDFORCLIENT`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`ShippingTypeNotSupportedForClientIssueEnum`](../../doc/models/shipping-type-not-supported-for-client-issue-enum.md) | Optional | - | ShippingTypeNotSupportedForClientIssueEnum getIssue() | setIssue(ShippingTypeNotSupportedForClientIssueEnum issue) |
| `Description` | [`ShippingTypeNotSupportedForClientDescriptionEnum`](../../doc/models/shipping-type-not-supported-for-client-description-enum.md) | Optional | - | ShippingTypeNotSupportedForClientDescriptionEnum getDescription() | setDescription(ShippingTypeNotSupportedForClientDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "SHIPPING_TYPE_NOT_SUPPORTED_FOR_CLIENT",
  "description": "The API Caller account is not setup to be able to support a `shipping.type`=`PICKUP_IN_PERSON`. This feature is only supported for <a href=\"https://www.paypal.com/us/business/platforms-and-marketplaces\">PayPal Commerce Platform for Platforms and Marketplaces</a>."
}
```

