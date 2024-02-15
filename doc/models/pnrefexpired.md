
# PNREFEXPIRED

## Structure

`PNREFEXPIRED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PnrefExpiredIssueEnum`](../../doc/models/pnref-expired-issue-enum.md) | Optional | - | PnrefExpiredIssueEnum getIssue() | setIssue(PnrefExpiredIssueEnum issue) |
| `Description` | [`PnrefExpiredDescriptionEnum`](../../doc/models/pnref-expired-description-enum.md) | Optional | - | PnrefExpiredDescriptionEnum getDescription() | setDescription(PnrefExpiredDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "PNREF_EXPIRED",
  "description": "Specified `pnref` has expired. PNREF expires 15 months after the date of the initial transaction."
}
```

