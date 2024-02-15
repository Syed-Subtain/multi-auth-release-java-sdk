
# INVALIDPREVTRANSREFERRORRESPONSE

## Structure

`INVALIDPREVTRANSREFERRORRESPONSE`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`InvalidPreviousTransactionReference2IssueEnum`](../../doc/models/invalid-previous-transaction-reference-2-issue-enum.md) | Optional | - | InvalidPreviousTransactionReference2IssueEnum getIssue() | setIssue(InvalidPreviousTransactionReference2IssueEnum issue) |
| `Description` | [`InvalidPreviousTxReferenceEnum`](../../doc/models/invalid-previous-tx-reference-enum.md) | Optional | - | InvalidPreviousTxReferenceEnum getDescription() | setDescription(InvalidPreviousTxReferenceEnum description) |

## Example (as JSON)

```json
{
  "issue": "INVALID_PREVIOUS_TRANSACTION_REFERENCE",
  "description": "The authorization or capture referenced by `previous_transaction_reference` is not valid. This could be either because the previous_transaction_reference is not found or doesn't belong to the payee. Please use a valid `previous_transaction_reference`."
}
```

