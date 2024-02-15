
# AUTHCAPTURENOTENABLEDERRORRESPONSE

## Structure

`AUTHCAPTURENOTENABLEDERRORRESPONSE`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`AuthCaptureNotEnabled2IssueEnum`](../../doc/models/auth-capture-not-enabled-2-issue-enum.md) | Optional | - | AuthCaptureNotEnabled2IssueEnum getIssue() | setIssue(AuthCaptureNotEnabled2IssueEnum issue) |
| `Description` | [`AuthCaptureNotEnabled2DescriptionEnum`](../../doc/models/auth-capture-not-enabled-2-description-enum.md) | Optional | - | AuthCaptureNotEnabled2DescriptionEnum getDescription() | setDescription(AuthCaptureNotEnabled2DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "AUTH_CAPTURE_NOT_ENABLED",
  "description": "Authorization and Capture feature is not enabled for the merchant. Make sure that the recipient of the funds is a verified business account."
}
```

