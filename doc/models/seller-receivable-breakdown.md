
# Seller Receivable Breakdown

The detailed breakdown of the capture activity. This is not available for transactions that are in pending state.

## Structure

`SellerReceivableBreakdown`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `GrossAmount` | [`Money`](../../doc/models/money.md) | Required | The amount for this captured payment in the currency of the transaction. | Money getGrossAmount() | setGrossAmount(Money grossAmount) |
| `PaypalFee` | [`Money`](../../doc/models/money.md) | Optional | The applicable fee for this captured payment in the currency of the transaction. | Money getPaypalFee() | setPaypalFee(Money paypalFee) |
| `PaypalFeeInReceivableCurrency` | [`Money`](../../doc/models/money.md) | Optional | The applicable fee for this captured payment in the receivable currency. Returned only in cases the fee is charged in the receivable currency. Example 'CNY'. | Money getPaypalFeeInReceivableCurrency() | setPaypalFeeInReceivableCurrency(Money paypalFeeInReceivableCurrency) |
| `NetAmount` | [`Money`](../../doc/models/money.md) | Optional | The net amount that the payee receives for this captured payment in their PayPal account. The net amount is computed as <code>gross_amount</code> minus the <code>paypal_fee</code> minus the <code>platform_fees</code>. | Money getNetAmount() | setNetAmount(Money netAmount) |
| `ReceivableAmount` | [`Money`](../../doc/models/money.md) | Optional | The net amount that is credited to the payee's PayPal account. Returned only when the currency of the captured payment is different from the currency of the PayPal account where the payee wants to credit the funds. The amount is computed as <code>net_amount</code> times <code>exchange_rate</code>. | Money getReceivableAmount() | setReceivableAmount(Money receivableAmount) |
| `ExchangeRate` | [`ExchangeRate`](../../doc/models/exchange-rate.md) | Optional | The exchange rate that determines the amount that is credited to the payee's PayPal account. Returned when the currency of the captured payment is different from the currency of the PayPal account where the payee wants to credit the funds. | ExchangeRate getExchangeRate() | setExchangeRate(ExchangeRate exchangeRate) |
| `PlatformFees` | [`List<PlatformFee>`](../../doc/models/platform-fee.md) | Optional | An array of platform or partner fees, commissions, or brokerage fees that associated with the captured payment.<br>**Constraints**: *Minimum Items*: `0`, *Maximum Items*: `1` | List<PlatformFee> getPlatformFees() | setPlatformFees(List<PlatformFee> platformFees) |

## Example (as JSON)

```json
{
  "gross_amount": {
    "currency_code": "currency_code4",
    "value": "value0"
  },
  "paypal_fee": {
    "currency_code": "currency_code4",
    "value": "value2"
  },
  "paypal_fee_in_receivable_currency": {
    "currency_code": "currency_code2",
    "value": "value8"
  },
  "net_amount": {
    "currency_code": "currency_code6",
    "value": "value2"
  },
  "receivable_amount": {
    "currency_code": "currency_code2",
    "value": "value8"
  },
  "exchange_rate": {
    "source_currency": "source_currency4",
    "target_currency": "target_currency6",
    "value": "value6"
  }
}
```

