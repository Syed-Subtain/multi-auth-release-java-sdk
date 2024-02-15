
# Authorizations Void 422

## Structure

`AuthorizationsVoid422`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issues` | [`List<Authorizationsvoid422issuesItems>`](../../doc/models/containers/authorizationsvoid-422-issues-items.md) | Optional | - | List<Authorizationsvoid422issuesItems> getIssues() | setIssues(List<Authorizationsvoid422issuesItems> issues) |

## Example (as JSON)

```json
{
  "issues": [
    {
      "issue": "PREVIOUSLY_CAPTURED",
      "description": "Authorization has been previously captured and hence cannot be voided."
    },
    {
      "issue": "PREVIOUSLY_CAPTURED",
      "description": "Authorization has been previously captured and hence cannot be voided."
    },
    {
      "issue": "PREVIOUSLY_CAPTURED",
      "description": "Authorization has been previously captured and hence cannot be voided."
    }
  ]
}
```

