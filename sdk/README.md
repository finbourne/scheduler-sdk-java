<a id="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://fbn-prd.lusid.com/scheduler2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ApplicationMetadataApi* | [**listAccessControlledResources**](docs/ApplicationMetadataApi.md#listaccesscontrolledresources) | **GET** /api/metadata/access/resources | ListAccessControlledResources: Get resources available for access control
*ImagesApi* | [**getImage**](docs/ImagesApi.md#getimage) | **GET** /api/images/{name} | GetImage: Get metadata of a Docker Image
*ImagesApi* | [**listImages**](docs/ImagesApi.md#listimages) | **GET** /api/images/repository/{name} | ListImages: List all images under same image repository
*ImagesApi* | [**listRepositories**](docs/ImagesApi.md#listrepositories) | **GET** /api/images/repository | ListRepositories: List all Docker image repositories
*ImagesApi* | [**uploadImage**](docs/ImagesApi.md#uploadimage) | **POST** /api/images | UploadImage: Upload a Docker Image used for Scheduler jobs
*JobsApi* | [**createJob**](docs/JobsApi.md#createjob) | **POST** /api/jobs | CreateJob: Create a new job
*JobsApi* | [**deleteJob**](docs/JobsApi.md#deletejob) | **DELETE** /api/jobs/{scope}/{code} | DeleteJob: Delete a job
*JobsApi* | [**getHistory**](docs/JobsApi.md#gethistory) | **GET** /api/jobs/history | GetHistory: Get the history of job runs
*JobsApi* | [**getJobConsoleOutput**](docs/JobsApi.md#getjobconsoleoutput) | **GET** /api/jobs/history/{runId}/console | GetJobConsoleOutput: Gets the console output of a specific job run
*JobsApi* | [**getRunHistory**](docs/JobsApi.md#getrunhistory) | **GET** /api/jobs/history/{runId} | GetRunHistory: Get the history for a single job run
*JobsApi* | [**getSchedulesForAJob**](docs/JobsApi.md#getschedulesforajob) | **GET** /api/jobs/{scope}/{code}/schedules | GetSchedulesForAJob: Get all the schedules for a single job
*JobsApi* | [**listJobs**](docs/JobsApi.md#listjobs) | **GET** /api/jobs | ListJobs: List the available jobs
*JobsApi* | [**runJob**](docs/JobsApi.md#runjob) | **POST** /api/jobs/{scope}/{code}/$run | RunJob: Run a job immediately
*JobsApi* | [**updateJob**](docs/JobsApi.md#updatejob) | **PUT** /api/jobs/{scope}/{code} | UpdateJob: Update a JobDefinition
*SchedulesApi* | [**createSchedule**](docs/SchedulesApi.md#createschedule) | **POST** /api/schedules | CreateSchedule: Create a Schedule for a job
*SchedulesApi* | [**deleteSchedule**](docs/SchedulesApi.md#deleteschedule) | **DELETE** /api/schedules/{scope}/{code} | DeleteSchedule: Delete a schedule
*SchedulesApi* | [**enabledSchedule**](docs/SchedulesApi.md#enabledschedule) | **PUT** /api/schedules/{scope}/{code}/enabled | EnabledSchedule: Enable/disable a schedule
*SchedulesApi* | [**getSchedule**](docs/SchedulesApi.md#getschedule) | **GET** /api/schedules/{scope}/{code} | GetSchedule: Get a single Schedule
*SchedulesApi* | [**getValidTimezones**](docs/SchedulesApi.md#getvalidtimezones) | **GET** /api/schedules/{scope}/{code}/enabled | GetValidTimezones: Get a list of valid timezones
*SchedulesApi* | [**listSchedules**](docs/SchedulesApi.md#listschedules) | **GET** /api/schedules | ListSchedules: List the available Schedules
*SchedulesApi* | [**runSchedule**](docs/SchedulesApi.md#runschedule) | **POST** /api/schedules/{scope}/{code}/$run | RunSchedule: Run a schedule immediately
*SchedulesApi* | [**updateSchedule**](docs/SchedulesApi.md#updateschedule) | **PUT** /api/schedules/{scope}/{code} | UpdateSchedule: Update a schedule.


<a id="documentation-for-models"></a>
## Documentation for Models

 - [AccessControlledAction](docs/AccessControlledAction.md)
 - [AccessControlledResource](docs/AccessControlledResource.md)
 - [ActionId](docs/ActionId.md)
 - [ArgumentDefinition](docs/ArgumentDefinition.md)
 - [CreateJobRequest](docs/CreateJobRequest.md)
 - [CreateScheduleRequest](docs/CreateScheduleRequest.md)
 - [IdSelectorDefinition](docs/IdSelectorDefinition.md)
 - [IdentifierPartSchema](docs/IdentifierPartSchema.md)
 - [Image](docs/Image.md)
 - [ImageSummary](docs/ImageSummary.md)
 - [JobDefinition](docs/JobDefinition.md)
 - [JobHistory](docs/JobHistory.md)
 - [JobRunResult](docs/JobRunResult.md)
 - [Link](docs/Link.md)
 - [LusidProblemDetails](docs/LusidProblemDetails.md)
 - [LusidValidationProblemDetails](docs/LusidValidationProblemDetails.md)
 - [Notification](docs/Notification.md)
 - [Repository](docs/Repository.md)
 - [RequiredResources](docs/RequiredResources.md)
 - [ResourceId](docs/ResourceId.md)
 - [ResourceListOfAccessControlledResource](docs/ResourceListOfAccessControlledResource.md)
 - [ResourceListOfImageSummary](docs/ResourceListOfImageSummary.md)
 - [ResourceListOfJobDefinition](docs/ResourceListOfJobDefinition.md)
 - [ResourceListOfJobHistory](docs/ResourceListOfJobHistory.md)
 - [ResourceListOfRepository](docs/ResourceListOfRepository.md)
 - [ResourceListOfScheduleDefinition](docs/ResourceListOfScheduleDefinition.md)
 - [ResourceListOfString](docs/ResourceListOfString.md)
 - [ScanReport](docs/ScanReport.md)
 - [ScanSummary](docs/ScanSummary.md)
 - [ScheduleDefinition](docs/ScheduleDefinition.md)
 - [StartJobRequest](docs/StartJobRequest.md)
 - [StartJobResponse](docs/StartJobResponse.md)
 - [StartScheduleResponse](docs/StartScheduleResponse.md)
 - [Tag](docs/Tag.md)
 - [TimeTrigger](docs/TimeTrigger.md)
 - [Trigger](docs/Trigger.md)
 - [UpdateJobRequest](docs/UpdateJobRequest.md)
 - [UpdateScheduleRequest](docs/UpdateScheduleRequest.md)
 - [UploadImageInstructions](docs/UploadImageInstructions.md)
 - [UploadImageRequest](docs/UploadImageRequest.md)
 - [Vulnerability](docs/Vulnerability.md)

