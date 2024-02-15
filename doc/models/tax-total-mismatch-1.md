
# Tax Total Mismatch 1

## Structure

`TaxTotalMismatch1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`TaxTotalMismatch1IssueEnum`](../../doc/models/tax-total-mismatch-1-issue-enum.md) | Optional | - | TaxTotalMismatch1IssueEnum getIssue() | setIssue(TaxTotalMismatch1IssueEnum issue) |
| `Description` | [`TaxTotalMismatch1DescriptionEnum`](../../doc/models/tax-total-mismatch-1-description-enum.md) | Optional | - | TaxTotalMismatch1DescriptionEnum getDescription() | setDescription(TaxTotalMismatch1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "TAX_TOTAL_MISMATCH",
  "description": "Should equal sum of (tax * quantity) across all items for a given purchase_unit."
}
```

