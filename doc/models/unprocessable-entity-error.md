
# Unprocessable Entity Error

## Structure

`UnprocessableEntityError`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issues` | [`List<UnprocessableEntityErrorIssuesItems>`](../../doc/models/containers/unprocessable-entity-error-issues-items.md) | Optional | - | List<UnprocessableEntityErrorIssuesItems> getIssues() | setIssues(List<UnprocessableEntityErrorIssuesItems> issues) |

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

