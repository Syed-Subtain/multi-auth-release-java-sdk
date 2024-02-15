
# Authentication Response

Results of Authentication such as 3D Secure.

## Structure

`AuthenticationResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `LiabilityShift` | [`LiabilityShiftEnum`](../../doc/models/liability-shift-enum.md) | Optional | Liability shift indicator. The outcome of the issuer's authentication.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255`, *Pattern*: `^[0-9A-Z_]+$` | LiabilityShiftEnum getLiabilityShift() | setLiabilityShift(LiabilityShiftEnum liabilityShift) |
| `ThreeDSecure` | [`The3DSecureAuthenticationResponse`](../../doc/models/the-3-d-secure-authentication-response.md) | Optional | Results of 3D Secure Authentication. | The3DSecureAuthenticationResponse getThreeDSecure() | setThreeDSecure(The3DSecureAuthenticationResponse threeDSecure) |
| `AuthenticationFlow` | `Object` | Optional | - | Object getAuthenticationFlow() | setAuthenticationFlow(Object authenticationFlow) |
| `ExemptionDetails` | `Object` | Optional | Exemption details of 3D Secure Authentication. | Object getExemptionDetails() | setExemptionDetails(Object exemptionDetails) |

## Example (as JSON)

```json
{
  "liability_shift": "POSSIBLE",
  "three_d_secure": {
    "authentication_status": "C",
    "enrollment_status": "Y"
  },
  "authentication_flow": {
    "key1": "val1",
    "key2": "val2"
  },
  "exemption_details": {
    "key1": "val1",
    "key2": "val2"
  }
}
```

