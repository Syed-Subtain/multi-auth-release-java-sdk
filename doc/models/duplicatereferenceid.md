
# DUPLICATEREFERENCEID

## Structure

`DUPLICATEREFERENCEID`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`DuplicateReferenceIdIssueEnum`](../../doc/models/duplicate-reference-id-issue-enum.md) | Optional | - | DuplicateReferenceIdIssueEnum getIssue() | setIssue(DuplicateReferenceIdIssueEnum issue) |
| `Description` | [`DuplicateReferenceIdDescriptionEnum`](../../doc/models/duplicate-reference-id-description-enum.md) | Optional | - | DuplicateReferenceIdDescriptionEnum getDescription() | setDescription(DuplicateReferenceIdDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "DUPLICATE_REFERENCE_ID",
  "description": "`reference_id` must be unique if multiple `purchase_unit` are provided."
}
```

