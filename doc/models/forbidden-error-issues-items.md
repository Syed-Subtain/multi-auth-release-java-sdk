
# Forbidden Error Issues Items

## Structure

`ForbiddenErrorIssuesItems`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PermissionDeniedIssueEnum`](../../doc/models/permission-denied-issue-enum.md) | Optional | - | PermissionDeniedIssueEnum getIssue() | setIssue(PermissionDeniedIssueEnum issue) |
| `Description` | [`PermissionDeniedDescriptionEnum`](../../doc/models/permission-denied-description-enum.md) | Optional | - | PermissionDeniedDescriptionEnum getDescription() | setDescription(PermissionDeniedDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "PERMISSION_DENIED",
  "description": "You do not have permission to access or perform operations on this resource."
}
```

