
# SHIPPINGADDRESSINVALIDERRORRESPONSE

## Structure

`SHIPPINGADDRESSINVALIDERRORRESPONSE`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`ShippingAddressInvalid3IssueEnum`](../../doc/models/shipping-address-invalid-3-issue-enum.md) | Optional | - | ShippingAddressInvalid3IssueEnum getIssue() | setIssue(ShippingAddressInvalid3IssueEnum issue) |
| `Description` | [`ShippingAddressInvalid3DescriptionEnum`](../../doc/models/shipping-address-invalid-3-description-enum.md) | Optional | - | ShippingAddressInvalid3DescriptionEnum getDescription() | setDescription(ShippingAddressInvalid3DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "SHIPPING_ADDRESS_INVALID",
  "description": "Provided shipping address is invalid."
}
```

