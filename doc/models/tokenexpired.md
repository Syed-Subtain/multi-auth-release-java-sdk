
# TOKENEXPIRED

## Structure

`TOKENEXPIRED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`TokenExpiredIssueEnum`](../../doc/models/token-expired-issue-enum.md) | Optional | - | TokenExpiredIssueEnum getIssue() | setIssue(TokenExpiredIssueEnum issue) |
| `Description` | [`TokenExpiredDescriptionEnum`](../../doc/models/token-expired-description-enum.md) | Optional | - | TokenExpiredDescriptionEnum getDescription() | setDescription(TokenExpiredDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "TOKEN_EXPIRED",
  "description": "The token is expired and cannot be used for payment."
}
```

