
# TAXTOTALREQUIRED

## Structure

`TAXTOTALREQUIRED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`TaxTotalRequiredIssueEnum`](../../doc/models/tax-total-required-issue-enum.md) | Optional | - | TaxTotalRequiredIssueEnum getIssue() | setIssue(TaxTotalRequiredIssueEnum issue) |
| `Description` | [`TaxTotalRequiredDescriptionEnum`](../../doc/models/tax-total-required-description-enum.md) | Optional | - | TaxTotalRequiredDescriptionEnum getDescription() | setDescription(TaxTotalRequiredDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "TAX_TOTAL_REQUIRED",
  "description": "If item details are specified (items.tax_total and items.quantity) corresponding amount.breakdown.tax_total is required."
}
```

