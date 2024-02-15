
# DOMESTICTRANSACTIONREQUIRED

## Structure

`DOMESTICTRANSACTIONREQUIRED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`DomesticTransactionRequiredIssueEnum`](../../doc/models/domestic-transaction-required-issue-enum.md) | Optional | - | DomesticTransactionRequiredIssueEnum getIssue() | setIssue(DomesticTransactionRequiredIssueEnum issue) |
| `Description` | [`DomesticTransactionRequiredDescriptionEnum`](../../doc/models/domestic-transaction-required-description-enum.md) | Optional | - | DomesticTransactionRequiredDescriptionEnum getDescription() | setDescription(DomesticTransactionRequiredDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "DOMESTIC_TRANSACTION_REQUIRED",
  "description": "This transaction requires the payee and payer to be resident in the same country, a domestic transaction is required to create this payment."
}
```

