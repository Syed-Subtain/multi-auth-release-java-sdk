
# DECLINEDDUETORELATEDTXN

## Structure

`DECLINEDDUETORELATEDTXN`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`DeclinedDueToRelatedTxnIssueEnum`](../../doc/models/declined-due-to-related-txn-issue-enum.md) | Optional | - | DeclinedDueToRelatedTxnIssueEnum getIssue() | setIssue(DeclinedDueToRelatedTxnIssueEnum issue) |
| `Description` | [`DeclinedDueToRelatedTxnDescriptionEnum`](../../doc/models/declined-due-to-related-txn-description-enum.md) | Optional | - | DeclinedDueToRelatedTxnDescriptionEnum getDescription() | setDescription(DeclinedDueToRelatedTxnDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "DECLINED_DUE_TO_RELATED_TXN",
  "description": "One or more transactions in this Order did not succeed. Since this Order is being processed as an All or None Order, if one or more transactions in this Order do not succeed, then all purchase units are marked declined and will not be processed."
}
```

