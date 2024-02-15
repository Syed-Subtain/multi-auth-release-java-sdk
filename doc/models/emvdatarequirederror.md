
# EMVDATAREQUIREDERROR

## Structure

`EMVDATAREQUIREDERROR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`EmvDataRequired1IssueEnum`](../../doc/models/emv-data-required-1-issue-enum.md) | Optional | - | EmvDataRequired1IssueEnum getIssue() | setIssue(EmvDataRequired1IssueEnum issue) |
| `Description` | [`EmvDataRequired1DescriptionEnum`](../../doc/models/emv-data-required-1-description-enum.md) | Optional | - | EmvDataRequired1DescriptionEnum getDescription() | setDescription(EmvDataRequired1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "EMV_DATA_REQUIRED",
  "description": "EMV Data is required if authentication method is EMV."
}
```

