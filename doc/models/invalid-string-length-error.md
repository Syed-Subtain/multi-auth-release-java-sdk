
# Invalid String Length Error

## Structure

`InvalidStringLengthError`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`InvalidStringLength2IssueEnum`](../../doc/models/invalid-string-length-2-issue-enum.md) | Optional | - | InvalidStringLength2IssueEnum getIssue() | setIssue(InvalidStringLength2IssueEnum issue) |
| `Description` | [`InvalidStringLength2DescriptionEnum`](../../doc/models/invalid-string-length-2-description-enum.md) | Optional | - | InvalidStringLength2DescriptionEnum getDescription() | setDescription(InvalidStringLength2DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "INVALID_STRING_LENGTH",
  "description": "The value of a field is either too short or too long"
}
```

