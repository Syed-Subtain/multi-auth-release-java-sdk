
# Shipping Option Not Selected 1

## Structure

`ShippingOptionNotSelected1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`ShippingOptionNotSelected1IssueEnum`](../../doc/models/shipping-option-not-selected-1-issue-enum.md) | Optional | - | ShippingOptionNotSelected1IssueEnum getIssue() | setIssue(ShippingOptionNotSelected1IssueEnum issue) |
| `Description` | [`ShippingOptionNotSelected1DescriptionEnum`](../../doc/models/shipping-option-not-selected-1-description-enum.md) | Optional | - | ShippingOptionNotSelected1DescriptionEnum getDescription() | setDescription(ShippingOptionNotSelected1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "SHIPPING_OPTION_NOT_SELECTED",
  "description": "At least one of the shipping.option should be set to 'selected = true'."
}
```

