
# Unauthorized Request Error

## Structure

`UnauthorizedRequestError`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issues` | [`List<UnauthorizedRequestErrorIssuesItems>`](../../doc/models/containers/unauthorized-request-error-issues-items.md) | Optional | - | List<UnauthorizedRequestErrorIssuesItems> getIssues() | setIssues(List<UnauthorizedRequestErrorIssuesItems> issues) |

## Example (as JSON)

```json
{
  "issues": [
    {
      "issue": "INVALID_ACCOUNT_STATUS",
      "description": "Account validations failed for the user."
    },
    {
      "issue": "INVALID_ACCOUNT_STATUS",
      "description": "Account validations failed for the user."
    }
  ]
}
```

