
# CITYREQUIRED

## Structure

`CITYREQUIRED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`CityRequiredIssueEnum`](../../doc/models/city-required-issue-enum.md) | Optional | - | CityRequiredIssueEnum getIssue() | setIssue(CityRequiredIssueEnum issue) |
| `Description` | [`CityRequiredDescriptionEnum`](../../doc/models/city-required-description-enum.md) | Optional | - | CityRequiredDescriptionEnum getDescription() | setDescription(CityRequiredDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "CITY_REQUIRED",
  "description": "The specified country requires a city (address.admin_area_2)."
}
```

