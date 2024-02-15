
# DUPLICATEINVOICEID

## Structure

`DUPLICATEINVOICEID`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`DuplicateInvoiceIdIssueEnum`](../../doc/models/duplicate-invoice-id-issue-enum.md) | Optional | - | DuplicateInvoiceIdIssueEnum getIssue() | setIssue(DuplicateInvoiceIdIssueEnum issue) |
| `Description` | [`DuplicateInvoiceIdDescriptionEnum`](../../doc/models/duplicate-invoice-id-description-enum.md) | Optional | - | DuplicateInvoiceIdDescriptionEnum getDescription() | setDescription(DuplicateInvoiceIdDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "DUPLICATE_INVOICE_ID",
  "description": "Duplicate Invoice ID detected. To avoid a potential duplicate transaction your account setting requires that Invoice Id be unique for each transaction."
}
```

