
# MISSINGPREVIOUSREFERENCEERRORRESPONSE

## Structure

`MISSINGPREVIOUSREFERENCEERRORRESPONSE`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`MissingPreviousReference3IssueEnum`](../../doc/models/missing-previous-reference-3-issue-enum.md) | Optional | - | MissingPreviousReference3IssueEnum getIssue() | setIssue(MissingPreviousReference3IssueEnum issue) |
| `Description` | [`MissingPreviousReference3DescriptionEnum`](../../doc/models/missing-previous-reference-3-description-enum.md) | Optional | - | MissingPreviousReference3DescriptionEnum getDescription() | setDescription(MissingPreviousReference3DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "MISSING_PREVIOUS_REFERENCE",
  "description": "For Merchant initiated network token transactions, either the payment_source.card.stored_credential.previous_network_transaction_reference or payment_source.card.stored_credential.previous_transaction_reference must be included in the request."
}
```

