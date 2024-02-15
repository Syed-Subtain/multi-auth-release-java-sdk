
# Card Request 1

A Resource representing a request to vault a Card.

## Structure

`CardRequest1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | The PayPal-generated ID for the card.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `256`, *Pattern*: `^[A-Za-z0-9-_.+=]+$` | String getId() | setId(String id) |
| `Name` | `String` | Optional | The card holder's name as it appears on the card.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `300`, *Pattern*: `^.{1,300}$` | String getName() | setName(String name) |
| `Number` | `String` | Optional | The primary account number (PAN) for the payment card.<br>**Constraints**: *Minimum Length*: `13`, *Maximum Length*: `19`, *Pattern*: `^[0-9]{13,19}$` | String getNumber() | setNumber(String number) |
| `Expiry` | `String` | Optional | The card expiration year and month, in [Internet date format](https://tools.ietf.org/html/rfc3339#section-5.6).<br>**Constraints**: *Minimum Length*: `7`, *Maximum Length*: `7`, *Pattern*: `^[0-9]{4}-(0[1-9]\|1[0-2])$` | String getExpiry() | setExpiry(String expiry) |
| `SecurityCode` | `String` | Optional | The three- or four-digit security code of the card. Also known as the CVV, CVC, CVN, CVE, or CID. This parameter cannot be present in the request when `payment_initiator=MERCHANT`.<br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `4`, *Pattern*: `^[0-9]{3,4}$` | String getSecurityCode() | setSecurityCode(String securityCode) |
| `LastDigits` | `String` | Optional | The last digits of the payment card.<br>**Constraints**: *Minimum Length*: `2`, *Maximum Length*: `4`, *Pattern*: `^[0-9]{2,4}$` | String getLastDigits() | setLastDigits(String lastDigits) |
| `CardType` | [`CardBrandEnum`](../../doc/models/card-brand-enum.md) | Optional | The card brand or network. Typically used in the response.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255`, *Pattern*: `^[A-Z_]+$` | CardBrandEnum getCardType() | setCardType(CardBrandEnum cardType) |
| `Type` | [`CardTypeEnum`](../../doc/models/card-type-enum.md) | Optional | The payment card type.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255`, *Pattern*: `^[A-Z_]+$` | CardTypeEnum getType() | setType(CardTypeEnum type) |
| `Brand` | [`CardBrandEnum`](../../doc/models/card-brand-enum.md) | Optional | The card brand or network. Typically used in the response.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255`, *Pattern*: `^[A-Z_]+$` | CardBrandEnum getBrand() | setBrand(CardBrandEnum brand) |
| `BillingAddress` | [`PortablePostalAddressMediumGrained`](../../doc/models/portable-postal-address-medium-grained.md) | Optional | The billing address for this card. Supports only the `address_line_1`, `address_line_2`, `admin_area_1`, `admin_area_2`, `postal_code`, and `country_code` properties. | PortablePostalAddressMediumGrained getBillingAddress() | setBillingAddress(PortablePostalAddressMediumGrained billingAddress) |
| `VerificationMethod` | `String` | Optional | The API caller can opt in to verify the payment token through PayPal offered verification services (e.g. Smart Dollar Auth, 3DS).<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255`, *Pattern*: `^[0-9A-Z_]+$` | String getVerificationMethod() | setVerificationMethod(String verificationMethod) |
| `ExperienceContext` | [`ExperienceContext1`](../../doc/models/experience-context-1.md) | Optional | Customizes the Vault creation flow experience for your customers. | ExperienceContext1 getExperienceContext() | setExperienceContext(ExperienceContext1 experienceContext) |

## Example (as JSON)

```json
{
  "id": "id0",
  "name": "name0",
  "number": "number8",
  "expiry": "expiry8",
  "security_code": "security_code2"
}
```

