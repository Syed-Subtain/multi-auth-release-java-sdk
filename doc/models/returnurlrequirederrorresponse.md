
# RETURNURLREQUIREDERRORRESPONSE

## Structure

`RETURNURLREQUIREDERRORRESPONSE`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`ReturnUrlRequired2IssueEnum`](../../doc/models/return-url-required-2-issue-enum.md) | Optional | - | ReturnUrlRequired2IssueEnum getIssue() | setIssue(ReturnUrlRequired2IssueEnum issue) |
| `Description` | [`ReturnUrlRequired2DescriptionEnum`](../../doc/models/return-url-required-2-description-enum.md) | Optional | - | ReturnUrlRequired2DescriptionEnum getDescription() | setDescription(ReturnUrlRequired2DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "RETURN_URL_REQUIRED",
  "description": "The return url is required when attempting to vault this source."
}
```

