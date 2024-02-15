
# Non Portable Additional Address Details

The non-portable additional address details that are sometimes needed for compliance, risk, or other scenarios where fine-grain address information might be needed. Not portable with common third party and open source. Redundant with core fields.<br/>For example, `address_portable.address_line_1` is usually a combination of `address_details.street_number`, `street_name`, and `street_type`.

## Structure

`NonPortableAdditionalAddressDetails`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `StreetNumber` | `String` | Optional | The street number.<br>**Constraints**: *Maximum Length*: `100` | String getStreetNumber() | setStreetNumber(String streetNumber) |
| `StreetName` | `String` | Optional | The street name. Just `Drury` in `Drury Lane`.<br>**Constraints**: *Maximum Length*: `100` | String getStreetName() | setStreetName(String streetName) |
| `StreetType` | `String` | Optional | The street type. For example, avenue, boulevard, road, or expressway.<br>**Constraints**: *Maximum Length*: `100` | String getStreetType() | setStreetType(String streetType) |
| `DeliveryService` | `String` | Optional | The delivery service. Post office box, bag number, or post office name.<br>**Constraints**: *Maximum Length*: `100` | String getDeliveryService() | setDeliveryService(String deliveryService) |
| `BuildingName` | `String` | Optional | A named locations that represents the premise. Usually a building name or number or collection of buildings with a common name or number. For example, <code>Craven House</code>.<br>**Constraints**: *Maximum Length*: `100` | String getBuildingName() | setBuildingName(String buildingName) |
| `SubBuilding` | `String` | Optional | The first-order entity below a named building or location that represents the sub-premises. Usually a single building within a collection of buildings with a common name. Can be a flat, story, floor, room, or apartment.<br>**Constraints**: *Maximum Length*: `100` | String getSubBuilding() | setSubBuilding(String subBuilding) |

## Example (as JSON)

```json
{
  "street_number": "street_number0",
  "street_name": "street_name6",
  "street_type": "street_type8",
  "delivery_service": "delivery_service2",
  "building_name": "building_name4"
}
```

