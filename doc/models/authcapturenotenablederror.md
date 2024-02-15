
# AUTHCAPTURENOTENABLEDERROR

## Structure

`AUTHCAPTURENOTENABLEDERROR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`AuthCaptureNotEnabled1IssueEnum`](../../doc/models/auth-capture-not-enabled-1-issue-enum.md) | Optional | - | AuthCaptureNotEnabled1IssueEnum getIssue() | setIssue(AuthCaptureNotEnabled1IssueEnum issue) |
| `Description` | [`AuthCaptureNotEnabled1DescriptionEnum`](../../doc/models/auth-capture-not-enabled-1-description-enum.md) | Optional | - | AuthCaptureNotEnabled1DescriptionEnum getDescription() | setDescription(AuthCaptureNotEnabled1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "AUTH_CAPTURE_NOT_ENABLED",
  "description": "Authorization and Capture feature is not enabled for the merchant. Make sure that the recipient of the funds is a verified business account."
}
```

