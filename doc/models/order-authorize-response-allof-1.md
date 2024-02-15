
# Order Authorize Response Allof 1

## Structure

`OrderAuthorizeResponseAllof1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | The ID of the order. | String getId() | setId(String id) |
| `PaymentSource` | [`PaymentSource`](../../doc/models/payment-source.md) | Optional | The payment source used to fund the payment. | PaymentSource getPaymentSource() | setPaymentSource(PaymentSource paymentSource) |
| `Intent` | [`CheckoutPaymentIntentEnum`](../../doc/models/checkout-payment-intent-enum.md) | Optional | The intent to either capture payment immediately or authorize a payment for an order after order creation. | CheckoutPaymentIntentEnum getIntent() | setIntent(CheckoutPaymentIntentEnum intent) |
| `ProcessingInstruction` | [`ProcessingInstructionEnum`](../../doc/models/processing-instruction-enum.md) | Optional | The instruction to process an order.<br>**Default**: `ProcessingInstructionEnum.NO_INSTRUCTION`<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `36`, *Pattern*: `^[0-9A-Z_]+$` | ProcessingInstructionEnum getProcessingInstruction() | setProcessingInstruction(ProcessingInstructionEnum processingInstruction) |
| `Payer` | [`Customer`](../../doc/models/customer.md) | Optional | The customer who approves and pays for the order. The customer is also known as the payer. | Customer getPayer() | setPayer(Customer payer) |
| `PurchaseUnits` | [`List<PurchaseUnit>`](../../doc/models/purchase-unit.md) | Optional | An array of purchase units. Each purchase unit establishes a contract between a customer and merchant. Each purchase unit represents either a full or partial order that the customer intends to purchase from the merchant.<br>**Constraints**: *Minimum Items*: `1`, *Maximum Items*: `10` | List<PurchaseUnit> getPurchaseUnits() | setPurchaseUnits(List<PurchaseUnit> purchaseUnits) |
| `Status` | [`OrderStatusEnum`](../../doc/models/order-status-enum.md) | Optional | **Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255`, *Pattern*: `^[0-9A-Z_]+$` | OrderStatusEnum getStatus() | setStatus(OrderStatusEnum status) |
| `Links` | [`List<LinkDescription>`](../../doc/models/link-description.md) | Optional | An array of request-related HATEOAS links. To complete payer approval, use the `approve` link to redirect the payer. The API caller has 3 hours (default setting, this which can be changed by your account manager to 24/48/72 hours to accommodate your use case) from the time the order is created, to redirect your payer. Once redirected, the API caller has 3 hours for the payer to approve the order and either authorize or capture the order. If you are not using the PayPal JavaScript SDK to initiate PayPal Checkout (in context) ensure that you include `application_context.return_url` is specified or you will get "We're sorry, Things don't appear to be working at the moment" after the payer approves the payment. | List<LinkDescription> getLinks() | setLinks(List<LinkDescription> links) |

## Example (as JSON)

```json
{
  "processing_instruction": "NO_INSTRUCTION",
  "id": "id4",
  "payment_source": {
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
  },
  "intent": "CAPTURE",
  "payer": {
    "email_address": "email_address6",
    "payer_id": "payer_id6",
    "name": {
      "prefix": "prefix8",
      "given_name": "given_name2",
      "surname": "surname8",
      "middle_name": "middle_name0",
      "suffix": "suffix0"
    },
    "phone": {
      "phone_type": "FAX",
      "phone_number": {
        "country_code": "country_code2",
        "national_number": "national_number6",
        "extension_number": "extension_number8"
      }
    },
    "birth_date": "birth_date4"
  }
}
```

