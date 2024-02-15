
# BLIK Payment Object

Information used to pay using BLIK.

## Structure

`BLIKPaymentObject`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | The name of the account holder associated with this payment method.<br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `300` | String getName() | setName(String name) |
| `CountryCode` | `String` | Optional | The two-character ISO 3166-1 country code.<br>**Constraints**: *Minimum Length*: `2`, *Maximum Length*: `2`, *Pattern*: `^([A-Z]{2}\|C2)$` | String getCountryCode() | setCountryCode(String countryCode) |
| `Email` | `String` | Optional | The email address of the account holder associated with this payment method.<br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `254`, *Pattern*: `^.+@[^"\-].+$` | String getEmail() | setEmail(String email) |
| `OneClick` | [`BLIKOneClickPaymentObject`](../../doc/models/blik-one-click-payment-object.md) | Optional | The one-click integration flow object. | BLIKOneClickPaymentObject getOneClick() | setOneClick(BLIKOneClickPaymentObject oneClick) |

## Example (as JSON)

```json
{
  "name": "name6",
  "country_code": "country_code6",
  "email": "email0",
  "one_click": {
    "consumer_reference": "consumer_reference2"
  }
}
```

