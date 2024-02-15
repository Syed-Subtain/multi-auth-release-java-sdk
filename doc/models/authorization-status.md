
# Authorization Status

The status fields for an authorized payment.

## Structure

`AuthorizationStatus`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Status` | [`AuthorizationStatusStatusEnum`](../../doc/models/authorization-status-status-enum.md) | Optional | The status for the authorized payment. | AuthorizationStatusStatusEnum getStatus() | setStatus(AuthorizationStatusStatusEnum status) |
| `StatusDetails` | [`AuhorizationStatusDetails`](../../doc/models/auhorization-status-details.md) | Optional | The details of the authorized order pending status. | AuhorizationStatusDetails getStatusDetails() | setStatusDetails(AuhorizationStatusDetails statusDetails) |

## Example (as JSON)

```json
{
  "status": "VOIDED",
  "status_details": {
    "reason": "PENDING_REVIEW"
  }
}
```

