
# MISSINGCRYPTOGRAMERRORRESPONSE

## Structure

`MISSINGCRYPTOGRAMERRORRESPONSE`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`MissingCryptogram3IssueEnum`](../../doc/models/missing-cryptogram-3-issue-enum.md) | Optional | - | MissingCryptogram3IssueEnum getIssue() | setIssue(MissingCryptogram3IssueEnum issue) |
| `Description` | [`MissingCryptogram3DescriptionEnum`](../../doc/models/missing-cryptogram-3-description-enum.md) | Optional | - | MissingCryptogram3DescriptionEnum getDescription() | setDescription(MissingCryptogram3DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "MISSING_CRYPTOGRAM",
  "description": "Cryptogram is mandatory for any customer initiated network token transactions."
}
```

