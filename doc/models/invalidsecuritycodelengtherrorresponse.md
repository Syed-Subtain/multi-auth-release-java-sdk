
# INVALIDSECURITYCODELENGTHERRORRESPONSE

## Structure

`INVALIDSECURITYCODELENGTHERRORRESPONSE`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`InvalidSecurityCodeLength3IssueEnum`](../../doc/models/invalid-security-code-length-3-issue-enum.md) | Optional | - | InvalidSecurityCodeLength3IssueEnum getIssue() | setIssue(InvalidSecurityCodeLength3IssueEnum issue) |
| `Description` | [`InvalidSecurityCodeLength3DescriptionEnum`](../../doc/models/invalid-security-code-length-3-description-enum.md) | Optional | - | InvalidSecurityCodeLength3DescriptionEnum getDescription() | setDescription(InvalidSecurityCodeLength3DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "INVALID_SECURITY_CODE_LENGTH",
  "description": "The security_code length is invalid for the specified card brand."
}
```

