
# INVALIDSECURITYCODELENGTH

## Structure

`INVALIDSECURITYCODELENGTH`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`InvalidSecurityCodeLengthIssueEnum`](../../doc/models/invalid-security-code-length-issue-enum.md) | Optional | - | InvalidSecurityCodeLengthIssueEnum getIssue() | setIssue(InvalidSecurityCodeLengthIssueEnum issue) |
| `Description` | [`InvalidSecurityCodeLengthDescriptionEnum`](../../doc/models/invalid-security-code-length-description-enum.md) | Optional | - | InvalidSecurityCodeLengthDescriptionEnum getDescription() | setDescription(InvalidSecurityCodeLengthDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "INVALID_SECURITY_CODE_LENGTH",
  "description": "The security_code length is invalid for the specified card brand."
}
```

