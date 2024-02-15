
# TRANSACTIONBLOCKEDBYPAYEE

## Structure

`TRANSACTIONBLOCKEDBYPAYEE`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`TransactionBlockedByPayeeIssueEnum`](../../doc/models/transaction-blocked-by-payee-issue-enum.md) | Optional | - | TransactionBlockedByPayeeIssueEnum getIssue() | setIssue(TransactionBlockedByPayeeIssueEnum issue) |
| `Description` | [`TransactionBlockedByPayeeDescriptionEnum`](../../doc/models/transaction-blocked-by-payee-description-enum.md) | Optional | - | TransactionBlockedByPayeeDescriptionEnum getDescription() | setDescription(TransactionBlockedByPayeeDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "TRANSACTION_BLOCKED_BY_PAYEE",
  "description": "Transaction blocked by Payee’s Fraud Protection settings."
}
```

