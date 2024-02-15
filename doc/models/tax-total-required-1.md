
# Tax Total Required 1

## Structure

`TaxTotalRequired1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`TaxTotalRequired1IssueEnum`](../../doc/models/tax-total-required-1-issue-enum.md) | Optional | - | TaxTotalRequired1IssueEnum getIssue() | setIssue(TaxTotalRequired1IssueEnum issue) |
| `Description` | [`TaxTotalRequired1DescriptionEnum`](../../doc/models/tax-total-required-1-description-enum.md) | Optional | - | TaxTotalRequired1DescriptionEnum getDescription() | setDescription(TaxTotalRequired1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "TAX_TOTAL_REQUIRED",
  "description": "If item details are specified (items.tax_total and items.quantity) corresponding amount.breakdown.tax_total is required."
}
```

