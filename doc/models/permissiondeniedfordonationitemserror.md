
# PERMISSIONDENIEDFORDONATIONITEMSERROR

## Structure

`PERMISSIONDENIEDFORDONATIONITEMSERROR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PermissionDeniedForDonationItems1IssueEnum`](../../doc/models/permission-denied-for-donation-items-1-issue-enum.md) | Optional | - | PermissionDeniedForDonationItems1IssueEnum getIssue() | setIssue(PermissionDeniedForDonationItems1IssueEnum issue) |
| `Description` | [`PermissionDeniedForDonationItems1DescriptionEnum`](../../doc/models/permission-denied-for-donation-items-1-description-enum.md) | Optional | - | PermissionDeniedForDonationItems1DescriptionEnum getDescription() | setDescription(PermissionDeniedForDonationItems1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "PERMISSION_DENIED_FOR_DONATION_ITEMS",
  "description": "The API Caller or Payee have not been granted appropriate permissions to send 'items.category' as 'DONATION'. Please speak to your account manager if you want to process these type of items."
}
```

