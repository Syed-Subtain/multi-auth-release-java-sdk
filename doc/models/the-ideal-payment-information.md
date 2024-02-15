
# The IDEAL Payment Information

Information needed to pay using iDEAL.

## Structure

`TheIDEALPaymentInformation`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | The name of the account holder associated with this payment method.<br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `300` | String getName() | setName(String name) |
| `CountryCode` | `String` | Required | The two-character ISO 3166-1 country code.<br>**Constraints**: *Minimum Length*: `2`, *Maximum Length*: `2`, *Pattern*: `^([A-Z]{2}\|C2)$` | String getCountryCode() | setCountryCode(String countryCode) |
| `Bic` | `String` | Optional | The bank identification code (BIC).<br>**Constraints**: *Minimum Length*: `8`, *Maximum Length*: `11`, *Pattern*: `^[A-Z-a-z0-9]{4}[A-Z-a-z]{2}[A-Z-a-z0-9]{2}([A-Z-a-z0-9]{3})?$` | String getBic() | setBic(String bic) |
| `ExperienceContext` | [`ExperienceContext`](../../doc/models/experience-context.md) | Optional | Customizes the payer experience during the approval process for the payment. | ExperienceContext getExperienceContext() | setExperienceContext(ExperienceContext experienceContext) |
| `Attributes` | `Object` | Optional | Attributes for altpay recurring. | Object getAttributes() | setAttributes(Object attributes) |

## Example (as JSON)

```json
{
  "name": "name0",
  "country_code": "country_code0",
  "bic": "bic2",
  "experience_context": {
    "brand_name": "brand_name2",
    "locale": "locale6",
    "shipping_preference": "NO_SHIPPING",
    "return_url": "return_url4",
    "cancel_url": "cancel_url6"
  },
  "attributes": {
    "key1": "val1",
    "key2": "val2"
  }
}
```

