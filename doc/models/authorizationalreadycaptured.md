
# AUTHORIZATIONALREADYCAPTURED

## Structure

`AUTHORIZATIONALREADYCAPTURED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`AuthorizationAlreadyCapturedIssueEnum`](../../doc/models/authorization-already-captured-issue-enum.md) | Optional | - | AuthorizationAlreadyCapturedIssueEnum getIssue() | setIssue(AuthorizationAlreadyCapturedIssueEnum issue) |
| `Description` | [`AuthorizationAlreadyCapturedDescriptionEnum`](../../doc/models/authorization-already-captured-description-enum.md) | Optional | - | AuthorizationAlreadyCapturedDescriptionEnum getDescription() | setDescription(AuthorizationAlreadyCapturedDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "AUTHORIZATION_ALREADY_CAPTURED",
  "description": "Authorization has previously been captured."
}
```

