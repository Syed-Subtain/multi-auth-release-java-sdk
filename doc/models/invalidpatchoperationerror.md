
# INVALIDPATCHOPERATIONERROR

## Structure

`INVALIDPATCHOPERATIONERROR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`InvalidPatchOperation1IssueEnum`](../../doc/models/invalid-patch-operation-1-issue-enum.md) | Optional | - | InvalidPatchOperation1IssueEnum getIssue() | setIssue(InvalidPatchOperation1IssueEnum issue) |
| `Description` | [`InvalidPatchOperation1DescriptionEnum`](../../doc/models/invalid-patch-operation-1-description-enum.md) | Optional | - | InvalidPatchOperation1DescriptionEnum getDescription() | setDescription(InvalidPatchOperation1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "INVALID_PATCH_OPERATION",
  "description": "The operation cannot be honored. Cannot add a property that's already present, use replace. Cannot remove a property thats not present, use add. Cannot replace a property thats not present, use add."
}
```

