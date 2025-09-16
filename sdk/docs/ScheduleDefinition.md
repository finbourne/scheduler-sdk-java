

# ScheduleDefinition

Schedule

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**scheduleIdentifier** | [**ResourceId**](ResourceId.md) |  |  |
|**jobId** | [**ResourceId**](ResourceId.md) |  |  [optional] |
|**name** | **String** | A display name for this Schedule |  [optional] |
|**description** | **String** | A description of the Schedule |  [optional] |
|**author** | **String** | Name of the author of this schedule |  [optional] |
|**owner** | **String** | Name of owner of this schedule |  [optional] |
|**useAsAuth** | **String** | User to runs schedule when automatically run and authenticates  requests in the schedule |  [optional] |
|**arguments** | **Map&lt;String, String&gt;** | All arguments specified by this Schedule that will be passed in to the Job |  [optional] |
|**trigger** | [**Trigger**](Trigger.md) |  |  [optional] |
|**notifications** | [**List&lt;Notification&gt;**](Notification.md) | Notifications for this Schedule |  [optional] |
|**enabled** | **Boolean** | The status of this schedule |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


