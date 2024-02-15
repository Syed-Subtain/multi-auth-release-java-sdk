
# NOTELIGIBLEFORPNREFPROCESSINGERROR

## Structure

`NOTELIGIBLEFORPNREFPROCESSINGERROR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`NotEligibleForPnrefProcessing1IssueEnum`](../../doc/models/not-eligible-for-pnref-processing-1-issue-enum.md) | Optional | - | NotEligibleForPnrefProcessing1IssueEnum getIssue() | setIssue(NotEligibleForPnrefProcessing1IssueEnum issue) |
| `Description` | [`NotEligibleForPnrefProcessing1DescriptionEnum`](../../doc/models/not-eligible-for-pnref-processing-1-description-enum.md) | Optional | - | NotEligibleForPnrefProcessing1DescriptionEnum getDescription() | setDescription(NotEligibleForPnrefProcessing1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "NOT_ELIGIBLE_FOR_PNREF_PROCESSING",
  "description": "API caller is not enabled to process payments with the `pnref`. Please contact customer support to request permissions to process transactions with PNREF."
}
```

