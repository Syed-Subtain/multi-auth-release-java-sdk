
# ITEMTOTALREQUIRED

## Structure

`ITEMTOTALREQUIRED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`ItemTotalRequiredIssueEnum`](../../doc/models/item-total-required-issue-enum.md) | Optional | - | ItemTotalRequiredIssueEnum getIssue() | setIssue(ItemTotalRequiredIssueEnum issue) |
| `Description` | [`ItemTotalRequiredDescriptionEnum`](../../doc/models/item-total-required-description-enum.md) | Optional | - | ItemTotalRequiredDescriptionEnum getDescription() | setDescription(ItemTotalRequiredDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "ITEM_TOTAL_REQUIRED",
  "description": "If item details are specified (items.unit_amount and items.quantity) corresponding amount.breakdown.item_total is required."
}
```

