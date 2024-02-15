
# Capture Status Details

The details of the captured payment status.

## Structure

`CaptureStatusDetails`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Reason` | [`CaptureStatusDetailsReasonEnum`](../../doc/models/capture-status-details-reason-enum.md) | Optional | The reason why the captured payment status is `PENDING` or `DENIED`.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `64`, *Pattern*: `^[A-Z_]+$` | CaptureStatusDetailsReasonEnum getReason() | setReason(CaptureStatusDetailsReasonEnum reason) |

## Example (as JSON)

```json
{
  "reason": "TRANSACTION_APPROVED_AWAITING_FUNDING"
}
```

