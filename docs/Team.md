
# Team

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Id of team |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Type of group |  [optional]
**displayName** | **String** | Name of team |  [optional]
**description** | **String** | Short description |  [optional]
**members** | **List&lt;String&gt;** | Array of group participants |  [optional]
**email** | **String** | Email of team |  [optional]
**isPublic** | **Boolean** | Shows if team is public or not |  [optional]
**creationTime** | **String** | Time of creation (ISO format) |  [optional]
**lastModifiedTime** | **String** | Time of last modification (ISO format) |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
GROUP | &quot;Group&quot;
TEAM | &quot;Team&quot;



