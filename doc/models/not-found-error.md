
# Not Found Error

## Structure

`NotFoundError`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issues` | [`List<NotFoundErrorIssuesItems>`](../../doc/models/containers/not-found-error-issues-items.md) | Optional | - | List<NotFoundErrorIssuesItems> getIssues() | setIssues(List<NotFoundErrorIssuesItems> issues) |

## Example (as JSON)

```json
{
  "issues": [
    {
      "issue": "INVALID_RESOURCE_ID",
      "description": "Specified resource ID does not exist. Please check the resource ID and try again."
    },
    {
      "issue": "INVALID_RESOURCE_ID",
      "description": "Specified resource ID does not exist. Please check the resource ID and try again."
    },
    {
      "issue": "INVALID_RESOURCE_ID",
      "description": "Specified resource ID does not exist. Please check the resource ID and try again."
    }
  ]
}
```

