
# Refund Status

The refund status.

## Structure

`RefundStatus`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Status` | [`RefundStatusStatusEnum`](../../doc/models/refund-status-status-enum.md) | Optional | The status of the refund. | RefundStatusStatusEnum getStatus() | setStatus(RefundStatusStatusEnum status) |
| `StatusDetails` | [`RefundStatusDetails`](../../doc/models/refund-status-details.md) | Optional | The details of the refund status. | RefundStatusDetails getStatusDetails() | setStatusDetails(RefundStatusDetails statusDetails) |

## Example (as JSON)

```json
{
  "status": "CANCELLED",
  "status_details": {
    "reason": "ECHECK"
  }
}
```

