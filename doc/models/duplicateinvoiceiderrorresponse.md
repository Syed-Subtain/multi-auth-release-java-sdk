
# DUPLICATEINVOICEIDERRORRESPONSE

## Structure

`DUPLICATEINVOICEIDERRORRESPONSE`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`DuplicateInvoiceId2IssueEnum`](../../doc/models/duplicate-invoice-id-2-issue-enum.md) | Optional | - | DuplicateInvoiceId2IssueEnum getIssue() | setIssue(DuplicateInvoiceId2IssueEnum issue) |
| `Description` | [`DuplicateInvoiceId2DescriptionEnum`](../../doc/models/duplicate-invoice-id-2-description-enum.md) | Optional | - | DuplicateInvoiceId2DescriptionEnum getDescription() | setDescription(DuplicateInvoiceId2DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "DUPLICATE_INVOICE_ID",
  "description": "Duplicate Invoice ID detected. To avoid a potential duplicate transaction your account setting requires that Invoice Id be unique for each transaction."
}
```

