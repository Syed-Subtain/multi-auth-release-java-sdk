
# DUPLICATEINVOICEID1

## Structure

`DUPLICATEINVOICEID1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`DuplicateInvoiceIdIssueEnum`](../../doc/models/duplicate-invoice-id-issue-enum.md) | Optional | - | DuplicateInvoiceIdIssueEnum getIssue() | setIssue(DuplicateInvoiceIdIssueEnum issue) |
| `Description` | [`DuplicateInvoiceIdDescription1Enum`](../../doc/models/duplicate-invoice-id-description-1-enum.md) | Optional | - | DuplicateInvoiceIdDescription1Enum getDescription() | setDescription(DuplicateInvoiceIdDescription1Enum description) |

## Example (as JSON)

```json
{
  "issue": "DUPLICATE_INVOICE_ID",
  "description": "Requested invoice_id has been previously captured. Possible duplicate transaction."
}
```

