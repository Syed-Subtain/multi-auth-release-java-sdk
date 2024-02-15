
# INVALIDPARAMETER

## Structure

`INVALIDPARAMETER`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`InvalidParameterIssueEnum`](../../doc/models/invalid-parameter-issue-enum.md) | Optional | - | InvalidParameterIssueEnum getIssue() | setIssue(InvalidParameterIssueEnum issue) |
| `Description` | [`InvalidParameterDescriptionEnum`](../../doc/models/invalid-parameter-description-enum.md) | Optional | - | InvalidParameterDescriptionEnum getDescription() | setDescription(InvalidParameterDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "INVALID_PARAMETER",
  "description": "Cannot be specified as part of the request."
}
```

