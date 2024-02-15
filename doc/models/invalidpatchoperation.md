
# INVALIDPATCHOPERATION

## Structure

`INVALIDPATCHOPERATION`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`InvalidPatchOperationIssueEnum`](../../doc/models/invalid-patch-operation-issue-enum.md) | Optional | - | InvalidPatchOperationIssueEnum getIssue() | setIssue(InvalidPatchOperationIssueEnum issue) |
| `Description` | [`InvalidPatchOperationDescriptionEnum`](../../doc/models/invalid-patch-operation-description-enum.md) | Optional | - | InvalidPatchOperationDescriptionEnum getDescription() | setDescription(InvalidPatchOperationDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "INVALID_PATCH_OPERATION",
  "description": "The operation cannot be honored. Cannot add a property that's already present, use replace. Cannot remove a property thats not present, use add. Cannot replace a property thats not present, use add."
}
```

