
# Pay Pal Wallet Experience Context

Customizes the payer experience during the approval process for payment with PayPal.<blockquote><strong>Note:</strong> Partners and Marketplaces might configure <code>brand_name</code> and <code>shipping_preference</code> during partner account setup, which overrides the request values.</blockquote>

## Structure

`PayPalWalletExperienceContext`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `BrandName` | `String` | Optional | The label that overrides the business name in the PayPal account on the PayPal site. The pattern is defined by an external party and supports Unicode.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `127`, *Pattern*: `^.*$` | String getBrandName() | setBrandName(String brandName) |
| `Locale` | `String` | Optional | The BCP 47-formatted locale of pages that the PayPal payment experience shows. PayPal supports a five-character code. For example, `da-DK`, `he-IL`, `id-ID`, `ja-JP`, `no-NO`, `pt-BR`, `ru-RU`, `sv-SE`, `th-TH`, `zh-CN`, `zh-HK`, or `zh-TW`.<br>**Constraints**: *Minimum Length*: `2`, *Maximum Length*: `10`, *Pattern*: `^[a-z]{2}(?:-[A-Z][a-z]{3})?(?:-(?:[A-Z]{2}\|[0-9]{3}))?$` | String getLocale() | setLocale(String locale) |
| `ShippingPreference` | [`ShippingAddressSourceLocationEnum`](../../doc/models/shipping-address-source-location-enum.md) | Optional | The location from which the shipping address is derived.<br>**Default**: `ShippingAddressSourceLocationEnum.GET_FROM_FILE`<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `24`, *Pattern*: `^[A-Z_]+$` | ShippingAddressSourceLocationEnum getShippingPreference() | setShippingPreference(ShippingAddressSourceLocationEnum shippingPreference) |
| `ReturnUrl` | `String` | Optional | The URL where the customer will be redirected upon approving a payment. | String getReturnUrl() | setReturnUrl(String returnUrl) |
| `CancelUrl` | `String` | Optional | The URL where the customer will be redirected upon cancelling the payment approval. | String getCancelUrl() | setCancelUrl(String cancelUrl) |
| `LandingPage` | [`PaypalWalletExperienceContextLandingPageEnum`](../../doc/models/paypal-wallet-experience-context-landing-page-enum.md) | Optional | The type of landing page to show on the PayPal site for customer checkout.<br>**Default**: `PaypalWalletExperienceContextLandingPageEnum.NO_PREFERENCE`<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `13`, *Pattern*: `^[0-9A-Z_]+$` | PaypalWalletExperienceContextLandingPageEnum getLandingPage() | setLandingPage(PaypalWalletExperienceContextLandingPageEnum landingPage) |
| `UserAction` | [`PaypalWalletExperienceContextUserActionEnum`](../../doc/models/paypal-wallet-experience-context-user-action-enum.md) | Optional | Configures a <strong>Continue</strong> or <strong>Pay Now</strong> checkout flow.<br>**Default**: `PaypalWalletExperienceContextUserActionEnum.CONTINUE`<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `8`, *Pattern*: `^[0-9A-Z_]+$` | PaypalWalletExperienceContextUserActionEnum getUserAction() | setUserAction(PaypalWalletExperienceContextUserActionEnum userAction) |
| `PaymentMethodPreference` | [`MerchantPreferredPaymentMethodsEnum`](../../doc/models/merchant-preferred-payment-methods-enum.md) | Optional | The merchant-preferred payment methods.<br>**Default**: `MerchantPreferredPaymentMethodsEnum.UNRESTRICTED`<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255`, *Pattern*: `^[0-9A-Z_]+$` | MerchantPreferredPaymentMethodsEnum getPaymentMethodPreference() | setPaymentMethodPreference(MerchantPreferredPaymentMethodsEnum paymentMethodPreference) |

## Example (as JSON)

```json
{
  "shipping_preference": "GET_FROM_FILE",
  "landing_page": "NO_PREFERENCE",
  "user_action": "CONTINUE",
  "payment_method_preference": "UNRESTRICTED",
  "brand_name": "brand_name6",
  "locale": "locale0",
  "return_url": "return_url8",
  "cancel_url": "cancel_url0"
}
```

