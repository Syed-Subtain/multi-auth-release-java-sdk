
# AMOUNTMISMATCH

## Structure

`AMOUNTMISMATCH`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`AmountMismatchIssueEnum`](../../doc/models/amount-mismatch-issue-enum.md) | Optional | - | AmountMismatchIssueEnum getIssue() | setIssue(AmountMismatchIssueEnum issue) |
| `Description` | [`AmountMismatchDescriptionEnum`](../../doc/models/amount-mismatch-description-enum.md) | Optional | - | AmountMismatchDescriptionEnum getDescription() | setDescription(AmountMismatchDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "AMOUNT_MISMATCH",
  "description": "Should equal item_total + tax_total + shipping + handling + insurance - shipping_discount - discount."
}
```

