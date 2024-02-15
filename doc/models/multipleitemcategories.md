
# MULTIPLEITEMCATEGORIES

## Structure

`MULTIPLEITEMCATEGORIES`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`MultipleItemCategoriesIssueEnum`](../../doc/models/multiple-item-categories-issue-enum.md) | Optional | - | MultipleItemCategoriesIssueEnum getIssue() | setIssue(MultipleItemCategoriesIssueEnum issue) |
| `Description` | [`MultipleItemCategoriesDescriptionEnum`](../../doc/models/multiple-item-categories-description-enum.md) | Optional | - | MultipleItemCategoriesDescriptionEnum getDescription() | setDescription(MultipleItemCategoriesDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "MULTIPLE_ITEM_CATEGORIES",
  "description": "For a given 'purchase_unit' the 'items.category' could be either \"PHYSICAL_GOODS\" and/or \"DIGITAL_GOODS\" or just \"DONATION\".  'items.category' as \"DONATION\" cannot be combined with items with either \"PHYSICAL_GOODS\" or \"DIGITAL_GOODS\"."
}
```

