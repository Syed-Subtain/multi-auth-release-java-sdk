
# AUTHORIZATIONDENIED

## Structure

`AUTHORIZATIONDENIED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`AuthorizationDeniedIssueEnum`](../../doc/models/authorization-denied-issue-enum.md) | Optional | - | AuthorizationDeniedIssueEnum getIssue() | setIssue(AuthorizationDeniedIssueEnum issue) |
| `Description` | [`AuthorizationDeniedDescriptionEnum`](../../doc/models/authorization-denied-description-enum.md) | Optional | - | AuthorizationDeniedDescriptionEnum getDescription() | setDescription(AuthorizationDeniedDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "AUTHORIZATION_DENIED",
  "description": "An denied authorization cannot be captured."
}
```

