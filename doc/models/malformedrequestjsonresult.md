
# MALFORMEDREQUESTJSONRESULT

## Structure

`MALFORMEDREQUESTJSONRESULT`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`MalformedRequestJson3IssueEnum`](../../doc/models/malformed-request-json-3-issue-enum.md) | Optional | - | MalformedRequestJson3IssueEnum getIssue() | setIssue(MalformedRequestJson3IssueEnum issue) |
| `Description` | [`MalformedRequestJson3DescriptionEnum`](../../doc/models/malformed-request-json-3-description-enum.md) | Optional | - | MalformedRequestJson3DescriptionEnum getDescription() | setDescription(MalformedRequestJson3DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "MALFORMED_REQUEST_JSON",
  "description": "The request JSON is not well formed."
}
```

