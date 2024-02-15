
# P24 Payment Object

Information used to pay using P24(Przelewy24).

## Structure

`P24PaymentObject`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | The name of the account holder associated with this payment method.<br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `300` | String getName() | setName(String name) |
| `Email` | `String` | Optional | The email address of the account holder associated with this payment method.<br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `254`, *Pattern*: `^.+@[^"\-].+$` | String getEmail() | setEmail(String email) |
| `CountryCode` | `String` | Optional | The two-character ISO 3166-1 country code.<br>**Constraints**: *Minimum Length*: `2`, *Maximum Length*: `2`, *Pattern*: `^([A-Z]{2}\|C2)$` | String getCountryCode() | setCountryCode(String countryCode) |
| `PaymentDescriptor` | `String` | Optional | P24 generated payment description.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `2000` | String getPaymentDescriptor() | setPaymentDescriptor(String paymentDescriptor) |
| `MethodId` | `String` | Optional | Numeric identifier of the payment scheme or bank used for the payment.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `300` | String getMethodId() | setMethodId(String methodId) |
| `MethodDescription` | `String` | Optional | Friendly name of the payment scheme or bank used for the payment.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `2000` | String getMethodDescription() | setMethodDescription(String methodDescription) |

## Example (as JSON)

```json
{
  "name": "name2",
  "email": "email4",
  "country_code": "country_code2",
  "payment_descriptor": "payment_descriptor6",
  "method_id": "method_id6"
}
```

