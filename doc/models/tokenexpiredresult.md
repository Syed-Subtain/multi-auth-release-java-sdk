
# TOKENEXPIREDRESULT

## Structure

`TOKENEXPIREDRESULT`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`TokenExpired2IssueEnum`](../../doc/models/token-expired-2-issue-enum.md) | Optional | - | TokenExpired2IssueEnum getIssue() | setIssue(TokenExpired2IssueEnum issue) |
| `Description` | [`TokenExpired2DescriptionEnum`](../../doc/models/token-expired-2-description-enum.md) | Optional | - | TokenExpired2DescriptionEnum getDescription() | setDescription(TokenExpired2DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "TOKEN_EXPIRED",
  "description": "The token is expired and cannot be used for payment."
}
```

