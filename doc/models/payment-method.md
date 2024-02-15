
# Payment Method

The customer and merchant payment preferences.

## Structure

`PaymentMethod`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PayeePreferred` | [`PayeePaymentMethodPreferenceEnum`](../../doc/models/payee-payment-method-preference-enum.md) | Optional | The merchant-preferred payment methods.<br>**Default**: `PayeePaymentMethodPreferenceEnum.UNRESTRICTED`<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255`, *Pattern*: `^[0-9A-Z_]+$` | PayeePaymentMethodPreferenceEnum getPayeePreferred() | setPayeePreferred(PayeePaymentMethodPreferenceEnum payeePreferred) |
| `StandardEntryClassCode` | [`PaymentMethodStandardEntryClassCodeEnum`](../../doc/models/payment-method-standard-entry-class-code-enum.md) | Optional | NACHA (the regulatory body governing the ACH network) requires that API callers (merchants, partners) obtain the consumer’s explicit authorization before initiating a transaction. To stay compliant, you’ll need to make sure that you retain a compliant authorization for each transaction that you originate to the ACH Network using this API. ACH transactions are categorized (using SEC codes) by how you capture authorization from the Receiver (the person whose bank account is being debited or credited). PayPal supports the following SEC codes.<br>**Default**: `PaymentMethodStandardEntryClassCodeEnum.WEB`<br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `255` | PaymentMethodStandardEntryClassCodeEnum getStandardEntryClassCode() | setStandardEntryClassCode(PaymentMethodStandardEntryClassCodeEnum standardEntryClassCode) |

## Example (as JSON)

```json
{
  "payee_preferred": "UNRESTRICTED",
  "standard_entry_class_code": "WEB"
}
```

