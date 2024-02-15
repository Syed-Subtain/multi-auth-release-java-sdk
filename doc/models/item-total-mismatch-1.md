
# Item Total Mismatch 1

## Structure

`ItemTotalMismatch1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`ItemTotalMismatch1IssueEnum`](../../doc/models/item-total-mismatch-1-issue-enum.md) | Optional | - | ItemTotalMismatch1IssueEnum getIssue() | setIssue(ItemTotalMismatch1IssueEnum issue) |
| `Description` | [`ItemTotalMismatch1DescriptionEnum`](../../doc/models/item-total-mismatch-1-description-enum.md) | Optional | - | ItemTotalMismatch1DescriptionEnum getDescription() | setDescription(ItemTotalMismatch1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "ITEM_TOTAL_MISMATCH",
  "description": "Should equal sum of (unit_amount * quantity) across all items for a given purchase_unit."
}
```

