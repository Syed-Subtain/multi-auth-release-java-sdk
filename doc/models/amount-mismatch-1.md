
# Amount Mismatch 1

## Structure

`AmountMismatch1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`AmountMismatch1IssueEnum`](../../doc/models/amount-mismatch-1-issue-enum.md) | Optional | - | AmountMismatch1IssueEnum getIssue() | setIssue(AmountMismatch1IssueEnum issue) |
| `Description` | [`AmountMismatch1DescriptionEnum`](../../doc/models/amount-mismatch-1-description-enum.md) | Optional | - | AmountMismatch1DescriptionEnum getDescription() | setDescription(AmountMismatch1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "AMOUNT_MISMATCH",
  "description": "Should equal item_total + tax_total + shipping + handling + insurance - shipping_discount - discount."
}
```

