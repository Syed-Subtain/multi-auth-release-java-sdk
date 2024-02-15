
# Confirm Application Context

Customizes the payer confirmation experience.

## Structure

`ConfirmApplicationContext`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `BrandName` | `String` | Optional | Label to present to your payer as part of the PayPal hosted web experience.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `127` | String getBrandName() | setBrandName(String brandName) |
| `Locale` | `String` | Optional | The BCP 47-formatted locale of pages that the PayPal payment experience shows. PayPal supports a five-character code. For example, `da-DK`, `he-IL`, `id-ID`, `ja-JP`, `no-NO`, `pt-BR`, `ru-RU`, `sv-SE`, `th-TH`, `zh-CN`, `zh-HK`, or `zh-TW`.<br>**Constraints**: *Minimum Length*: `2`, *Maximum Length*: `10`, *Pattern*: `^[a-z]{2}(?:-[A-Z][a-z]{3})?(?:-(?:[A-Z]{2}\|[0-9]{3}))?$` | String getLocale() | setLocale(String locale) |
| `ReturnUrl` | `String` | Optional | The URL where the customer is redirected after the customer approves the payment.<br>**Constraints**: *Minimum Length*: `10`, *Maximum Length*: `4000` | String getReturnUrl() | setReturnUrl(String returnUrl) |
| `CancelUrl` | `String` | Optional | The URL where the customer is redirected after the customer cancels the payment.<br>**Constraints**: *Minimum Length*: `10`, *Maximum Length*: `4000` | String getCancelUrl() | setCancelUrl(String cancelUrl) |
| `StoredPaymentSource` | [`StoredPaymentSource`](../../doc/models/stored-payment-source.md) | Optional | Provides additional details to process a payment using a `payment_source` that has been stored or is intended to be stored (also referred to as stored_credential or card-on-file).<br/>Parameter compatibility:<br/><ul><li>`payment_type=ONE_TIME` is compatible only with `payment_initiator=CUSTOMER`.</li><li>`usage=FIRST` is compatible only with `payment_initiator=CUSTOMER`.</li><li>`previous_transaction_reference` or `previous_network_transaction_reference` is compatible only with `payment_initiator=MERCHANT`.</li><li>Only one of the parameters - `previous_transaction_reference` and `previous_network_transaction_reference` - can be present in the request.</li></ul> | StoredPaymentSource getStoredPaymentSource() | setStoredPaymentSource(StoredPaymentSource storedPaymentSource) |

## Example (as JSON)

```json
{
  "brand_name": "brand_name4",
  "locale": "locale8",
  "return_url": "return_url4",
  "cancel_url": "cancel_url8",
  "stored_payment_source": {
    "payment_initiator": "CUSTOMER",
    "payment_type": "RECURRING",
    "usage": "FIRST",
    "previous_network_transaction_reference": {
      "id": "id6",
      "date": "date2",
      "network": "SWITCH",
      "acquirer_reference_number": "acquirer_reference_number8"
    }
  }
}
```

