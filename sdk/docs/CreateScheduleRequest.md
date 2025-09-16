

# CreateScheduleRequest

Create a schedule definition

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**scheduleId** | [**ResourceId**](ResourceId.md) |  |  |
|**jobId** | [**ResourceId**](ResourceId.md) |  |  |
|**name** | **String** | A display name for this Schedule |  |
|**description** | **String** | A description of the Schedule |  |
|**author** | **String** | Name of the author of this schedule |  [optional] |
|**owner** | **String** | Name of owner of this schedule |  [optional] |
|**arguments** | **Map&lt;String, String&gt;** | All arguments specified by this Schedule that will be passed in to the Job |  [optional] |
|**trigger** | [**Trigger**](Trigger.md) |  |  [optional] |
|**notifications** | [**List&lt;Notification&gt;**](Notification.md) | Notifications for this Schedule |  [optional] |
|**enabled** | **Boolean** | Specify whether schedule is enabled or not Defaults to true |  [optional] |
|**useAsAuth** | **String** | Id of user associated with schedule. All calls to FINBOURNE services as part of execution of this schedule will be authenticated as this  user. Can be null, in which case we&#39;ll default to that of the user  making this request |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


