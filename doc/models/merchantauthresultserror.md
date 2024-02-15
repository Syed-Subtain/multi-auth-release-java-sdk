
# MERCHANTAUTHRESULTSERROR

## Structure

`MERCHANTAUTHRESULTSERROR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`MerchantInitiatedAuthWithResultsEnum`](../../doc/models/merchant-initiated-auth-with-results-enum.md) | Optional | - | MerchantInitiatedAuthWithResultsEnum getIssue() | setIssue(MerchantInitiatedAuthWithResultsEnum issue) |
| `Description` | [`ErrMerchInitAuthResults3dsInvalidEnum`](../../doc/models/err-merch-init-auth-results-3-ds-invalid-enum.md) | Optional | - | ErrMerchInitAuthResults3dsInvalidEnum getDescription() | setDescription(ErrMerchInitAuthResults3dsInvalidEnum description) |

## Example (as JSON)

```json
{
  "issue": "MERCHANT_INITIATED_WITH_AUTHENTICATION_RESULTS",
  "description": "`stored_payment_source.payment_initiator` = `MERCHANT` is not supported if 3D-Secure authentication results are present in the order. 3D-Secure authentication results can be present in the order only when customer is the payment initiator. It is semantically incorrect to perform a merchant initiated payment with 3D-Secure authentication results is the order."
}
```

