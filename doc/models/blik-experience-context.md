
# BLIK Experience Context

Customizes the payer experience during the approval process for the BLIK payment.

## Structure

`BLIKExperienceContext`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `BrandName` | `String` | Optional | The label that overrides the business name in the PayPal account on the PayPal site. The pattern is defined by an external party and supports Unicode.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `127`, *Pattern*: `^.*$` | String getBrandName() | setBrandName(String brandName) |
| `Locale` | `String` | Optional | The BCP 47-formatted locale of pages that the PayPal payment experience shows. PayPal supports a five-character code. For example, `da-DK`, `he-IL`, `id-ID`, `ja-JP`, `no-NO`, `pt-BR`, `ru-RU`, `sv-SE`, `th-TH`, `zh-CN`, `zh-HK`, or `zh-TW`.<br>**Constraints**: *Minimum Length*: `2`, *Maximum Length*: `10`, *Pattern*: `^[a-z]{2}(?:-[A-Z][a-z]{3})?(?:-(?:[A-Z]{2}\|[0-9]{3}))?$` | String getLocale() | setLocale(String locale) |
| `ShippingPreference` | [`ExperienceContextBaseShippingPreferenceEnum`](../../doc/models/experience-context-base-shipping-preference-enum.md) | Optional | The location from which the shipping address is derived.<br>**Default**: `ExperienceContextBaseShippingPreferenceEnum.GET_FROM_FILE`<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `24`, *Pattern*: `^[A-Z_]+$` | ExperienceContextBaseShippingPreferenceEnum getShippingPreference() | setShippingPreference(ExperienceContextBaseShippingPreferenceEnum shippingPreference) |
| `ReturnUrl` | `String` | Optional | The URL where the customer is redirected after the customer approves the payment. | String getReturnUrl() | setReturnUrl(String returnUrl) |
| `CancelUrl` | `String` | Optional | The URL where the customer is redirected after the customer cancels the payment. | String getCancelUrl() | setCancelUrl(String cancelUrl) |
| `ConsumerIp` | `String` | Optional | The IP address of the consumer. It could be either IPv4 or IPv6.<br>**Constraints**: *Minimum Length*: `7`, *Maximum Length*: `39`, *Pattern*: `^(([0-9]\|[1-9][0-9]\|1[0-9]{2}\|2[0-4][0-9]\|25[0-5])\.){3}([0-9]\|[1-9][0-9]\|1[0-9]{2}\|2[0-4][0-9]\|25[0-5])$\|^(([a-zA-Z]\|[a-zA-Z][a-zA-Z0-9\-]*[a-zA-Z0-9])\.)*([A-Za-z]\|[A-Za-z][A-Za-z0-9\-]*[A-Za-z0-9])$\|^\s*((([0-9A-Fa-f]{1,4}:){7}([0-9A-Fa-f]{1,4}\|:))\|(([0-9A-Fa-f]{1,4}:){6}(:[0-9A-Fa-f]{1,4}\|((25[0-5]\|2[0-4]\d\|1\d\d\|[1-9]?\d)(\.(25[0-5]\|2[0-4]\d\|1\d\d\|[1-9]?\d)){3})\|:))\|(([0-9A-Fa-f]{1,4}:){5}(((:[0-9A-Fa-f]{1,4}){1,2})\|:((25[0-5]\|2[0-4]\d\|1\d\d\|[1-9]?\d)(\.(25[0-5]\|2[0-4]\d\|1\d\d\|[1-9]?\d)){3})\|:))\|(([0-9A-Fa-f]{1,4}:){4}(((:[0-9A-Fa-f]{1,4}){1,3})\|((:[0-9A-Fa-f]{1,4})?:((25[0-5]\|2[0-4]\d\|1\d\d\|[1-9]?\d)(\.(25[0-5]\|2[0-4]\d\|1\d\d\|[1-9]?\d)){3}))\|:))\|(([0-9A-Fa-f]{1,4}:){3}(((:[0-9A-Fa-f]{1,4}){1,4})\|((:[0-9A-Fa-f]{1,4}){0,2}:((25[0-5]\|2[0-4]\d\|1\d\d\|[1-9]?\d)(\.(25[0-5]\|2[0-4]\d\|1\d\d\|[1-9]?\d)){3}))\|:))\|(([0-9A-Fa-f]{1,4}:){2}(((:[0-9A-Fa-f]{1,4}){1,5})\|((:[0-9A-Fa-f]{1,4}){0,3}:((25[0-5]\|2[0-4]\d\|1\d\d\|[1-9]?\d)(\.(25[0-5]\|2[0-4]\d\|1\d\d\|[1-9]?\d)){3}))\|:))\|(([0-9A-Fa-f]{1,4}:){1}(((:[0-9A-Fa-f]{1,4}){1,6})\|((:[0-9A-Fa-f]{1,4}){0,4}:((25[0-5]\|2[0-4]\d\|1\d\d\|[1-9]?\d)(\.(25[0-5]\|2[0-4]\d\|1\d\d\|[1-9]?\d)){3}))\|:))\|(:(((:[0-9A-Fa-f]{1,4}){1,7})\|((:[0-9A-Fa-f]{1,4}){0,5}:((25[0-5]\|2[0-4]\d\|1\d\d\|[1-9]?\d)(\.(25[0-5]\|2[0-4]\d\|1\d\d\|[1-9]?\d)){3}))\|:)))(%.+)?\s*$` | String getConsumerIp() | setConsumerIp(String consumerIp) |
| `ConsumerUserAgent` | `String` | Optional | The payer's User Agent. For example, Mozilla/5.0 (Macintosh; Intel Mac OS X x.y; rv:42.0).<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `256`, *Pattern*: `^.*$` | String getConsumerUserAgent() | setConsumerUserAgent(String consumerUserAgent) |

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

