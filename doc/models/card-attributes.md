
# Card Attributes

Additional attributes associated with the use of this card.

## Structure

`CardAttributes`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Customer` | [`PayPalSCustomerDataRecords`](../../doc/models/pay-pal-s-customer-data-records.md) | Optional | The details about a customer in PayPal's system of record. | PayPalSCustomerDataRecords getCustomer() | setCustomer(PayPalSCustomerDataRecords customer) |
| `Vault` | [`BasicVaultInstructionParameters`](../../doc/models/basic-vault-instruction-parameters.md) | Optional | Instruction to vault the card based on the specified strategy. | BasicVaultInstructionParameters getVault() | setVault(BasicVaultInstructionParameters vault) |

## Example (as JSON)

```json
{
  "customer": {
    "id": "id0",
    "email_address": "email_address2",
    "phone": {
      "phone_type": "FAX",
      "phone_number": {
        "country_code": "country_code2",
        "national_number": "national_number6",
        "extension_number": "extension_number8"
      }
    }
  },
  "vault": {
    "store_in_vault": "ON_SUCCESS"
  }
}
```

