
# Setup Token Response Payment Source

The setup payment method details.

## Structure

`SetupTokenResponsePaymentSource`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Card` | [`CardResponse1`](../../doc/models/card-response-1.md) | Optional | Full representation of a Card Payment Token. | CardResponse1 getCard() | setCard(CardResponse1 card) |
| `Paypal` | [`PayPalWalletResponse1`](../../doc/models/pay-pal-wallet-response-1.md) | Optional | Full representation of a PayPal Payment Token. | PayPalWalletResponse1 getPaypal() | setPaypal(PayPalWalletResponse1 paypal) |
| `Venmo` | [`VenmoResponse`](../../doc/models/venmo-response.md) | Optional | Full representation of a Venmo Payment Token. | VenmoResponse getVenmo() | setVenmo(VenmoResponse venmo) |

## Example (as JSON)

```json
{
  "card": {
    "name": "name6",
    "last_digits": "last_digits0",
    "brand": "CETELEM",
    "expiry": "expiry4",
    "billing_address": {
      "key1": "val1",
      "key2": "val2"
    }
  },
  "paypal": {
    "description": "description2",
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
    "permit_multiple_payment_tokens": false,
    "usage_type": "usage_type2",
    "customer_type": "customer_type6"
  },
  "venmo": {
    "description": "description6",
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
    "permit_multiple_payment_tokens": false,
    "usage_type": "usage_type6",
    "customer_type": "customer_type0"
  }
}
```

