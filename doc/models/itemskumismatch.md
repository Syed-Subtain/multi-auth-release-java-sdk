
# ITEMSKUMISMATCH

## Structure

`ITEMSKUMISMATCH`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`ItemSkuMismatchIssueEnum`](../../doc/models/item-sku-mismatch-issue-enum.md) | Optional | - | ItemSkuMismatchIssueEnum getIssue() | setIssue(ItemSkuMismatchIssueEnum issue) |
| `Description` | [`ItemSkuMismatchDescriptionEnum`](../../doc/models/item-sku-mismatch-description-enum.md) | Optional | - | ItemSkuMismatchDescriptionEnum getDescription() | setDescription(ItemSkuMismatchDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "ITEM_SKU_MISMATCH",
  "description": "Item sku must match one of the items sku that was provided during order creation."
}
```

