
# PNREFNOTFOUNDRESULT

## Structure

`PNREFNOTFOUNDRESULT`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PnrefNotFound2IssueEnum`](../../doc/models/pnref-not-found-2-issue-enum.md) | Optional | - | PnrefNotFound2IssueEnum getIssue() | setIssue(PnrefNotFound2IssueEnum issue) |
| `Description` | [`PnrefNotFound2DescriptionEnum`](../../doc/models/pnref-not-found-2-description-enum.md) | Optional | - | PnrefNotFound2DescriptionEnum getDescription() | setDescription(PnrefNotFound2DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "PNREF_NOT_FOUND",
  "description": "Specified `pnref` was not found. Verify the value and try the request again."
}
```

