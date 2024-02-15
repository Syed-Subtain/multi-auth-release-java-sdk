
# AUTHCAPTURECURRENCYMISMATCH

## Structure

`AUTHCAPTURECURRENCYMISMATCH`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`AuthCaptureCurrencyMismatchIssueEnum`](../../doc/models/auth-capture-currency-mismatch-issue-enum.md) | Optional | - | AuthCaptureCurrencyMismatchIssueEnum getIssue() | setIssue(AuthCaptureCurrencyMismatchIssueEnum issue) |
| `Description` | [`AuthCaptureCurrencyMismatchDescriptionEnum`](../../doc/models/auth-capture-currency-mismatch-description-enum.md) | Optional | - | AuthCaptureCurrencyMismatchDescriptionEnum getDescription() | setDescription(AuthCaptureCurrencyMismatchDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "AUTH_CAPTURE_CURRENCY_MISMATCH",
  "description": "Currency of capture must be the same as currency of authorization."
}
```

