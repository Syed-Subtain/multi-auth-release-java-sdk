
# MULTICURRENCYORDER

## Structure

`MULTICURRENCYORDER`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`MultiCurrencyOrderIssueEnum`](../../doc/models/multi-currency-order-issue-enum.md) | Optional | - | MultiCurrencyOrderIssueEnum getIssue() | setIssue(MultiCurrencyOrderIssueEnum issue) |
| `Description` | [`MultiCurrencyOrderDescriptionEnum`](../../doc/models/multi-currency-order-description-enum.md) | Optional | - | MultiCurrencyOrderDescriptionEnum getDescription() | setDescription(MultiCurrencyOrderDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "MULTI_CURRENCY_ORDER",
  "description": "Multiple differing values of currency_code are not supported. Entire Order request must have the same currency_code."
}
```

