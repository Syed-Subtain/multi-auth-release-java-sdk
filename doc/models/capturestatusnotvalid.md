
# CAPTURESTATUSNOTVALID

## Structure

`CAPTURESTATUSNOTVALID`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`CaptureStatusNotValidIssueEnum`](../../doc/models/capture-status-not-valid-issue-enum.md) | Optional | - | CaptureStatusNotValidIssueEnum getIssue() | setIssue(CaptureStatusNotValidIssueEnum issue) |
| `Description` | [`CaptureStatusNotValidDescriptionEnum`](../../doc/models/capture-status-not-valid-description-enum.md) | Optional | - | CaptureStatusNotValidDescriptionEnum getDescription() | setDescription(CaptureStatusNotValidDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "CAPTURE_STATUS_NOT_VALID",
  "description": "Invalid capture status. Tracker information can only be added to captures in `COMPLETED` state."
}
```

