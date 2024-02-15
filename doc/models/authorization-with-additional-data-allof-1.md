
# Authorization With Additional Data Allof 1

## Structure

`AuthorizationWithAdditionalDataAllof1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ProcessorResponse` | [`ProcessorResponse`](../../doc/models/processor-response.md) | Optional | The processor response for card transactions. | ProcessorResponse getProcessorResponse() | setProcessorResponse(ProcessorResponse processorResponse) |

## Example (as JSON)

```json
{
  "processor_response": {
    "avs_code": "3",
    "cvv_code": "3",
    "response_code": "PCNR",
    "payment_advice_code": "03"
  }
}
```

