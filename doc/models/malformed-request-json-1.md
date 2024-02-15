
# Malformed Request Json 1

## Structure

`MalformedRequestJson1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`MalformedRequestJson1IssueEnum`](../../doc/models/malformed-request-json-1-issue-enum.md) | Optional | - | MalformedRequestJson1IssueEnum getIssue() | setIssue(MalformedRequestJson1IssueEnum issue) |
| `Description` | [`MalformedRequestJson1DescriptionEnum`](../../doc/models/malformed-request-json-1-description-enum.md) | Optional | - | MalformedRequestJson1DescriptionEnum getDescription() | setDescription(MalformedRequestJson1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "MALFORMED_REQUEST_JSON",
  "description": "The request JSON is not well formed."
}
```

