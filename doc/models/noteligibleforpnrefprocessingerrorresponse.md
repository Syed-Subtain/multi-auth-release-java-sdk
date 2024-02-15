
# NOTELIGIBLEFORPNREFPROCESSINGERRORRESPONSE

## Structure

`NOTELIGIBLEFORPNREFPROCESSINGERRORRESPONSE`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`NotEligibleForPnrefProcessing3IssueEnum`](../../doc/models/not-eligible-for-pnref-processing-3-issue-enum.md) | Optional | - | NotEligibleForPnrefProcessing3IssueEnum getIssue() | setIssue(NotEligibleForPnrefProcessing3IssueEnum issue) |
| `Description` | [`NotEligibleForPnrefProcessing3DescriptionEnum`](../../doc/models/not-eligible-for-pnref-processing-3-description-enum.md) | Optional | - | NotEligibleForPnrefProcessing3DescriptionEnum getDescription() | setDescription(NotEligibleForPnrefProcessing3DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "NOT_ELIGIBLE_FOR_PNREF_PROCESSING",
  "description": "API caller is not enabled to process payments with the `pnref`. Please contact customer support to request permissions to process transactions with PNREF."
}
```

