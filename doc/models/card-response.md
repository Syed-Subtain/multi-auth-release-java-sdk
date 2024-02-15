
# Card Response

The payment card to use to fund a payment. Card can be a credit or debit card.

## Structure

`CardResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | The card holder's name as it appears on the card.<br>**Constraints**: *Minimum Length*: `2`, *Maximum Length*: `300` | String getName() | setName(String name) |
| `LastDigits` | `String` | Optional | The last digits of the payment card.<br>**Constraints**: *Pattern*: `[0-9]{2,}` | String getLastDigits() | setLastDigits(String lastDigits) |
| `Brand` | [`CardBrandEnum`](../../doc/models/card-brand-enum.md) | Optional | The card brand or network. Typically used in the response.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255`, *Pattern*: `^[A-Z_]+$` | CardBrandEnum getBrand() | setBrand(CardBrandEnum brand) |
| `AvailableNetworks` | [`List<CardBrandEnum>`](../../doc/models/card-brand-enum.md) | Optional | Array of brands or networks associated with the card.<br>**Constraints**: *Minimum Items*: `1`, *Maximum Items*: `256`, *Minimum Length*: `1`, *Maximum Length*: `255`, *Pattern*: `^[A-Z_]+$` | List<CardBrandEnum> getAvailableNetworks() | setAvailableNetworks(List<CardBrandEnum> availableNetworks) |
| `Type` | [`CardResponseTypeEnum`](../../doc/models/card-response-type-enum.md) | Optional | The payment card type. | CardResponseTypeEnum getType() | setType(CardResponseTypeEnum type) |
| `AuthenticationResult` | [`AuthenticationResponse`](../../doc/models/authentication-response.md) | Optional | Results of Authentication such as 3D Secure. | AuthenticationResponse getAuthenticationResult() | setAuthenticationResult(AuthenticationResponse authenticationResult) |
| `Attributes` | [`CardAttributesResponse`](../../doc/models/card-attributes-response.md) | Optional | Additional attributes associated with the use of this card. | CardAttributesResponse getAttributes() | setAttributes(CardAttributesResponse attributes) |
| `FromRequest` | [`ResponseOfCardFromRequest`](../../doc/models/response-of-card-from-request.md) | Optional | Representation of card details as received in the request. | ResponseOfCardFromRequest getFromRequest() | setFromRequest(ResponseOfCardFromRequest fromRequest) |
| `Expiry` | `String` | Optional | The card expiration year and month, in [Internet date format](https://tools.ietf.org/html/rfc3339#section-5.6).<br>**Constraints**: *Minimum Length*: `7`, *Maximum Length*: `7`, *Pattern*: `^[0-9]{4}-(0[1-9]\|1[0-2])$` | String getExpiry() | setExpiry(String expiry) |
| `BinDetails` | [`BinDetails`](../../doc/models/bin-details.md) | Optional | Bank Identification Number (BIN) details used to fund a payment. | BinDetails getBinDetails() | setBinDetails(BinDetails binDetails) |

## Example (as JSON)

```json
{
  "name": "name0",
  "last_digits": "last_digits4",
  "brand": "CONFIDIS",
  "available_networks": [
    "MAESTRO",
    "SWITCH",
    "DELTA"
  ],
  "type": "PREPAID"
}
```

