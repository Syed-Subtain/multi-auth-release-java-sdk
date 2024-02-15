
# Vaulted Pay Pal Wallet Common Attributes

Resource consolidating common request and response attributes for vaulting PayPal Wallet.

## Structure

`VaultedPayPalWalletCommonAttributes`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `StoreInVault` | [`StoreInVaultInstructionEnum`](../../doc/models/store-in-vault-instruction-enum.md) | Optional | Defines how and when the payment source gets vaulted.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255`, *Pattern*: `^[0-9A-Z_]+$` | StoreInVaultInstructionEnum getStoreInVault() | setStoreInVault(StoreInVaultInstructionEnum storeInVault) |
| `Description` | `String` | Optional | The description displayed to PayPal consumer on the approval flow for PayPal, as well as on the PayPal payment token management experience on PayPal.com.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `128` | String getDescription() | setDescription(String description) |
| `UsagePattern` | [`VaultPaypalWalletBaseAllof1UsagePatternEnum`](../../doc/models/vault-paypal-wallet-base-allof-1-usage-pattern-enum.md) | Optional | Expected business/pricing model for the billing agreement.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `30` | VaultPaypalWalletBaseAllof1UsagePatternEnum getUsagePattern() | setUsagePattern(VaultPaypalWalletBaseAllof1UsagePatternEnum usagePattern) |
| `Shipping` | [`ShippingDetails`](../../doc/models/shipping-details.md) | Optional | The shipping address for the Payer. | ShippingDetails getShipping() | setShipping(ShippingDetails shipping) |
| `UsageType` | [`VaultPaypalWalletBaseAllof1UsageTypeEnum`](../../doc/models/vault-paypal-wallet-base-allof-1-usage-type-enum.md) | Required | The usage type associated with the PayPal payment token.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255`, *Pattern*: `^[0-9A-Z_]+$` | VaultPaypalWalletBaseAllof1UsageTypeEnum getUsageType() | setUsageType(VaultPaypalWalletBaseAllof1UsageTypeEnum usageType) |
| `CustomerType` | [`VaultPaypalWalletBaseAllof1CustomerTypeEnum`](../../doc/models/vault-paypal-wallet-base-allof-1-customer-type-enum.md) | Optional | The customer type associated with the PayPal payment token. This is to indicate whether the customer acting on the merchant / platform is either a business or a consumer.<br>**Default**: `VaultPaypalWalletBaseAllof1CustomerTypeEnum.CONSUMER`<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255`, *Pattern*: `^[0-9A-Z_]+$` | VaultPaypalWalletBaseAllof1CustomerTypeEnum getCustomerType() | setCustomerType(VaultPaypalWalletBaseAllof1CustomerTypeEnum customerType) |
| `PermitMultiplePaymentTokens` | `Boolean` | Optional | Create multiple payment tokens for the same payer, merchant/platform combination. Use this when the customer has not logged in at merchant/platform. The payment token thus generated, can then also be used to create the customer account at merchant/platform. Use this also when multiple payment tokens are required for the same payer, different customer at merchant/platform. This helps to identify customers distinctly even though they may share the same PayPal account. This only applies to PayPal payment source.<br>**Default**: `false` | Boolean getPermitMultiplePaymentTokens() | setPermitMultiplePaymentTokens(Boolean permitMultiplePaymentTokens) |

## Example (as JSON)

```json
{
  "usage_type": "MERCHANT",
  "customer_type": "CONSUMER",
  "permit_multiple_payment_tokens": false,
  "store_in_vault": "ON_SUCCESS",
  "description": "description8",
  "usage_pattern": "IMMEDIATE",
  "shipping": {
    "name": {
      "prefix": "prefix8",
      "given_name": "given_name2",
      "surname": "surname8",
      "middle_name": "middle_name0",
      "suffix": "suffix0"
    },
    "type": "SHIPPING",
    "options": [
      {
        "id": "id2",
        "label": "label2",
        "type": "SHIPPING",
        "amount": {
          "currency_code": "currency_code6",
          "value": "value0"
        },
        "selected": false
      },
      {
        "id": "id2",
        "label": "label2",
        "type": "SHIPPING",
        "amount": {
          "currency_code": "currency_code6",
          "value": "value0"
        },
        "selected": false
      },
      {
        "id": "id2",
        "label": "label2",
        "type": "SHIPPING",
        "amount": {
          "currency_code": "currency_code6",
          "value": "value0"
        },
        "selected": false
      }
    ],
    "address": {
      "address_line_1": "address_line_16",
      "address_line_2": "address_line_26",
      "address_line_3": "address_line_32",
      "admin_area_4": "admin_area_40",
      "admin_area_3": "admin_area_38",
      "country_code": "country_code6"
    }
  }
}
```

