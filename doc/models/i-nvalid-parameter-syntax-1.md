
# I Nvalid Parameter Syntax 1

## Structure

`INvalidParameterSyntax1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`InvalidParameterSyntax1IssueEnum`](../../doc/models/invalid-parameter-syntax-1-issue-enum.md) | Optional | - | InvalidParameterSyntax1IssueEnum getIssue() | setIssue(InvalidParameterSyntax1IssueEnum issue) |
| `Description` | [`InvalidParameterSyntax1DescriptionEnum`](../../doc/models/invalid-parameter-syntax-1-description-enum.md) | Optional | - | InvalidParameterSyntax1DescriptionEnum getDescription() | setDescription(InvalidParameterSyntax1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "INVALID_PARAMETER_SYNTAX",
  "description": "The value of a field does not conform to the expected format."
}
```

