
# BLIK Payment Information

Information needed to pay using BLIK.

## Structure

`BLIKPaymentInformation`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | The name of the account holder associated with this payment method.<br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `300` | String getName() | setName(String name) |
| `CountryCode` | `String` | Required | The two-character ISO 3166-1 country code.<br>**Constraints**: *Minimum Length*: `2`, *Maximum Length*: `2`, *Pattern*: `^([A-Z]{2}\|C2)$` | String getCountryCode() | setCountryCode(String countryCode) |
| `Email` | `String` | Optional | The email address of the account holder associated with this payment method.<br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `254`, *Pattern*: `^.+@[^"\-].+$` | String getEmail() | setEmail(String email) |
| `ExperienceContext` | [`BLIKExperienceContext`](../../doc/models/blik-experience-context.md) | Optional | Customizes the payer experience during the approval process for the payment. | BLIKExperienceContext getExperienceContext() | setExperienceContext(BLIKExperienceContext experienceContext) |
| `Level0` | [`BLIKLevel0PaymentObject`](../../doc/models/blik-level-0-payment-object.md) | Optional | The level_0 integration flow object. | BLIKLevel0PaymentObject getLevel0() | setLevel0(BLIKLevel0PaymentObject level0) |
| `OneClick` | [`BLIKOneClickPaymentInformation`](../../doc/models/blik-one-click-payment-information.md) | Optional | The one-click integration flow object. | BLIKOneClickPaymentInformation getOneClick() | setOneClick(BLIKOneClickPaymentInformation oneClick) |

## Example (as JSON)

```json
{
  "name": "name0",
  "country_code": "country_code0",
  "email": "email6",
  "experience_context": {
    "brand_name": "brand_name2",
    "locale": "locale6",
    "shipping_preference": "NO_SHIPPING",
    "return_url": "return_url4",
    "cancel_url": "cancel_url6"
  },
  "level_0": {
    "auth_code": "auth_code8"
  },
  "one_click": {
    "auth_code": "auth_code0",
    "consumer_reference": "consumer_reference2",
    "alias_label": "alias_label6",
    "alias_key": "alias_key4"
  }
}
```

