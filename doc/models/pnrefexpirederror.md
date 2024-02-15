
# PNREFEXPIREDERROR

## Structure

`PNREFEXPIREDERROR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PnrefExpired1IssueEnum`](../../doc/models/pnref-expired-1-issue-enum.md) | Optional | - | PnrefExpired1IssueEnum getIssue() | setIssue(PnrefExpired1IssueEnum issue) |
| `Description` | [`PnrefExpired1DescriptionEnum`](../../doc/models/pnref-expired-1-description-enum.md) | Optional | - | PnrefExpired1DescriptionEnum getDescription() | setDescription(PnrefExpired1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "PNREF_EXPIRED",
  "description": "Specified `pnref` has expired. PNREF expires 15 months after the date of the initial transaction."
}
```

