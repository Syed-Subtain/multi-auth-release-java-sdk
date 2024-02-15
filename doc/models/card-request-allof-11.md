
# Card Request Allof 11

## Structure

`CardRequestAllof11`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `VerificationMethod` | `String` | Optional | The API caller can opt in to verify the payment token through PayPal offered verification services (e.g. Smart Dollar Auth, 3DS).<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255`, *Pattern*: `^[0-9A-Z_]+$` | String getVerificationMethod() | setVerificationMethod(String verificationMethod) |
| `ExperienceContext` | [`ExperienceContext1`](../../doc/models/experience-context-1.md) | Optional | Customizes the Vault creation flow experience for your customers. | ExperienceContext1 getExperienceContext() | setExperienceContext(ExperienceContext1 experienceContext) |

## Example (as JSON)

```json
{
  "verification_method": "verification_method6",
  "experience_context": {
    "brand_name": "brand_name2",
    "locale": "locale6",
    "return_url": "return_url4",
    "cancel_url": "cancel_url6",
    "shipping_preference": "shipping_preference8"
  }
}
```

