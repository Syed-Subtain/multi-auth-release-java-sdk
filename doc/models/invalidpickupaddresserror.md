
# INVALIDPICKUPADDRESSERROR

## Structure

`INVALIDPICKUPADDRESSERROR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`InvalidPickupAddress1IssueEnum`](../../doc/models/invalid-pickup-address-1-issue-enum.md) | Optional | - | InvalidPickupAddress1IssueEnum getIssue() | setIssue(InvalidPickupAddress1IssueEnum issue) |
| `Description` | [`InvalidPickupAddress1DescriptionEnum`](../../doc/models/invalid-pickup-address-1-description-enum.md) | Optional | - | InvalidPickupAddress1DescriptionEnum getDescription() | setDescription(InvalidPickupAddress1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "INVALID_PICKUP_ADDRESS",
  "description": "If the 'shipping_option.type' is set as 'PICKUP' then the 'shipping_detail.name.full_name' should start with 'S2S' meaning Ship To Store. Example: 'S2S My Store'."
}
```

