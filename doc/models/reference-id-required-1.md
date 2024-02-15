
# Reference ID Required 1

## Structure

`ReferenceIDRequired1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`ReferenceIdRequired1IssueEnum`](../../doc/models/reference-id-required-1-issue-enum.md) | Optional | - | ReferenceIdRequired1IssueEnum getIssue() | setIssue(ReferenceIdRequired1IssueEnum issue) |
| `Description` | [`ReferenceIdRequired1DescriptionEnum`](../../doc/models/reference-id-required-1-description-enum.md) | Optional | - | ReferenceIdRequired1DescriptionEnum getDescription() | setDescription(ReferenceIdRequired1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "REFERENCE_ID_REQUIRED",
  "description": "'reference_id' is required for each 'purchase_unit' if multiple 'purchase_unit' are provided."
}
```

