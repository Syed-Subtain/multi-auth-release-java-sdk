
# Capture Status

The status of a captured payment.

## Structure

`CaptureStatus`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Status` | [`CaptureStatusStatusEnum`](../../doc/models/capture-status-status-enum.md) | Optional | The status of the captured payment. | CaptureStatusStatusEnum getStatus() | setStatus(CaptureStatusStatusEnum status) |
| `StatusDetails` | [`CaptureStatusDetails`](../../doc/models/capture-status-details.md) | Optional | The details of the captured payment status. | CaptureStatusDetails getStatusDetails() | setStatusDetails(CaptureStatusDetails statusDetails) |

## Example (as JSON)

```json
{
  "status": "REFUNDED",
  "status_details": {
    "reason": "CHARGEBACK"
  }
}
```

