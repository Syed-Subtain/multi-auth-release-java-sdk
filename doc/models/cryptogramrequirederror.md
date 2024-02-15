
# CRYPTOGRAMREQUIREDERROR

## Structure

`CRYPTOGRAMREQUIREDERROR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`CryptogramRequired2IssueEnum`](../../doc/models/cryptogram-required-2-issue-enum.md) | Optional | - | CryptogramRequired2IssueEnum getIssue() | setIssue(CryptogramRequired2IssueEnum issue) |
| `Description` | [`CryptogramRequired2DescriptionEnum`](../../doc/models/cryptogram-required-2-description-enum.md) | Optional | - | CryptogramRequired2DescriptionEnum getDescription() | setDescription(CryptogramRequired2DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "CRYPTOGRAM_REQUIRED",
  "description": "Cryptogram is required if authentication method is CRYPTOGRAM 3DS."
}
```

