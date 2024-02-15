
# Order Tracker Request

The tracking details of an order.

## Structure

`OrderTrackerRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TransactionId` | `String` | Required | The PayPal transaction ID.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `50`, *Pattern*: `^[a-zA-Z0-9]*$` | String getTransactionId() | setTransactionId(String transactionId) |
| `TrackingNumber` | `String` | Optional | The tracking number for the shipment. This property supports Unicode.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `64` | String getTrackingNumber() | setTrackingNumber(String trackingNumber) |
| `TrackingNumberType` | [`ShipmentTrackingNumberTypeEnum`](../../doc/models/shipment-tracking-number-type-enum.md) | Optional | The type of tracking number.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `64`, *Pattern*: `^[0-9A-Z_]+$` | ShipmentTrackingNumberTypeEnum getTrackingNumberType() | setTrackingNumberType(ShipmentTrackingNumberTypeEnum trackingNumberType) |
| `Status` | [`ShipmentTrackingStatusEnum`](../../doc/models/shipment-tracking-status-enum.md) | Required | The status of the item shipment. For allowed values, see <a href="/docs/tracking/reference/shipping-status/">Shipping Statuses</a>.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `64`, *Pattern*: `^[0-9A-Z_]+$` | ShipmentTrackingStatusEnum getStatus() | setStatus(ShipmentTrackingStatusEnum status) |
| `ShipmentDate` | `String` | Optional | The date when the shipment occurred, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).<br>**Constraints**: *Minimum Length*: `10`, *Maximum Length*: `10`, *Pattern*: `^[0-9]{4}-(0[1-9]\|1[0-2])-(0[1-9]\|[1-2][0-9]\|3[0-1])$` | String getShipmentDate() | setShipmentDate(String shipmentDate) |
| `Carrier` | [`CarrierEnum`](../../doc/models/carrier-enum.md) | Optional | The carrier for the shipment. Some carriers have a global version as well as local subsidiaries. The subsidiaries are repeated over many countries and might also have an entry in the global list. Choose the carrier for your country. If the carrier is not available for your country, choose the global version of the carrier. If your carrier name is not in the list, set `carrier` to `OTHER` and set carrier name in `carrier_name_other`. For allowed values, see <a href="/docs/tracking/reference/carriers/">Carriers</a>.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `64`, *Pattern*: `^[0-9A-Z_]+$` | CarrierEnum getCarrier() | setCarrier(CarrierEnum carrier) |
| `CarrierNameOther` | `String` | Optional | The name of the carrier for the shipment. Provide this value only if the carrier parameter is OTHER. This property supports Unicode.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `64` | String getCarrierNameOther() | setCarrierNameOther(String carrierNameOther) |
| `PostagePaymentId` | `String` | Optional | The postage payment ID. This property supports Unicode.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `64` | String getPostagePaymentId() | setPostagePaymentId(String postagePaymentId) |
| `NotifyBuyer` | `Boolean` | Optional | If true, sends an email notification to the buyer of the PayPal transaction. The email contains the tracking information that was uploaded through the API.<br>**Default**: `false` | Boolean getNotifyBuyer() | setNotifyBuyer(Boolean notifyBuyer) |
| `Quantity` | `Integer` | Optional | The quantity of items shipped.<br>**Constraints**: `>= 1`, `<= 100` | Integer getQuantity() | setQuantity(Integer quantity) |
| `TrackingNumberValidated` | `Boolean` | Optional | Indicates whether the carrier validated the tracking number. | Boolean getTrackingNumberValidated() | setTrackingNumberValidated(Boolean trackingNumberValidated) |
| `LastUpdatedTime` | `String` | Optional | The date and time when the tracking information was last updated, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).<br>**Constraints**: *Minimum Length*: `20`, *Maximum Length*: `64`, *Pattern*: `^[0-9]{4}-(0[1-9]\|1[0-2])-(0[1-9]\|[1-2][0-9]\|3[0-1])[T,t]([0-1][0-9]\|2[0-3]):[0-5][0-9]:([0-5][0-9]\|60)([.][0-9]+)?([Zz]\|[+-][0-9]{2}:[0-9]{2})$` | String getLastUpdatedTime() | setLastUpdatedTime(String lastUpdatedTime) |
| `ShipmentDirection` | [`ShipmentTrackerShipmentDirectionEnum`](../../doc/models/shipment-tracker-shipment-direction-enum.md) | Optional | To denote whether the shipment is sent forward to the receiver or returned back.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `50`, *Pattern*: `^[0-9A-Z_]+$` | ShipmentTrackerShipmentDirectionEnum getShipmentDirection() | setShipmentDirection(ShipmentTrackerShipmentDirectionEnum shipmentDirection) |
| `ShipmentUploader` | [`ShipmentTrackerShipmentUploaderEnum`](../../doc/models/shipment-tracker-shipment-uploader-enum.md) | Optional | To denote which party uploaded the shipment tracking info.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `50`, *Pattern*: `^[0-9A-Z_]+$` | ShipmentTrackerShipmentUploaderEnum getShipmentUploader() | setShipmentUploader(ShipmentTrackerShipmentUploaderEnum shipmentUploader) |
| `CaptureId` | `String` | Required | The PayPal capture ID.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `50`, *Pattern*: `^[a-zA-Z0-9]*$` | String getCaptureId() | setCaptureId(String captureId) |
| `NotifyPayer` | `Boolean` | Optional | If true, sends an email notification to the payer of the PayPal transaction. The email contains the tracking information that was uploaded through the API.<br>**Default**: `false` | Boolean getNotifyPayer() | setNotifyPayer(Boolean notifyPayer) |
| `Items` | [`List<TrackerItem>`](../../doc/models/tracker-item.md) | Optional | An array of details of items in the shipment. | List<TrackerItem> getItems() | setItems(List<TrackerItem> items) |

## Example (as JSON)

```json
{
  "transaction_id": "transaction_id4",
  "status": "NEW",
  "notify_buyer": false,
  "capture_id": "capture_id8",
  "notify_payer": false,
  "tracking_number": "tracking_number4",
  "tracking_number_type": "CARRIER_PROVIDED",
  "shipment_date": "shipment_date4",
  "carrier": "GIO_ECOURIER",
  "carrier_name_other": "carrier_name_other8"
}
```

