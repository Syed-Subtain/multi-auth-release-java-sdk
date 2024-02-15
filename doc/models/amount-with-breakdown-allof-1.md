
# Amount With Breakdown Allof 1

## Structure

`AmountWithBreakdownAllof1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Breakdown` | [`AmountBreakdown`](../../doc/models/amount-breakdown.md) | Optional | The breakdown of the amount. Breakdown provides details such as total item amount, total tax amount, shipping, handling, insurance, and discounts, if any. | AmountBreakdown getBreakdown() | setBreakdown(AmountBreakdown breakdown) |

## Example (as JSON)

```json
{
  "breakdown": {
    "item_total": {
      "currency_code": "currency_code0",
      "value": "value6"
    },
    "shipping": {
      "currency_code": "currency_code0",
      "value": "value6"
    },
    "handling": {
      "currency_code": "currency_code2",
      "value": "value8"
    },
    "tax_total": {
      "currency_code": "currency_code4",
      "value": "value0"
    },
    "insurance": {
      "currency_code": "currency_code2",
      "value": "value8"
    }
  }
}
```

