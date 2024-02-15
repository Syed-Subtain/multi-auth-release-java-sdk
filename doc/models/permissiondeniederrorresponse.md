
# PERMISSIONDENIEDERRORRESPONSE

## Structure

`PERMISSIONDENIEDERRORRESPONSE`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PermissionDenied3IssueEnum`](../../doc/models/permission-denied-3-issue-enum.md) | Optional | - | PermissionDenied3IssueEnum getIssue() | setIssue(PermissionDenied3IssueEnum issue) |
| `Description` | [`PermissionDenied3DescriptionEnum`](../../doc/models/permission-denied-3-description-enum.md) | Optional | - | PermissionDenied3DescriptionEnum getDescription() | setDescription(PermissionDenied3DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "PERMISSION_DENIED",
  "description": "You do not have permission to access or perform operations on this resource."
}
```

