
# The 3 D Secure Authentication Response

Results of 3D Secure Authentication.

## Structure

`The3DSecureAuthenticationResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AuthenticationStatus` | [`ParesStatusEnum`](../../doc/models/pares-status-enum.md) | Optional | The outcome of the issuer's authentication.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255`, *Pattern*: `^[0-9A-Z_]+$` | ParesStatusEnum getAuthenticationStatus() | setAuthenticationStatus(ParesStatusEnum authenticationStatus) |
| `EnrollmentStatus` | [`EnrolledEnum`](../../doc/models/enrolled-enum.md) | Optional | Status of authentication eligibility.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255`, *Pattern*: `^[0-9A-Z_]+$` | EnrolledEnum getEnrollmentStatus() | setEnrollmentStatus(EnrolledEnum enrollmentStatus) |

## Example (as JSON)

```json
{
  "authentication_status": "Y",
  "enrollment_status": "Y"
}
```

