
# ITEMTOTALMISMATCH

## Structure

`ITEMTOTALMISMATCH`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`ItemTotalMismatchIssueEnum`](../../doc/models/item-total-mismatch-issue-enum.md) | Optional | - | ItemTotalMismatchIssueEnum getIssue() | setIssue(ItemTotalMismatchIssueEnum issue) |
| `Description` | [`ItemTotalMismatchDescriptionEnum`](../../doc/models/item-total-mismatch-description-enum.md) | Optional | - | ItemTotalMismatchDescriptionEnum getDescription() | setDescription(ItemTotalMismatchDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "ITEM_TOTAL_MISMATCH",
  "description": "Should equal sum of (unit_amount * quantity) across all items for a given purchase_unit."
}
```

