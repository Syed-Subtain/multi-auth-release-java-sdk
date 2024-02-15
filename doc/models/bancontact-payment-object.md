
# Bancontact Payment Object

Information used to pay Bancontact.

## Structure

`BancontactPaymentObject`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | The name of the account holder associated with this payment method.<br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `300` | String getName() | setName(String name) |
| `CountryCode` | `String` | Optional | The two-character ISO 3166-1 country code.<br>**Constraints**: *Minimum Length*: `2`, *Maximum Length*: `2`, *Pattern*: `^([A-Z]{2}\|C2)$` | String getCountryCode() | setCountryCode(String countryCode) |
| `Bic` | `String` | Optional | The bank identification code (BIC).<br>**Constraints**: *Minimum Length*: `8`, *Maximum Length*: `11`, *Pattern*: `^[A-Z-a-z0-9]{4}[A-Z-a-z]{2}[A-Z-a-z0-9]{2}([A-Z-a-z0-9]{3})?$` | String getBic() | setBic(String bic) |
| `IbanLastChars` | `String` | Optional | The last characters of the IBAN used to pay.<br>**Constraints**: *Minimum Length*: `4`, *Maximum Length*: `34`, *Pattern*: `[a-zA-Z0-9]{4}` | String getIbanLastChars() | setIbanLastChars(String ibanLastChars) |
| `CardLastDigits` | `String` | Optional | The last digits of the card used to fund the Bancontact payment.<br>**Constraints**: *Minimum Length*: `4`, *Maximum Length*: `4`, *Pattern*: `[0-9]{4}` | String getCardLastDigits() | setCardLastDigits(String cardLastDigits) |
| `Attributes` | `Object` | Optional | Attributes for SEPA direct debit object. | Object getAttributes() | setAttributes(Object attributes) |

## Example (as JSON)

```json
{
  "name": "name6",
  "country_code": "country_code6",
  "bic": "bic8",
  "iban_last_chars": "iban_last_chars4",
  "card_last_digits": "card_last_digits0"
}
```

