
# Multi Currency Order 1

## Structure

`MultiCurrencyOrder1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`MultiCurrencyOrder1IssueEnum`](../../doc/models/multi-currency-order-1-issue-enum.md) | Optional | - | MultiCurrencyOrder1IssueEnum getIssue() | setIssue(MultiCurrencyOrder1IssueEnum issue) |
| `Description` | [`MultiCurrencyOrder1DescriptionEnum`](../../doc/models/multi-currency-order-1-description-enum.md) | Optional | - | MultiCurrencyOrder1DescriptionEnum getDescription() | setDescription(MultiCurrencyOrder1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "MULTI_CURRENCY_ORDER",
  "description": "Multiple differing values of currency_code are not supported. Entire Order request must have the same currency_code."
}
```

