
# EMVDATAREQUIRED

## Structure

`EMVDATAREQUIRED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`EmvDataRequiredIssueEnum`](../../doc/models/emv-data-required-issue-enum.md) | Optional | - | EmvDataRequiredIssueEnum getIssue() | setIssue(EmvDataRequiredIssueEnum issue) |
| `Description` | [`EmvDataRequiredDescriptionEnum`](../../doc/models/emv-data-required-description-enum.md) | Optional | - | EmvDataRequiredDescriptionEnum getDescription() | setDescription(EmvDataRequiredDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "EMV_DATA_REQUIRED",
  "description": "EMV Data is required if authentication method is EMV."
}
```

