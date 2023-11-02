

# StartJobRequest

Job start definition

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**arguments** | **Map&lt;String, String&gt;** | All arguments needed for the Job to run |  [optional] |
|**notifications** | [**List&lt;Notification&gt;**](Notification.md) | Notifications for this Job |  [optional] |
|**useAsAuth** | **String** | Id of user associated with schedule. All calls to FINBOURNE services  as part of execution of this schedule will be authenticated as this   user. Can be null, in which case we&#39;ll default to that of the user   making this request |  [optional] |



