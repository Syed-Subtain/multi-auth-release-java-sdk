
# MAXCAPTUREAMOUNTEXCEEDED

## Structure

`MAXCAPTUREAMOUNTEXCEEDED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`MaxCaptureAmountExceededIssueEnum`](../../doc/models/max-capture-amount-exceeded-issue-enum.md) | Optional | - | MaxCaptureAmountExceededIssueEnum getIssue() | setIssue(MaxCaptureAmountExceededIssueEnum issue) |
| `Description` | [`MaxCaptureAmountExceededDescriptionEnum`](../../doc/models/max-capture-amount-exceeded-description-enum.md) | Optional | - | MaxCaptureAmountExceededDescriptionEnum getDescription() | setDescription(MaxCaptureAmountExceededDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "MAX_CAPTURE_AMOUNT_EXCEEDED",
  "description": "Capture amount exceeds allowable limit. Please contact customer service or your account manager to request the change to your overage limit. The default overage limit is 115%, which allows the sum of all captures to be up to 115% of the order amount. The ability to over capture is subjected to regulatory approvals."
}
```

