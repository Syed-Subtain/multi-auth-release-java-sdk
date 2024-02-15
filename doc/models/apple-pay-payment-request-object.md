
# Apple Pay Payment Request Object

Information needed to pay using ApplePay.

## Structure

`ApplePayPaymentRequestObject`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | ApplePay transaction identifier, this will be the unique identifier for this transaction provided by Apple. The pattern is defined by an external party and supports Unicode.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `250`, *Pattern*: `^.*$` | String getId() | setId(String id) |
| `Name` | `String` | Optional | Name on the account holder associated with apple pay.<br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `300` | String getName() | setName(String name) |
| `EmailAddress` | `String` | Optional | The email address of the account holder associated with apple pay.<br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `254`, *Pattern*: `^.+@[^"\-].+$` | String getEmailAddress() | setEmailAddress(String emailAddress) |
| `PhoneNumber` | [`Phone`](../../doc/models/phone.md) | Optional | The phone number, in its canonical international [E.164 numbering plan format](https://www.itu.int/rec/T-REC-E.164/en). Supports only the `national_number` property. | Phone getPhoneNumber() | setPhoneNumber(Phone phoneNumber) |
| `DecryptedToken` | [`DecryptedApplePayTokenData`](../../doc/models/decrypted-apple-pay-token-data.md) | Optional | The decrypted payload details for the apple pay token. | DecryptedApplePayTokenData getDecryptedToken() | setDecryptedToken(DecryptedApplePayTokenData decryptedToken) |
| `StoredCredential` | [`CardStoredCredential`](../../doc/models/card-stored-credential.md) | Optional | Provides additional details to process a payment using a `card` that has been stored or is intended to be stored (also referred to as stored_credential or card-on-file).<br/>Parameter compatibility:<br/><ul><li>`payment_type=ONE_TIME` is compatible only with `payment_initiator=CUSTOMER`.</li><li>`usage=FIRST` is compatible only with `payment_initiator=CUSTOMER`.</li><li>`previous_transaction_reference` or `previous_network_transaction_reference` is compatible only with `payment_initiator=MERCHANT`.</li><li>Only one of the parameters - `previous_transaction_reference` and `previous_network_transaction_reference` - can be present in the request.</li></ul> | CardStoredCredential getStoredCredential() | setStoredCredential(CardStoredCredential storedCredential) |
| `VaultId` | `String` | Optional | The PayPal-generated ID for the saved apple pay payment_source. This ID should be stored on the merchant's server so the saved payment source can be used for future transactions.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255`, *Pattern*: `^[0-9a-zA-Z_-]+$` | String getVaultId() | setVaultId(String vaultId) |
| `Attributes` | `Object` | Optional | - | Object getAttributes() | setAttributes(Object attributes) |

## Example (as JSON)

```json
{
  "id": "id4",
  "name": "name4",
  "email_address": "email_address2",
  "phone_number": {
    "country_code": "country_code2",
    "national_number": "national_number6",
    "extension_number": "extension_number8"
  },
  "decrypted_token": {
    "transaction_amount": {
      "currency_code": "currency_code6",
      "value": "value2"
    },
    "tokenized_card": {
      "id": "id4",
      "name": "name4",
      "number": "number2",
      "expiry": "expiry2",
      "security_code": "security_code6"
    },
    "device_manufacturer_id": "device_manufacturer_id6",
    "payment_data_type": "3DSECURE",
    "payment_data": {
      "cryptogram": "cryptogram6",
      "eci_indicator": "eci_indicator0",
      "emv_data": "emv_data0",
      "pin": "pin4"
    }
  }
}
```

