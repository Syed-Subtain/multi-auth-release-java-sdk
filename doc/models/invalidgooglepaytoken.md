
# INVALIDGOOGLEPAYTOKEN

## Structure

`INVALIDGOOGLEPAYTOKEN`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`InvalidGooglePayTokenIssueEnum`](../../doc/models/invalid-google-pay-token-issue-enum.md) | Optional | - | InvalidGooglePayTokenIssueEnum getIssue() | setIssue(InvalidGooglePayTokenIssueEnum issue) |
| `Description` | [`InvalidGooglePayTokenDescriptionEnum`](../../doc/models/invalid-google-pay-token-description-enum.md) | Optional | - | InvalidGooglePayTokenDescriptionEnum getDescription() | setDescription(InvalidGooglePayTokenDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "INVALID_GOOGLE_PAY_TOKEN",
  "description": "The google pay token is invalid. PayPal was not able to decrypt the googlepay token or PayPal was not able to find the necessary data in the token after decryption."
}
```

