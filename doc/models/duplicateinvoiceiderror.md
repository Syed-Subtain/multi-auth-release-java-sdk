
# DUPLICATEINVOICEIDERROR

## Structure

`DUPLICATEINVOICEIDERROR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`DuplicateInvoiceId1IssueEnum`](../../doc/models/duplicate-invoice-id-1-issue-enum.md) | Optional | - | DuplicateInvoiceId1IssueEnum getIssue() | setIssue(DuplicateInvoiceId1IssueEnum issue) |
| `Description` | [`DuplicateInvoiceId1DescriptionEnum`](../../doc/models/duplicate-invoice-id-1-description-enum.md) | Optional | - | DuplicateInvoiceId1DescriptionEnum getDescription() | setDescription(DuplicateInvoiceId1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "DUPLICATE_INVOICE_ID",
  "description": "Duplicate Invoice ID detected. To avoid a potential duplicate transaction your account setting requires that Invoice Id be unique for each transaction."
}
```

