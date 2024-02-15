
# CRYPTOGRAMREQUIRED

## Structure

`CRYPTOGRAMREQUIRED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`CryptogramRequiredIssueEnum`](../../doc/models/cryptogram-required-issue-enum.md) | Optional | - | CryptogramRequiredIssueEnum getIssue() | setIssue(CryptogramRequiredIssueEnum issue) |
| `Description` | [`CryptogramRequiredDescriptionEnum`](../../doc/models/cryptogram-required-description-enum.md) | Optional | - | CryptogramRequiredDescriptionEnum getDescription() | setDescription(CryptogramRequiredDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "CRYPTOGRAM_REQUIRED",
  "description": "Cryptogram is required if authentication method is CRYPTOGRAM 3DS."
}
```

