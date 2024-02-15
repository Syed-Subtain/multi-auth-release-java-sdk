
# INVALIDGOOGLEPAYTOKENERROR

## Structure

`INVALIDGOOGLEPAYTOKENERROR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`InvalidGooglePayToken1IssueEnum`](../../doc/models/invalid-google-pay-token-1-issue-enum.md) | Optional | - | InvalidGooglePayToken1IssueEnum getIssue() | setIssue(InvalidGooglePayToken1IssueEnum issue) |
| `Description` | [`InvalidGooglePayToken1DescriptionEnum`](../../doc/models/invalid-google-pay-token-1-description-enum.md) | Optional | - | InvalidGooglePayToken1DescriptionEnum getDescription() | setDescription(InvalidGooglePayToken1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "INVALID_GOOGLE_PAY_TOKEN",
  "description": "The google pay token is invalid. PayPal was not able to decrypt the googlepay token or PayPal was not able to find the necessary data in the token after decryption."
}
```

