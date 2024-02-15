
# MISSINGPREVIOUSREFERENCEERROR

## Structure

`MISSINGPREVIOUSREFERENCEERROR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`MissingPreviousReference1IssueEnum`](../../doc/models/missing-previous-reference-1-issue-enum.md) | Optional | - | MissingPreviousReference1IssueEnum getIssue() | setIssue(MissingPreviousReference1IssueEnum issue) |
| `Description` | [`MissingPreviousReference1DescriptionEnum`](../../doc/models/missing-previous-reference-1-description-enum.md) | Optional | - | MissingPreviousReference1DescriptionEnum getDescription() | setDescription(MissingPreviousReference1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "MISSING_PREVIOUS_REFERENCE",
  "description": "For Merchant initiated network token transactions, either the payment_source.card.stored_credential.previous_network_transaction_reference or payment_source.card.stored_credential.previous_transaction_reference must be included in the request."
}
```

