
# INVALIDJSONPOINTERFORMATERROR

## Structure

`INVALIDJSONPOINTERFORMATERROR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`InvalidJsonPointerFormat1IssueEnum`](../../doc/models/invalid-json-pointer-format-1-issue-enum.md) | Optional | - | InvalidJsonPointerFormat1IssueEnum getIssue() | setIssue(InvalidJsonPointerFormat1IssueEnum issue) |
| `Description` | [`InvalidJsonPointerFormat1DescriptionEnum`](../../doc/models/invalid-json-pointer-format-1-description-enum.md) | Optional | - | InvalidJsonPointerFormat1DescriptionEnum getDescription() | setDescription(InvalidJsonPointerFormat1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "INVALID_JSON_POINTER_FORMAT",
  "description": "Path should be a valid [JSON Pointer](https://tools.ietf.org/html/rfc6901) that references a location within the request where the operation is performed."
}
```

