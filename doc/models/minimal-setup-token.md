
# Minimal Setup Token

Minimal representation of a cached setup token.

## Structure

`MinimalSetupToken`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | The PayPal-generated ID for the vault token.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `36`, *Pattern*: `^[0-9a-zA-Z_-]+$` | String getId() | setId(String id) |
| `Ordinal` | `Integer` | Optional | The ordinal number of customers' payment source for sorting.<br>**Constraints**: `>= 1`, `<= 99` | Integer getOrdinal() | setOrdinal(Integer ordinal) |
| `Customer` | [`CustomerRequest`](../../doc/models/customer-request.md) | Optional | Customer in merchant's or partner's system of records. | CustomerRequest getCustomer() | setCustomer(CustomerRequest customer) |
| `Status` | `String` | Optional | The status of the payment token.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255`, *Pattern*: `^[0-9A-Z_]+$` | String getStatus() | setStatus(String status) |
| `PaymentSource` | [`SetupTokenResponsePaymentSource`](../../doc/models/setup-token-response-payment-source.md) | Optional | The setup payment method details. | SetupTokenResponsePaymentSource getPaymentSource() | setPaymentSource(SetupTokenResponsePaymentSource paymentSource) |
| `Links` | [`List<LinkDescription>`](../../doc/models/link-description.md) | Optional | An array of related [HATEOAS links](/api/rest/responses/#hateoas).<br>**Constraints**: *Minimum Items*: `1`, *Maximum Items*: `32` | List<LinkDescription> getLinks() | setLinks(List<LinkDescription> links) |

## Example (as JSON)

```json
{
  "id": "id6",
  "ordinal": 198,
  "customer": {
    "id": "id0"
  },
  "status": "status8",
  "payment_source": {
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
}
```

