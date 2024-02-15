
# INSTRUMENTDECLINED

## Structure

`INSTRUMENTDECLINED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`InstrumentDeclinedIssueEnum`](../../doc/models/instrument-declined-issue-enum.md) | Optional | - | InstrumentDeclinedIssueEnum getIssue() | setIssue(InstrumentDeclinedIssueEnum issue) |
| `Description` | [`InstrumentDeclinedDescriptionEnum`](../../doc/models/instrument-declined-description-enum.md) | Optional | - | InstrumentDeclinedDescriptionEnum getDescription() | setDescription(InstrumentDeclinedDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "INSTRUMENT_DECLINED",
  "description": "The instrument presented  was either declined by the processor or bank, or it can't be used for this payment."
}
```

