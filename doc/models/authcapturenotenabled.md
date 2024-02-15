
# AUTHCAPTURENOTENABLED

## Structure

`AUTHCAPTURENOTENABLED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`AuthCaptureNotEnabledIssueEnum`](../../doc/models/auth-capture-not-enabled-issue-enum.md) | Optional | - | AuthCaptureNotEnabledIssueEnum getIssue() | setIssue(AuthCaptureNotEnabledIssueEnum issue) |
| `Description` | [`AuthCaptureNotEnabledDescriptionEnum`](../../doc/models/auth-capture-not-enabled-description-enum.md) | Optional | - | AuthCaptureNotEnabledDescriptionEnum getDescription() | setDescription(AuthCaptureNotEnabledDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "AUTH_CAPTURE_NOT_ENABLED",
  "description": "Authorization and Capture feature is not enabled for the merchant. Make sure that the recipient of the funds is a verified business account."
}
```

