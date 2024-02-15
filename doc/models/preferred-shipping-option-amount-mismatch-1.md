
# Preferred Shipping Option Amount Mismatch 1

## Structure

`PreferredShippingOptionAmountMismatch1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PreferredShippingOptionAmountMismatch1IssueEnum`](../../doc/models/preferred-shipping-option-amount-mismatch-1-issue-enum.md) | Optional | - | PreferredShippingOptionAmountMismatch1IssueEnum getIssue() | setIssue(PreferredShippingOptionAmountMismatch1IssueEnum issue) |
| `Description` | [`ShippingOptionAmountMatchBreakdownEnum`](../../doc/models/shipping-option-amount-match-breakdown-enum.md) | Optional | - | ShippingOptionAmountMatchBreakdownEnum getDescription() | setDescription(ShippingOptionAmountMatchBreakdownEnum description) |

## Example (as JSON)

```json
{
  "issue": "PREFERRED_SHIPPING_OPTION_AMOUNT_MISMATCH",
  "description": "The amount provided in the preferred shipping option should match the amount provided in amount breakdown"
}
```

