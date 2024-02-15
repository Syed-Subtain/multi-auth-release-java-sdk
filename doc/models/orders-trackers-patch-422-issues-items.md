
# Orders Trackers Patch 422 Issues Items

## Structure

`OrdersTrackersPatch422IssuesItems`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`InvalidJsonPointerFormatIssueEnum`](../../doc/models/invalid-json-pointer-format-issue-enum.md) | Optional | - | InvalidJsonPointerFormatIssueEnum getIssue() | setIssue(InvalidJsonPointerFormatIssueEnum issue) |
| `Description` | [`InvalidJsonPointerFormat1DescriptionEnum`](../../doc/models/invalid-json-pointer-format-1-description-enum.md) | Optional | - | InvalidJsonPointerFormat1DescriptionEnum getDescription() | setDescription(InvalidJsonPointerFormat1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "INVALID_JSON_POINTER_FORMAT",
  "description": "Path should be a valid [JSON Pointer](https://tools.ietf.org/html/rfc6901) that references a location within the request where the operation is performed."
}
```

