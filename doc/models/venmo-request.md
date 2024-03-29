
# Venmo Request

A resource representing a request to vault Venmo.

## Structure

`VenmoRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Description` | `String` | Optional | The description displayed to the consumer on the approval flow for a digital wallet, as well as on the merchant view of the payment token management experience. exp: PayPal.com.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `128`, *Pattern*: `^[a-zA-Z0-9_'\-., :;\!?"]*$` | String getDescription() | setDescription(String description) |
| `Shipping` | [`ShippingDetails1`](../../doc/models/shipping-details-1.md) | Optional | The shipping address for the Payer. | ShippingDetails1 getShipping() | setShipping(ShippingDetails1 shipping) |
| `PermitMultiplePaymentTokens` | `Boolean` | Optional | Create multiple payment tokens for the same payer, merchant/platform combination. Use this when the customer has not logged in at merchant/platform. The payment token thus generated, can then also be used to create the customer account at merchant/platform. Use this also when multiple payment tokens are required for the same payer, different customer at merchant/platform. This helps to identify customers distinctly even though they may share the same PayPal account. This only applies to PayPal payment source.<br>**Default**: `false` | Boolean getPermitMultiplePaymentTokens() | setPermitMultiplePaymentTokens(Boolean permitMultiplePaymentTokens) |
| `UsageType` | `String` | Optional | The usage type associated with a digital wallet payment token.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255`, *Pattern*: `^[0-9A-Z_]+$` | String getUsageType() | setUsageType(String usageType) |
| `CustomerType` | `String` | Optional | The customer type associated with a digital wallet payment token. This is to indicate whether the customer acting on the merchant / platform is either a business or a consumer.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255`, *Pattern*: `^[0-9A-Z_]+$` | String getCustomerType() | setCustomerType(String customerType) |
| `ExperienceContext` | [`ExperienceContext1`](../../doc/models/experience-context-1.md) | Optional | Customizes the Vault creation flow experience for your customers. | ExperienceContext1 getExperienceContext() | setExperienceContext(ExperienceContext1 experienceContext) |

## Example (as JSON)

```json
{
  "permit_multiple_payment_tokens": false,
  "description": "description4",
  "shipping": {
    "name": {
      "prefix": "prefix8",
      "given_name": "given_name2",
      "surname": "surname8",
      "middle_name": "middle_name0",
      "suffix": "suffix0"
    },
    "type": "SHIPPING",
    "address": {
      "address_line_1": "address_line_16",
      "address_line_2": "address_line_26",
      "address_line_3": "address_line_32",
      "admin_area_4": "admin_area_40",
      "admin_area_3": "admin_area_38",
      "country_code": "country_code6"
    }
  },
  "usage_type": "usage_type4",
  "customer_type": "customer_type2"
}
```

