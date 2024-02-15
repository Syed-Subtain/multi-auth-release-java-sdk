
# CANCELURLREQUIREDERRORRESPONSE

## Structure

`CANCELURLREQUIREDERRORRESPONSE`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`CancelUrlRequired2IssueEnum`](../../doc/models/cancel-url-required-2-issue-enum.md) | Optional | - | CancelUrlRequired2IssueEnum getIssue() | setIssue(CancelUrlRequired2IssueEnum issue) |
| `Description` | [`CancelUrlRequired2DescriptionEnum`](../../doc/models/cancel-url-required-2-description-enum.md) | Optional | - | CancelUrlRequired2DescriptionEnum getDescription() | setDescription(CancelUrlRequired2DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "CANCEL_URL_REQUIRED",
  "description": "The cancel url is required when attempting to vault this source."
}
```

