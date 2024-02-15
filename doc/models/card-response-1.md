
# Card Response 1

Full representation of a Card Payment Token.

## Structure

`CardResponse1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | The card holder's name as it appears on the card.<br>**Constraints**: *Minimum Length*: `2`, *Maximum Length*: `300`, *Pattern*: `^[A-Za-z ]+$` | String getName() | setName(String name) |
| `LastDigits` | `String` | Optional | The last digits of the payment card.<br>**Constraints**: *Minimum Length*: `2`, *Maximum Length*: `4`, *Pattern*: `[0-9]{2,}` | String getLastDigits() | setLastDigits(String lastDigits) |
| `Brand` | [`CardBrandEnum`](../../doc/models/card-brand-enum.md) | Optional | The card brand or network. Typically used in the response.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255`, *Pattern*: `^[A-Z_]+$` | CardBrandEnum getBrand() | setBrand(CardBrandEnum brand) |
| `Expiry` | `String` | Optional | The card expiration year and month, in [Internet date format](https://tools.ietf.org/html/rfc3339#section-5.6).<br>**Constraints**: *Minimum Length*: `7`, *Maximum Length*: `7`, *Pattern*: `^[0-9]{4}-(0[1-9]\|1[0-2])$` | String getExpiry() | setExpiry(String expiry) |
| `BillingAddress` | `Object` | Optional | The billing address for this card. Supports only the `address_line_1`, `address_line_2`, `admin_area_1`, `admin_area_2`, `postal_code`, and `country_code` properties. | Object getBillingAddress() | setBillingAddress(Object billingAddress) |
| `VerificationStatus` | `String` | Optional | Card Verification status.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255`, *Pattern*: `^[0-9A-Z_]+$` | String getVerificationStatus() | setVerificationStatus(String verificationStatus) |
| `Verification` | [`CardVerificationDetails`](../../doc/models/card-verification-details.md) | Optional | Card Verification details including the authorization details and 3D SECURE details. | CardVerificationDetails getVerification() | setVerification(CardVerificationDetails verification) |

## Example (as JSON)

```json
{
  "name": "name2",
  "last_digits": "last_digits6",
  "brand": "SWITCH",
  "expiry": "expiry0",
  "billing_address": {
    "key1": "val1",
    "key2": "val2"
  }
}
```

