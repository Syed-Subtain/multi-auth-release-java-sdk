
# Orders Patch 422

## Structure

`OrdersPatch422`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issues` | [`List<OrdersPatch422IssuesItems>`](../../doc/models/containers/orders-patch-422-issues-items.md) | Optional | - | List<OrdersPatch422IssuesItems> getIssues() | setIssues(List<OrdersPatch422IssuesItems> issues) |

## Example (as JSON)

```json
{
  "issues": [
    {
      "issue": "AMOUNT_MISMATCH",
      "description": "Should equal item_total + tax_total + shipping + handling + insurance - shipping_discount - discount."
    },
    {
      "issue": "AMOUNT_MISMATCH",
      "description": "Should equal item_total + tax_total + shipping + handling + insurance - shipping_discount - discount."
    },
    {
      "issue": "AMOUNT_MISMATCH",
      "description": "Should equal item_total + tax_total + shipping + handling + insurance - shipping_discount - discount."
    }
  ]
}
```

