
# MALFORMEDREQUESTJSONERRORRESPONSE

## Structure

`MALFORMEDREQUESTJSONERRORRESPONSE`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`MalformedRequestJson4IssueEnum`](../../doc/models/malformed-request-json-4-issue-enum.md) | Optional | - | MalformedRequestJson4IssueEnum getIssue() | setIssue(MalformedRequestJson4IssueEnum issue) |
| `Description` | [`MalformedRequestJson4DescriptionEnum`](../../doc/models/malformed-request-json-4-description-enum.md) | Optional | - | MalformedRequestJson4DescriptionEnum getDescription() | setDescription(MalformedRequestJson4DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "MALFORMED_REQUEST_JSON",
  "description": "The request JSON is not well formed."
}
```

