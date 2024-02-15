
# Invalid FX Rate ID1

## Structure

`InvalidFXRateID1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`InvalidFxRateId1IssueEnum`](../../doc/models/invalid-fx-rate-id-1-issue-enum.md) | Optional | - | InvalidFxRateId1IssueEnum getIssue() | setIssue(InvalidFxRateId1IssueEnum issue) |
| `Description` | [`InvalidFxRateId1DescriptionEnum`](../../doc/models/invalid-fx-rate-id-1-description-enum.md) | Optional | - | InvalidFxRateId1DescriptionEnum getDescription() | setDescription(InvalidFxRateId1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "INVALID_FX_RATE_ID",
  "description": "The specific FX Rate ID is not valid. This could be either because we are not able to look up the FX Rate based on this ID or it could be because the ID belongs to another API Caller."
}
```

