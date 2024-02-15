
# INVALIDPREVIOUSTRANSACTIONREFERENCEERROR

## Structure

`INVALIDPREVIOUSTRANSACTIONREFERENCEERROR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`InvalidPreviousTransactionReference1IssueEnum`](../../doc/models/invalid-previous-transaction-reference-1-issue-enum.md) | Optional | - | InvalidPreviousTransactionReference1IssueEnum getIssue() | setIssue(InvalidPreviousTransactionReference1IssueEnum issue) |
| `Description` | [`InvalidPreviousTransactionReferenceError1Enum`](../../doc/models/invalid-previous-transaction-reference-error-1-enum.md) | Optional | - | InvalidPreviousTransactionReferenceError1Enum getDescription() | setDescription(InvalidPreviousTransactionReferenceError1Enum description) |

## Example (as JSON)

```json
{
  "issue": "INVALID_PREVIOUS_TRANSACTION_REFERENCE",
  "description": "The authorization or capture referenced by `previous_transaction_reference` is not valid. This could be either because the previous_transaction_reference is not found or doesn't belong to the payee. Please use a valid `previous_transaction_reference`."
}
```

