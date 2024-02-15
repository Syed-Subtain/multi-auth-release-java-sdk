
# DOMESTICTRANSACTIONREQUIREDERROR

## Structure

`DOMESTICTRANSACTIONREQUIREDERROR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`DomesticTransactionRequired1IssueEnum`](../../doc/models/domestic-transaction-required-1-issue-enum.md) | Optional | - | DomesticTransactionRequired1IssueEnum getIssue() | setIssue(DomesticTransactionRequired1IssueEnum issue) |
| `Description` | [`DomesticTransactionRequired1DescriptionEnum`](../../doc/models/domestic-transaction-required-1-description-enum.md) | Optional | - | DomesticTransactionRequired1DescriptionEnum getDescription() | setDescription(DomesticTransactionRequired1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "DOMESTIC_TRANSACTION_REQUIRED",
  "description": "This transaction requires the payee and payer to be resident in the same country, a domestic transaction is required to create this payment."
}
```

