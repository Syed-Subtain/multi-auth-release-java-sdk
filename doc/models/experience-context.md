
# Experience Context

Customizes the payer experience during the approval process for the payment.

## Structure

`ExperienceContext`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `BrandName` | `String` | Optional | The label that overrides the business name in the PayPal account on the PayPal site. The pattern is defined by an external party and supports Unicode.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `127`, *Pattern*: `^.*$` | String getBrandName() | setBrandName(String brandName) |
| `Locale` | `String` | Optional | The BCP 47-formatted locale of pages that the PayPal payment experience shows. PayPal supports a five-character code. For example, `da-DK`, `he-IL`, `id-ID`, `ja-JP`, `no-NO`, `pt-BR`, `ru-RU`, `sv-SE`, `th-TH`, `zh-CN`, `zh-HK`, or `zh-TW`.<br>**Constraints**: *Minimum Length*: `2`, *Maximum Length*: `10`, *Pattern*: `^[a-z]{2}(?:-[A-Z][a-z]{3})?(?:-(?:[A-Z]{2}\|[0-9]{3}))?$` | String getLocale() | setLocale(String locale) |
| `ShippingPreference` | [`ExperienceContextBaseShippingPreferenceEnum`](../../doc/models/experience-context-base-shipping-preference-enum.md) | Optional | The location from which the shipping address is derived.<br>**Default**: `ExperienceContextBaseShippingPreferenceEnum.GET_FROM_FILE`<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `24`, *Pattern*: `^[A-Z_]+$` | ExperienceContextBaseShippingPreferenceEnum getShippingPreference() | setShippingPreference(ExperienceContextBaseShippingPreferenceEnum shippingPreference) |
| `ReturnUrl` | `String` | Optional | The URL where the customer is redirected after the customer approves the payment. | String getReturnUrl() | setReturnUrl(String returnUrl) |
| `CancelUrl` | `String` | Optional | The URL where the customer is redirected after the customer cancels the payment. | String getCancelUrl() | setCancelUrl(String cancelUrl) |

## Example (as JSON)

```json
{
  "shipping_preference": "GET_FROM_FILE",
  "brand_name": "brand_name0",
  "locale": "locale4",
  "return_url": "return_url2",
  "cancel_url": "cancel_url4"
}
```

