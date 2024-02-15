
# PNREFNOTFOUND

## Structure

`PNREFNOTFOUND`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PnrefNotFoundIssueEnum`](../../doc/models/pnref-not-found-issue-enum.md) | Optional | - | PnrefNotFoundIssueEnum getIssue() | setIssue(PnrefNotFoundIssueEnum issue) |
| `Description` | [`PnrefNotFoundDescriptionEnum`](../../doc/models/pnref-not-found-description-enum.md) | Optional | - | PnrefNotFoundDescriptionEnum getDescription() | setDescription(PnrefNotFoundDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "PNREF_NOT_FOUND",
  "description": "Specified `pnref` was not found. Verify the value and try the request again."
}
```

