
# ITEMSKUMISMATCHERROR

## Structure

`ITEMSKUMISMATCHERROR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`ItemSkuMismatch1IssueEnum`](../../doc/models/item-sku-mismatch-1-issue-enum.md) | Optional | - | ItemSkuMismatch1IssueEnum getIssue() | setIssue(ItemSkuMismatch1IssueEnum issue) |
| `Description` | [`ItemSkuMismatch1DescriptionEnum`](../../doc/models/item-sku-mismatch-1-description-enum.md) | Optional | - | ItemSkuMismatch1DescriptionEnum getDescription() | setDescription(ItemSkuMismatch1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "ITEM_SKU_MISMATCH",
  "description": "Item sku must match one of the items sku that was provided during order creation."
}
```

