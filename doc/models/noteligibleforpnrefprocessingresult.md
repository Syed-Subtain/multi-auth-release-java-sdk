
# NOTELIGIBLEFORPNREFPROCESSINGRESULT

## Structure

`NOTELIGIBLEFORPNREFPROCESSINGRESULT`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`NotEligibleForPnrefProcessing2IssueEnum`](../../doc/models/not-eligible-for-pnref-processing-2-issue-enum.md) | Optional | - | NotEligibleForPnrefProcessing2IssueEnum getIssue() | setIssue(NotEligibleForPnrefProcessing2IssueEnum issue) |
| `Description` | [`NotEligibleForPnrefProcessing2DescriptionEnum`](../../doc/models/not-eligible-for-pnref-processing-2-description-enum.md) | Optional | - | NotEligibleForPnrefProcessing2DescriptionEnum getDescription() | setDescription(NotEligibleForPnrefProcessing2DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "NOT_ELIGIBLE_FOR_PNREF_PROCESSING",
  "description": "API caller is not enabled to process payments with the `pnref`. Please contact customer support to request permissions to process transactions with PNREF."
}
```

