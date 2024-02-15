
# INVALIDJSONPOINTERFORMAT

## Structure

`INVALIDJSONPOINTERFORMAT`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`InvalidJsonPointerFormatIssueEnum`](../../doc/models/invalid-json-pointer-format-issue-enum.md) | Optional | - | InvalidJsonPointerFormatIssueEnum getIssue() | setIssue(InvalidJsonPointerFormatIssueEnum issue) |
| `Description` | [`InvalidJsonPointerFormatDescriptionEnum`](../../doc/models/invalid-json-pointer-format-description-enum.md) | Optional | - | InvalidJsonPointerFormatDescriptionEnum getDescription() | setDescription(InvalidJsonPointerFormatDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "INVALID_JSON_POINTER_FORMAT",
  "description": "Path should be a valid JSON Pointer https://tools.ietf.org/html/rfc6901 that references a location within the request where the operation is performed."
}
```

