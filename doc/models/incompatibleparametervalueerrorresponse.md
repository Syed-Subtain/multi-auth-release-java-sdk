
# INCOMPATIBLEPARAMETERVALUEERRORRESPONSE

## Structure

`INCOMPATIBLEPARAMETERVALUEERRORRESPONSE`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`IncompatibleParameterValue3IssueEnum`](../../doc/models/incompatible-parameter-value-3-issue-enum.md) | Optional | - | IncompatibleParameterValue3IssueEnum getIssue() | setIssue(IncompatibleParameterValue3IssueEnum issue) |
| `Description` | [`IncompatibleParameterValue3DescriptionEnum`](../../doc/models/incompatible-parameter-value-3-description-enum.md) | Optional | - | IncompatibleParameterValue3DescriptionEnum getDescription() | setDescription(IncompatibleParameterValue3DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "INCOMPATIBLE_PARAMETER_VALUE",
  "description": "The value of the field is incompatible/redundant with other fields in the order."
}
```

