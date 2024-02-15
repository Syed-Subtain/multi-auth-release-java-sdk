
# PATCHVALUEREQUIRED

## Structure

`PATCHVALUEREQUIRED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PatchValueRequiredIssueEnum`](../../doc/models/patch-value-required-issue-enum.md) | Optional | - | PatchValueRequiredIssueEnum getIssue() | setIssue(PatchValueRequiredIssueEnum issue) |
| `Description` | [`PatchValueRequiredDescriptionEnum`](../../doc/models/patch-value-required-description-enum.md) | Optional | - | PatchValueRequiredDescriptionEnum getDescription() | setDescription(PatchValueRequiredDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "PATCH_VALUE_REQUIRED",
  "description": "Please specify a 'value' to for the field that is being patched."
}
```

