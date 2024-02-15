
# Orders Confirm 400 Issues Items

## Structure

`OrdersConfirm400IssuesItems`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`InvalidParameterSyntaxIssueEnum`](../../doc/models/invalid-parameter-syntax-issue-enum.md) | Optional | - | InvalidParameterSyntaxIssueEnum getIssue() | setIssue(InvalidParameterSyntaxIssueEnum issue) |
| `Description` | [`InvalidParameterSyntax2DescriptionEnum`](../../doc/models/invalid-parameter-syntax-2-description-enum.md) | Optional | - | InvalidParameterSyntax2DescriptionEnum getDescription() | setDescription(InvalidParameterSyntax2DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "INVALID_PARAMETER_SYNTAX",
  "description": "The value of the field does not conform to the expected format."
}
```

