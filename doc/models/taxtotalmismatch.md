
# TAXTOTALMISMATCH

## Structure

`TAXTOTALMISMATCH`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`TaxTotalMismatchIssueEnum`](../../doc/models/tax-total-mismatch-issue-enum.md) | Optional | - | TaxTotalMismatchIssueEnum getIssue() | setIssue(TaxTotalMismatchIssueEnum issue) |
| `Description` | [`TaxTotalMismatchDescriptionEnum`](../../doc/models/tax-total-mismatch-description-enum.md) | Optional | - | TaxTotalMismatchDescriptionEnum getDescription() | setDescription(TaxTotalMismatchDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "TAX_TOTAL_MISMATCH",
  "description": "Should equal sum of (tax * quantity) across all items for a given purchase_unit."
}
```

