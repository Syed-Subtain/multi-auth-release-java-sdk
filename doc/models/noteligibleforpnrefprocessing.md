
# NOTELIGIBLEFORPNREFPROCESSING

## Structure

`NOTELIGIBLEFORPNREFPROCESSING`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`NotEligibleForPnrefProcessingIssueEnum`](../../doc/models/not-eligible-for-pnref-processing-issue-enum.md) | Optional | - | NotEligibleForPnrefProcessingIssueEnum getIssue() | setIssue(NotEligibleForPnrefProcessingIssueEnum issue) |
| `Description` | [`NotEligibleForPnrefProcessingDescriptionEnum`](../../doc/models/not-eligible-for-pnref-processing-description-enum.md) | Optional | - | NotEligibleForPnrefProcessingDescriptionEnum getDescription() | setDescription(NotEligibleForPnrefProcessingDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "NOT_ELIGIBLE_FOR_PNREF_PROCESSING",
  "description": "API caller is not enabled to process payments with the `pnref`. Please contact customer support to request permissions to process transactions with PNREF."
}
```

