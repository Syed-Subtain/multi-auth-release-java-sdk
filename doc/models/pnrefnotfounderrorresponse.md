
# PNREFNOTFOUNDERRORRESPONSE

## Structure

`PNREFNOTFOUNDERRORRESPONSE`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PnrefNotFound3IssueEnum`](../../doc/models/pnref-not-found-3-issue-enum.md) | Optional | - | PnrefNotFound3IssueEnum getIssue() | setIssue(PnrefNotFound3IssueEnum issue) |
| `Description` | [`PnrefNotFound3DescriptionEnum`](../../doc/models/pnref-not-found-3-description-enum.md) | Optional | - | PnrefNotFound3DescriptionEnum getDescription() | setDescription(PnrefNotFound3DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "PNREF_NOT_FOUND",
  "description": "Specified `pnref` was not found. Verify the value and try the request again."
}
```

