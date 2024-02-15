
# SHIPPINGOPTIONNOTSELECTED

## Structure

`SHIPPINGOPTIONNOTSELECTED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`ShippingOptionNotSelectedIssueEnum`](../../doc/models/shipping-option-not-selected-issue-enum.md) | Optional | - | ShippingOptionNotSelectedIssueEnum getIssue() | setIssue(ShippingOptionNotSelectedIssueEnum issue) |
| `Description` | [`ShippingOptionNotSelectedDescriptionEnum`](../../doc/models/shipping-option-not-selected-description-enum.md) | Optional | - | ShippingOptionNotSelectedDescriptionEnum getDescription() | setDescription(ShippingOptionNotSelectedDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "SHIPPING_OPTION_NOT_SELECTED",
  "description": "At least one of the shipping.option should be set to 'selected = true'."
}
```

