
# MALFORMEDREQUESTJSON

## Structure

`MALFORMEDREQUESTJSON`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`MalformedRequestJsonIssueEnum`](../../doc/models/malformed-request-json-issue-enum.md) | Optional | - | MalformedRequestJsonIssueEnum getIssue() | setIssue(MalformedRequestJsonIssueEnum issue) |
| `Description` | [`MalformedRequestJsonDescriptionEnum`](../../doc/models/malformed-request-json-description-enum.md) | Optional | - | MalformedRequestJsonDescriptionEnum getDescription() | setDescription(MalformedRequestJsonDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "MALFORMED_REQUEST_JSON",
  "description": "The request JSON is not well formed."
}
```

