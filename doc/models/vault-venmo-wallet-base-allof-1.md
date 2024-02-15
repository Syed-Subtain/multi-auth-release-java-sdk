
# Vault Venmo Wallet Base Allof 1

## Structure

`VaultVenmoWalletBaseAllof1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Description` | `String` | Optional | The description displayed to Venmo consumer on the approval flow for Venmo, as well as on the Venmo payment token management experience on Venmo.com.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `128`, *Pattern*: `^[a-zA-Z0-9_'\-., :;\!?"]*$` | String getDescription() | setDescription(String description) |
| `UsagePattern` | [`VaultVenmoWalletBaseAllof1UsagePatternEnum`](../../doc/models/vault-venmo-wallet-base-allof-1-usage-pattern-enum.md) | Optional | Expected business/pricing model for the billing agreement.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `30`, *Pattern*: `^[0-9A-Z_]+$` | VaultVenmoWalletBaseAllof1UsagePatternEnum getUsagePattern() | setUsagePattern(VaultVenmoWalletBaseAllof1UsagePatternEnum usagePattern) |
| `UsageType` | [`VaultVenmoWalletBaseAllof1UsageTypeEnum`](../../doc/models/vault-venmo-wallet-base-allof-1-usage-type-enum.md) | Optional | The usage type associated with the Venmo payment token.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255`, *Pattern*: `^[0-9A-Z_]+$` | VaultVenmoWalletBaseAllof1UsageTypeEnum getUsageType() | setUsageType(VaultVenmoWalletBaseAllof1UsageTypeEnum usageType) |
| `CustomerType` | [`VaultVenmoWalletBaseAllof1CustomerTypeEnum`](../../doc/models/vault-venmo-wallet-base-allof-1-customer-type-enum.md) | Optional | The customer type associated with the Venmo payment token. This is to indicate whether the customer acting on the merchant / platform is either a business or a consumer.<br>**Default**: `VaultVenmoWalletBaseAllof1CustomerTypeEnum.CONSUMER`<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255`, *Pattern*: `^[0-9A-Z_]+$` | VaultVenmoWalletBaseAllof1CustomerTypeEnum getCustomerType() | setCustomerType(VaultVenmoWalletBaseAllof1CustomerTypeEnum customerType) |
| `PermitMultiplePaymentTokens` | `Boolean` | Optional | Create multiple payment tokens for the same payer, merchant/platform combination. Use this when the customer has not logged in at merchant/platform. The payment token thus generated, can then also be used to create the customer account at merchant/platform. Use this also when multiple payment tokens are required for the same payer, different customer at merchant/platform. This helps to identify customers distinctly even though they may share the same Venmo account.<br>**Default**: `false` | Boolean getPermitMultiplePaymentTokens() | setPermitMultiplePaymentTokens(Boolean permitMultiplePaymentTokens) |

## Example (as JSON)

```json
{
  "customer_type": "CONSUMER",
  "permit_multiple_payment_tokens": false,
  "description": "description4",
  "usage_pattern": "IMMEDIATE",
  "usage_type": "MERCHANT"
}
```

