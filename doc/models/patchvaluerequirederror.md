
# PATCHVALUEREQUIREDERROR

## Structure

`PATCHVALUEREQUIREDERROR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PatchValueRequired1IssueEnum`](../../doc/models/patch-value-required-1-issue-enum.md) | Optional | - | PatchValueRequired1IssueEnum getIssue() | setIssue(PatchValueRequired1IssueEnum issue) |
| `Description` | [`PatchValueRequired1DescriptionEnum`](../../doc/models/patch-value-required-1-description-enum.md) | Optional | - | PatchValueRequired1DescriptionEnum getDescription() | setDescription(PatchValueRequired1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "PATCH_VALUE_REQUIRED",
  "description": "Specify a `value` for the field being patched."
}
```

