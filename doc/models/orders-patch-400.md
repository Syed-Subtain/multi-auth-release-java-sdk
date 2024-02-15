
# Orders Patch 400

## Structure

`OrdersPatch400`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issues` | [`List<OrdersPatch400IssuesItems>`](../../doc/models/containers/orders-patch-400-issues-items.md) | Optional | - | List<OrdersPatch400IssuesItems> getIssues() | setIssues(List<OrdersPatch400IssuesItems> issues) |

## Example (as JSON)

```json
{
  "issues": [
    {
      "issue": "FIELD_NOT_PATCHABLE",
      "description": "Field cannot be patched."
    },
    {
      "issue": "FIELD_NOT_PATCHABLE",
      "description": "Field cannot be patched."
    }
  ]
}
```

