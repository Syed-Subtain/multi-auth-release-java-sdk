
# Card Request Allof 1

## Structure

`CardRequestAllof1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `VaultId` | `String` | Optional | The PayPal-generated ID for the saved card payment source. Typically stored on the merchant's server.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255`, *Pattern*: `^[0-9a-zA-Z_-]+$` | String getVaultId() | setVaultId(String vaultId) |
| `StoredCredential` | [`CardStoredCredential`](../../doc/models/card-stored-credential.md) | Optional | Provides additional details to process a payment using a `card` that has been stored or is intended to be stored (also referred to as stored_credential or card-on-file).<br/>Parameter compatibility:<br/><ul><li>`payment_type=ONE_TIME` is compatible only with `payment_initiator=CUSTOMER`.</li><li>`usage=FIRST` is compatible only with `payment_initiator=CUSTOMER`.</li><li>`previous_transaction_reference` or `previous_network_transaction_reference` is compatible only with `payment_initiator=MERCHANT`.</li><li>Only one of the parameters - `previous_transaction_reference` and `previous_network_transaction_reference` - can be present in the request.</li></ul> | CardStoredCredential getStoredCredential() | setStoredCredential(CardStoredCredential storedCredential) |
| `NetworkToken` | [`NetworkToken`](../../doc/models/network-token.md) | Optional | A 3rd party network token refers to a network token that the merchant provisions from and vaults with an external TSP (Token Service Provider) other than PayPal. | NetworkToken getNetworkToken() | setNetworkToken(NetworkToken networkToken) |
| `ExperienceContext` | [`CardExperienceContext`](../../doc/models/card-experience-context.md) | Optional | Customizes the payer experience during the 3DS Approval for payment. | CardExperienceContext getExperienceContext() | setExperienceContext(CardExperienceContext experienceContext) |

## Example (as JSON)

```json
{
  "vault_id": "vault_id2",
  "stored_credential": {
    "payment_initiator": "CUSTOMER",
    "payment_type": "ONE_TIME",
    "usage": "SUBSEQUENT",
    "previous_network_transaction_reference": {
      "id": "id6",
      "date": "date2",
      "network": "SWITCH",
      "acquirer_reference_number": "acquirer_reference_number8"
    }
  },
  "network_token": {
    "number": "number0",
    "expiry": "expiry0",
    "cryptogram": "cryptogram2",
    "eci_flag": "MASTERCARD_NON_3D_SECURE_TRANSACTION",
    "token_requestor_id": "token_requestor_id8"
  },
  "experience_context": {
    "return_url": "return_url4",
    "cancel_url": "cancel_url6"
  }
}
```

