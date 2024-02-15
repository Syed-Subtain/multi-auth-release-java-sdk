
# TOKENEXPIREDERROR

## Structure

`TOKENEXPIREDERROR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`TokenExpired1IssueEnum`](../../doc/models/token-expired-1-issue-enum.md) | Optional | - | TokenExpired1IssueEnum getIssue() | setIssue(TokenExpired1IssueEnum issue) |
| `Description` | [`TokenExpired1DescriptionEnum`](../../doc/models/token-expired-1-description-enum.md) | Optional | - | TokenExpired1DescriptionEnum getDescription() | setDescription(TokenExpired1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "TOKEN_EXPIRED",
  "description": "The token is expired and cannot be used for payment."
}
```

