
# INVALIDSECURITYCODELENGTHRESULT

## Structure

`INVALIDSECURITYCODELENGTHRESULT`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`InvalidSecurityCodeLength2IssueEnum`](../../doc/models/invalid-security-code-length-2-issue-enum.md) | Optional | - | InvalidSecurityCodeLength2IssueEnum getIssue() | setIssue(InvalidSecurityCodeLength2IssueEnum issue) |
| `Description` | [`InvalidSecurityCodeLength2DescriptionEnum`](../../doc/models/invalid-security-code-length-2-description-enum.md) | Optional | - | InvalidSecurityCodeLength2DescriptionEnum getDescription() | setDescription(InvalidSecurityCodeLength2DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "INVALID_SECURITY_CODE_LENGTH",
  "description": "The security_code length is invalid for the specified card brand."
}
```

