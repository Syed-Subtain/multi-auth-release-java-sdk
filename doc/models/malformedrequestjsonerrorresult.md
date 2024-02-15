
# MALFORMEDREQUESTJSONERRORRESULT

## Structure

`MALFORMEDREQUESTJSONERRORRESULT`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`MalformedRequestJson5IssueEnum`](../../doc/models/malformed-request-json-5-issue-enum.md) | Optional | - | MalformedRequestJson5IssueEnum getIssue() | setIssue(MalformedRequestJson5IssueEnum issue) |
| `Description` | [`MalformedRequestJson5DescriptionEnum`](../../doc/models/malformed-request-json-5-description-enum.md) | Optional | - | MalformedRequestJson5DescriptionEnum getDescription() | setDescription(MalformedRequestJson5DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "MALFORMED_REQUEST_JSON",
  "description": "The request JSON is not well formed."
}
```

