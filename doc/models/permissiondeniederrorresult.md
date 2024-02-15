
# PERMISSIONDENIEDERRORRESULT

## Structure

`PERMISSIONDENIEDERRORRESULT`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PermissionDenied4IssueEnum`](../../doc/models/permission-denied-4-issue-enum.md) | Optional | - | PermissionDenied4IssueEnum getIssue() | setIssue(PermissionDenied4IssueEnum issue) |
| `Description` | [`PermissionDenied4DescriptionEnum`](../../doc/models/permission-denied-4-description-enum.md) | Optional | - | PermissionDenied4DescriptionEnum getDescription() | setDescription(PermissionDenied4DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "PERMISSION_DENIED",
  "description": "You do not have permission to access or perform operations on this resource."
}
```

