
# Auhorization Status Details

The details of the authorized payment status.

## Structure

`AuhorizationStatusDetails`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Reason` | [`AuthorizationStatusDetailsReasonEnum`](../../doc/models/authorization-status-details-reason-enum.md) | Optional | The reason why the authorized status is `PENDING`.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `24`, *Pattern*: `^[A-Z_]+$` | AuthorizationStatusDetailsReasonEnum getReason() | setReason(AuthorizationStatusDetailsReasonEnum reason) |

## Example (as JSON)

```json
{
  "reason": "PENDING_REVIEW"
}
```

