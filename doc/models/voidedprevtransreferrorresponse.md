
# VOIDEDPREVTRANSREFERRORRESPONSE

## Structure

`VOIDEDPREVTRANSREFERRORRESPONSE`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PreviousTransactionReferenceVoided2IssueEnum`](../../doc/models/previous-transaction-reference-voided-2-issue-enum.md) | Optional | - | PreviousTransactionReferenceVoided2IssueEnum getIssue() | setIssue(PreviousTransactionReferenceVoided2IssueEnum issue) |
| `Description` | [`PreviousTransactionReferenceVoided2DescriptionEnum`](../../doc/models/previous-transaction-reference-voided-2-description-enum.md) | Optional | - | PreviousTransactionReferenceVoided2DescriptionEnum getDescription() | setDescription(PreviousTransactionReferenceVoided2DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "PREVIOUS_TRANSACTION_REFERENCE_VOIDED",
  "description": "The status of authorization referenced by `previous_transaction_reference` is `VOIDED` and hence cannot be used for this order. Please use a `previous_transaction_reference` whose status is not `VOIDED`."
}
```

