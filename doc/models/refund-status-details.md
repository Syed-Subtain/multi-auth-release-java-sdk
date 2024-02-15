
# Refund Status Details

The details of the refund status.

## Structure

`RefundStatusDetails`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Reason` | [`RefundStatusDetailsReasonEnum`](../../doc/models/refund-status-details-reason-enum.md) | Optional | The reason why the refund has the `PENDING` or `FAILED` status. | RefundStatusDetailsReasonEnum getReason() | setReason(RefundStatusDetailsReasonEnum reason) |

## Example (as JSON)

```json
{
  "reason": "ECHECK"
}
```

