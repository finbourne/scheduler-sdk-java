![LUSID_by_Finbourne](./resources/Finbourne_Logo_Teal.svg)

# Java SDK for the FINBOURNE Scheduler API

## Contents

- [Summary](#summary)
- [Versions](#versions)
- [Requirements](#requirements)
- [Installation](#installation)
    * [Maven](#maven)
    * [Gradle](#gradle)
- [Getting Started](#getting-started)
    * [Environment variables](#environment-variables)
    * [Secrets file](#secrets-file)
    * [Example](#example)
- [Endpoints and models](#endpoints-and-models)

## Summary

This is the java SDK for the FINBOURNE Scheduler API, part of the [LUSID by FINBOURNE](https://www.finbourne.com/lusid-technology) platform. To use it you'll need a LUSID account - [sign up for free at lusid.com](https://www.lusid.com/app/signup).

The Scheduler application provides automated job scheduling functionality - see https://support.lusid.com/knowledgebase/article/KA-01674/ to learn more.

For more details on other applications in the LUSID platform, see [Understanding all the applications in the LUSID platform](https://support.lusid.com/knowledgebase/article/KA-01787).

This sdk supports `Production`, `Early Access`, `Beta` and `Experimental` API endpoints. For more details on API endpoint categories, see [What is the LUSID feature release lifecycle](https://support.lusid.com/knowledgebase/article/KA-01786). To find out which category an API endpoint falls into, see the [swagger page](https://fbn-prd.lusid.com/scheduler2/swagger/index.html).

This code is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project.

## Versions

- API version: 0.0.996
- SDK version: 2.0.116

## Requirements

- Java 1.8+

## Installation

### Maven

Add this dependency to your pom.xml

```xml
<dependency>
    <groupId>com.finbourne</groupId>
    <artifactId>scheduler-sdk</artifactId>
    <version>2.0.116</version>
</dependency>
```

### Gradle

Add this dependency to your build.gradle

```groovy
  repositories {
    mavenCentral()
  }

  dependencies {
     implementation "com.finbourne:scheduler-sdk:2.0.116"
  }
```

## Getting Started

You'll need to provide some configuration to connect to the FINBOURNE Scheduler API - see the articles about [short-lived access tokens](https://support.lusid.com/knowledgebase/article/KA-01654) and a [long-lived Personal Access Token](https://support.lusid.com/knowledgebase/article/KA-01774). This configuration can be provided using a secrets file or environment variables.

For some configuration it is also possible to override the global configuration at the ApiFactory level, or at the request level. For the set of configuration which can be overridden, please see [ConfigurationOptions](sdk/src/main/java/com/finbourne/scheduler/extensions/ConfigurationOptions.java). For a code illustration of this configuration being overridden, please see the [example](#example).

### Environment variables

Required for a short-lived access token
```
FBN_TOKEN_URL
FBN_SCHEDULER_URL
FBN_USERNAME
FBN_PASSWORD
FBN_CLIENT_ID
FBN_CLIENT_SECRET
```

Required for a long-lived access token
``` 
FBN_SCHEDULER_URL
FBN_ACCESS_TOKEN
```

You can send your requests to the FINBOURNE Scheduler API via a proxy, by setting `FBN_PROXY_ADDRESS`. If your proxy has basic auth enabled, you must also set `FBN_PROXY_USERNAME` and `FBN_PROXY_PASSWORD`.

Other optional configuration

```bash
# sdk client timeouts in milliseconds - a value of 0 means no timeout, otherwise timeout values must be between 1 and 2147483647
# please note - the chances of seeing a network issue increases with the duration of the request
# for this reason, rather than increasing the timeout, it will be more reliable to use an alternate polling style endpoint where these exist
FBN_TOTAL_TIMEOUT_MS # the default is 1800000 (30 minutes)
FBN_CONNECT_TIMEOUT_MS # the default is 0 (no timeout)
FBN_READ_TIMEOUT_MS # the default is 0 (no timeout)
FBN_WRITE_TIMEOUT_MS # the default is 0 (no timeout)
FBN_RATE_LIMIT_RETRIES # the default is 2
```

### Secrets file

The secrets file must be in the current working directory. By default the SDK looks for a secrets file called `secrets.json`

Required for a short-lived access token
```json
{
    "api":
    {
        "tokenUrl":"<your-token-url>",
        "schedulerUrl":"https://<your-domain>.lusid.com/scheduler2",
        "username":"<your-username>",
        "password":"<your-password>",
        "clientId":"<your-client-id>",
        "clientSecret":"<your-client-secret>",
    }
}
```

Required for a long-lived access token
```json
{
    "api":
    {
        "schedulerUrl":"https://<your-domain>.lusid.com/scheduler2",
        "accessToken":"<your-access-token>"
    }
}
```

You can send your requests to the FINBOURNE Scheduler API via a proxy, by adding a proxy section. If your proxy has basic auth enabled, you must also supply a `username` and `password` in this section.

```json
{
    "api":
    {
        "schedulerUrl":"https://<your-domain>.lusid.com/scheduler2",
        "accessToken":"<your-access-token>"
    },
    "proxy":
    {
        "address":"<your-proxy-address>",
        "username":"<your-proxy-username>",
        "password":"<your-proxy-password>"
    }
}
```

Other optional configuration

```javascript
{
    "api": 
    {
        // sdk client timeouts in milliseconds - a value of 0 means no timeout, otherwise timeout values must be between 1 and 2147483647
        // please note - the chances of seeing a network issue increases with the duration of the request
        // for this reason, rather than increasing the timeout, it will be more reliable to use an alternate polling style endpoint where these exist
        "totalTimeoutMs":"<timeout-in-ms>", // the default is 1800000 (30 minutes)
        "connectTimeoutMs":"<timeout-in-ms>", // the default is 0 (no timeout)
        "readTimeoutMs":"<timeout-in-ms>", // the default is 0 (no timeout)
        "writeTimeoutMs":"<timeout-in-ms>", // the default is 0 (no timeout)
        "rateLimitRetries":<retries-when-being-rate-limited> // the default is 2
    }
}
```

### Example
```java
import com.finbourne.scheduler.model.*;
import com.finbourne.scheduler.api.ApplicationMetadataApi;
import com.finbourne.scheduler.extensions.ApiConfigurationException;
import com.finbourne.scheduler.extensions.ApiFactoryBuilder;
import com.finbourne.scheduler.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ApplicationMetadataApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"schedulerUrl\": \"https://<your-domain>.lusid.com/scheduler2\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // ApplicationMetadataApi apiInstance = apiFactory.build(ApplicationMetadataApi.class);

        ApplicationMetadataApi apiInstance = ApiFactoryBuilder.build(fileName).build(ApplicationMetadataApi.class);
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfAccessControlledResource result = apiInstance.listAccessControlledResources().execute(opts);

            ResourceListOfAccessControlledResource result = apiInstance.listAccessControlledResources().execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ApplicationMetadataApi#listAccessControlledResources");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```


## Endpoints and models

- See [Documentation for API Endpoints](sdk/README.md#documentation-for-api-endpoints) for a description of each endpoint
- See [Documentation for Models](sdk/README.md#documentation-for-models) for descriptions of the models used

