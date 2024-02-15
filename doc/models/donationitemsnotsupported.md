
# DONATIONITEMSNOTSUPPORTED

## Structure

`DONATIONITEMSNOTSUPPORTED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`DonationItemsNotSupportedIssueEnum`](../../doc/models/donation-items-not-supported-issue-enum.md) | Optional | - | DonationItemsNotSupportedIssueEnum getIssue() | setIssue(DonationItemsNotSupportedIssueEnum issue) |
| `Description` | [`DonationItemsNotSupportedDescriptionEnum`](../../doc/models/donation-items-not-supported-description-enum.md) | Optional | - | DonationItemsNotSupportedDescriptionEnum getDescription() | setDescription(DonationItemsNotSupportedDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "DONATION_ITEMS_NOT_SUPPORTED",
  "description": "If 'purchase_unit' has \"DONATION\" as the 'items.category' then the Order can at most have one purchase_unit. Multiple purchase_units are not supported if either of them have at least one items with category as \"DONATION\"."
}
```

