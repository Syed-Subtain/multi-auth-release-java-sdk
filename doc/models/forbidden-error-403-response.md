
# Forbidden Error 403 Response

## Structure

`ForbiddenError403Response`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issues` | [`List<Forbiddenerror403responseissuesItems>`](../../doc/models/containers/forbiddenerror-403-responseissues-items.md) | Optional | - | List<Forbiddenerror403responseissuesItems> getIssues() | setIssues(List<Forbiddenerror403responseissuesItems> issues) |

## Example (as JSON)

```json
{
  "issues": [
    {
      "issue": "PERMISSION_DENIED",
      "description": "You do not have permission to access or perform operations on this resource."
    },
    {
      "issue": "PERMISSION_DENIED",
      "description": "You do not have permission to access or perform operations on this resource."
    }
  ]
}
```

