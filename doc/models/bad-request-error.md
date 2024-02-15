
# Bad Request Error

## Structure

`BadRequestError`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issues` | [`List<BadRequestErrorIssuesItems>`](../../doc/models/containers/bad-request-error-issues-items.md) | Optional | - | List<BadRequestErrorIssuesItems> getIssues() | setIssues(List<BadRequestErrorIssuesItems> issues) |

## Example (as JSON)

```json
{
  "issues": [
    {
      "issue": "INVALID_ARRAY_MAX_ITEMS",
      "description": "The number of items in an array parameter is too large."
    }
  ]
}
```

