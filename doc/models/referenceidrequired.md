
# REFERENCEIDREQUIRED

## Structure

`REFERENCEIDREQUIRED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`ReferenceIdRequiredIssueEnum`](../../doc/models/reference-id-required-issue-enum.md) | Optional | - | ReferenceIdRequiredIssueEnum getIssue() | setIssue(ReferenceIdRequiredIssueEnum issue) |
| `Description` | [`ReferenceIdRequiredDescriptionEnum`](../../doc/models/reference-id-required-description-enum.md) | Optional | - | ReferenceIdRequiredDescriptionEnum getDescription() | setDescription(ReferenceIdRequiredDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "REFERENCE_ID_REQUIRED",
  "description": "'reference_id' is required for each 'purchase_unit' if multiple 'purchase_unit' are provided."
}
```

