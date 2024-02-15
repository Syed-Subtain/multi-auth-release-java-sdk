
# MERCHANTINITIATEDWITHSECURITYCODEERROR

## Structure

`MERCHANTINITIATEDWITHSECURITYCODEERROR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`MerchantInitiatedWithSecurityCode1IssueEnum`](../../doc/models/merchant-initiated-with-security-code-1-issue-enum.md) | Optional | - | MerchantInitiatedWithSecurityCode1IssueEnum getIssue() | setIssue(MerchantInitiatedWithSecurityCode1IssueEnum issue) |
| `Description` | [`MerchantInitiatedWithSecurityCode1DescriptionEnum`](../../doc/models/merchant-initiated-with-security-code-1-description-enum.md) | Optional | - | MerchantInitiatedWithSecurityCode1DescriptionEnum getDescription() | setDescription(MerchantInitiatedWithSecurityCode1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "MERCHANT_INITIATED_WITH_SECURITY_CODE",
  "description": "`stored_payment_source.payment_initiator` = `MERCHANT` is not supported if `payment_source.card.security_code` is present in the order. `security_code` can be present in the order only when customer is the payment initiator. It is semantically incorrect to perform a merchant initiated payment with `security_code` is the order."
}
```

