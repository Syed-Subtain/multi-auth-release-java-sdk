
# MISSINGPICKUPADDRESS

## Structure

`MISSINGPICKUPADDRESS`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`MissingPickupAddressIssueEnum`](../../doc/models/missing-pickup-address-issue-enum.md) | Optional | - | MissingPickupAddressIssueEnum getIssue() | setIssue(MissingPickupAddressIssueEnum issue) |
| `Description` | [`MissingPickupAddressDescriptionEnum`](../../doc/models/missing-pickup-address-description-enum.md) | Optional | - | MissingPickupAddressDescriptionEnum getDescription() | setDescription(MissingPickupAddressDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "MISSING_PICKUP_ADDRESS",
  "description": "A pickup address(`shipping.address`) is required for the provided `shipping.type`."
}
```

