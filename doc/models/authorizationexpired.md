
# AUTHORIZATIONEXPIRED

## Structure

`AUTHORIZATIONEXPIRED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`AuthorizationExpiredIssueEnum`](../../doc/models/authorization-expired-issue-enum.md) | Optional | - | AuthorizationExpiredIssueEnum getIssue() | setIssue(AuthorizationExpiredIssueEnum issue) |
| `Description` | [`AuthorizationExpiredDescriptionEnum`](../../doc/models/authorization-expired-description-enum.md) | Optional | - | AuthorizationExpiredDescriptionEnum getDescription() | setDescription(AuthorizationExpiredDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "AUTHORIZATION_EXPIRED",
  "description": "An expired authorization cannot be captured."
}
```

