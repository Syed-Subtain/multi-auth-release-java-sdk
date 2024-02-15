
# INSTRUMENTDECLINEDERROR

## Structure

`INSTRUMENTDECLINEDERROR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`InstrumentDeclined1IssueEnum`](../../doc/models/instrument-declined-1-issue-enum.md) | Optional | - | InstrumentDeclined1IssueEnum getIssue() | setIssue(InstrumentDeclined1IssueEnum issue) |
| `Description` | [`InstrumentDeclined1DescriptionEnum`](../../doc/models/instrument-declined-1-description-enum.md) | Optional | - | InstrumentDeclined1DescriptionEnum getDescription() | setDescription(InstrumentDeclined1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "INSTRUMENT_DECLINED",
  "description": "The instrument presented  was either declined by the processor or bank, or it can't be used for this payment."
}
```

