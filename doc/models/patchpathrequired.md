
# PATCHPATHREQUIRED

## Structure

`PATCHPATHREQUIRED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PatchPathRequiredIssueEnum`](../../doc/models/patch-path-required-issue-enum.md) | Optional | - | PatchPathRequiredIssueEnum getIssue() | setIssue(PatchPathRequiredIssueEnum issue) |
| `Description` | [`PatchPathRequiredDescriptionEnum`](../../doc/models/patch-path-required-description-enum.md) | Optional | - | PatchPathRequiredDescriptionEnum getDescription() | setDescription(PatchPathRequiredDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "PATCH_PATH_REQUIRED",
  "description": "Please specify a 'path' for the field for which the operation needs to be performed."
}
```

