
# Payment Source

The payment source used to fund the payment.

## Structure

`PaymentSource`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Card` | [`CardResponse`](../../doc/models/card-response.md) | Optional | The payment card to use to fund a payment. Card can be a credit or debit card. | CardResponse getCard() | setCard(CardResponse card) |
| `Paypal` | [`PayPalWalletResponse`](../../doc/models/pay-pal-wallet-response.md) | Optional | The PayPal Wallet response. | PayPalWalletResponse getPaypal() | setPaypal(PayPalWalletResponse paypal) |
| `Bancontact` | [`BancontactPaymentObject`](../../doc/models/bancontact-payment-object.md) | Optional | Information used to pay Bancontact. | BancontactPaymentObject getBancontact() | setBancontact(BancontactPaymentObject bancontact) |
| `Blik` | [`BLIKPaymentObject`](../../doc/models/blik-payment-object.md) | Optional | Information used to pay using BLIK. | BLIKPaymentObject getBlik() | setBlik(BLIKPaymentObject blik) |
| `Eps` | [`AnEpsPaymentObject`](../../doc/models/an-eps-payment-object.md) | Optional | Information used to pay using eps. | AnEpsPaymentObject getEps() | setEps(AnEpsPaymentObject eps) |
| `Giropay` | [`AGiropayPaymentObject`](../../doc/models/a-giropay-payment-object.md) | Optional | Information needed to pay using giropay. | AGiropayPaymentObject getGiropay() | setGiropay(AGiropayPaymentObject giropay) |
| `Ideal` | [`TheIDEALPaymentObject`](../../doc/models/the-ideal-payment-object.md) | Optional | Information used to pay using iDEAL. | TheIDEALPaymentObject getIdeal() | setIdeal(TheIDEALPaymentObject ideal) |
| `Mybank` | [`MyBankPaymentObject`](../../doc/models/my-bank-payment-object.md) | Optional | Information used to pay using MyBank. | MyBankPaymentObject getMybank() | setMybank(MyBankPaymentObject mybank) |
| `P24` | [`P24PaymentObject`](../../doc/models/p24-payment-object.md) | Optional | Information used to pay using P24(Przelewy24). | P24PaymentObject getP24() | setP24(P24PaymentObject p24) |
| `Sofort` | [`SofortPaymentObject`](../../doc/models/sofort-payment-object.md) | Optional | Information used to pay using Sofort. | SofortPaymentObject getSofort() | setSofort(SofortPaymentObject sofort) |
| `Trustly` | [`TrustlyPaymentObject`](../../doc/models/trustly-payment-object.md) | Optional | Information needed to pay using Trustly. | TrustlyPaymentObject getTrustly() | setTrustly(TrustlyPaymentObject trustly) |
| `Venmo` | [`VenmoWalletResponseObject`](../../doc/models/venmo-wallet-response-object.md) | Optional | Venmo wallet response. | VenmoWalletResponseObject getVenmo() | setVenmo(VenmoWalletResponseObject venmo) |

## Example (as JSON)

```json
{
  "card": {
    "name": "name6",
    "last_digits": "last_digits0",
    "brand": "CETELEM",
    "available_networks": [
      "DELTA"
    ],
    "type": "CREDIT"
  },
  "paypal": {
    "email_address": "email_address0",
    "account_id": "account_id4",
    "name": {
      "prefix": "prefix8",
      "given_name": "given_name2",
      "surname": "surname8",
      "middle_name": "middle_name0",
      "suffix": "suffix0"
    },
    "phone_type": "MOBILE",
    "phone_number": {
      "national_number": "national_number6"
    }
  },
  "bancontact": {
    "name": "name0",
    "country_code": "country_code0",
    "bic": "bic2",
    "iban_last_chars": "iban_last_chars8",
    "card_last_digits": "card_last_digits4"
  },
  "blik": {
    "name": "name2",
    "country_code": "country_code2",
    "email": "email4",
    "one_click": {
      "consumer_reference": "consumer_reference2"
    }
  },
  "eps": {
    "name": "name6",
    "country_code": "country_code6",
    "bic": "bic8"
  }
}
```

