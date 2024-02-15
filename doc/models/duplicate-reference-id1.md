
# Duplicate Reference ID1

## Structure

`DuplicateReferenceID1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`DuplicateReferenceId1IssueEnum`](../../doc/models/duplicate-reference-id-1-issue-enum.md) | Optional | - | DuplicateReferenceId1IssueEnum getIssue() | setIssue(DuplicateReferenceId1IssueEnum issue) |
| `Description` | [`DuplicateReferenceId1DescriptionEnum`](../../doc/models/duplicate-reference-id-1-description-enum.md) | Optional | - | DuplicateReferenceId1DescriptionEnum getDescription() | setDescription(DuplicateReferenceId1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "DUPLICATE_REFERENCE_ID",
  "description": "`reference_id` must be unique if multiple `purchase_unit` are provided."
}
```

