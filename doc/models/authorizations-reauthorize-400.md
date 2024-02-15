
# Authorizations Reauthorize 400

## Structure

`AuthorizationsReauthorize400`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issues` | [`List<Authorizationsreauthorize400issuesItems>`](../../doc/models/containers/authorizationsreauthorize-400-issues-items.md) | Optional | - | List<Authorizationsreauthorize400issuesItems> getIssues() | setIssues(List<Authorizationsreauthorize400issuesItems> issues) |

## Example (as JSON)

```json
{
  "issues": [
    {
      "issue": "MISSING_REQUIRED_PARAMETER",
      "description": "A required field / parameter is missing."
    },
    {
      "issue": "MISSING_REQUIRED_PARAMETER",
      "description": "A required field / parameter is missing."
    },
    {
      "issue": "MISSING_REQUIRED_PARAMETER",
      "description": "A required field / parameter is missing."
    }
  ]
}
```

