
# DOMESTICTRANSACTIONREQUIREDERRORRESPONSE

## Structure

`DOMESTICTRANSACTIONREQUIREDERRORRESPONSE`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`DomesticTransactionRequired2IssueEnum`](../../doc/models/domestic-transaction-required-2-issue-enum.md) | Optional | - | DomesticTransactionRequired2IssueEnum getIssue() | setIssue(DomesticTransactionRequired2IssueEnum issue) |
| `Description` | [`DomesticTransactionRequired2DescriptionEnum`](../../doc/models/domestic-transaction-required-2-description-enum.md) | Optional | - | DomesticTransactionRequired2DescriptionEnum getDescription() | setDescription(DomesticTransactionRequired2DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "DOMESTIC_TRANSACTION_REQUIRED",
  "description": "This transaction requires the payee and payer to be resident in the same country, a domestic transaction is required to create this payment."
}
```

