
# Cryptogram Required 1

## Structure

`CryptogramRequired1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`CryptogramRequired1IssueEnum`](../../doc/models/cryptogram-required-1-issue-enum.md) | Optional | - | CryptogramRequired1IssueEnum getIssue() | setIssue(CryptogramRequired1IssueEnum issue) |
| `Description` | [`CryptogramRequired1DescriptionEnum`](../../doc/models/cryptogram-required-1-description-enum.md) | Optional | - | CryptogramRequired1DescriptionEnum getDescription() | setDescription(CryptogramRequired1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "CRYPTOGRAM_REQUIRED",
  "description": "Cryptogram is required if authentication method is CRYPTOGRAM 3DS."
}
```

