
# AUTHORIZATIONVOIDED

## Structure

`AUTHORIZATIONVOIDED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`AuthorizationVoidedIssueEnum`](../../doc/models/authorization-voided-issue-enum.md) | Optional | - | AuthorizationVoidedIssueEnum getIssue() | setIssue(AuthorizationVoidedIssueEnum issue) |
| `Description` | [`AuthorizationVoidedDescriptionEnum`](../../doc/models/authorization-voided-description-enum.md) | Optional | - | AuthorizationVoidedDescriptionEnum getDescription() | setDescription(AuthorizationVoidedDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "AUTHORIZATION_VOIDED",
  "description": "A voided authorization cannot be captured or reauthorized."
}
```

