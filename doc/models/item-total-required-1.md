
# Item Total Required 1

## Structure

`ItemTotalRequired1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`ItemTotalRequired1IssueEnum`](../../doc/models/item-total-required-1-issue-enum.md) | Optional | - | ItemTotalRequired1IssueEnum getIssue() | setIssue(ItemTotalRequired1IssueEnum issue) |
| `Description` | [`ItemTotalRequired1DescriptionEnum`](../../doc/models/item-total-required-1-description-enum.md) | Optional | - | ItemTotalRequired1DescriptionEnum getDescription() | setDescription(ItemTotalRequired1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "ITEM_TOTAL_REQUIRED",
  "description": "If item details are specified (items.unit_amount and items.quantity) corresponding amount.breakdown.item_total is required."
}
```

