
# PERMISSIONDENIEDFORDONATIONITEMS

## Structure

`PERMISSIONDENIEDFORDONATIONITEMS`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PermissionDeniedForDonationItemsIssueEnum`](../../doc/models/permission-denied-for-donation-items-issue-enum.md) | Optional | - | PermissionDeniedForDonationItemsIssueEnum getIssue() | setIssue(PermissionDeniedForDonationItemsIssueEnum issue) |
| `Description` | [`PermissionDeniedForDonationItemsDescriptionEnum`](../../doc/models/permission-denied-for-donation-items-description-enum.md) | Optional | - | PermissionDeniedForDonationItemsDescriptionEnum getDescription() | setDescription(PermissionDeniedForDonationItemsDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "PERMISSION_DENIED_FOR_DONATION_ITEMS",
  "description": "The API Caller or Payee have not been granted appropriate permissions to send 'items.category' as 'DONATION'. Please speak to your account manager if you want to process these type of items."
}
```

