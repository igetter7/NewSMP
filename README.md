# Getting started

TODO: Add Description

## How to Build

The generated code uses a few Maven dependencies e.g., Jackson, UniRest,
and Apache HttpClient. The reference to these dependencies is already
added in the pom.xml file will be installed automatically. Therefore,
you will need internet access for a successful build.

* In order to open the client library in Eclipse click on ``` File -> Import ```.

![Importing SDK into Eclipse - Step 1](https://apidocs.io/illustration/java?step=import0&workspaceFolder=New%20SMP%20%28Shop%20Management%20Platform%29-Java&workspaceName=NewSMPShopManagementPlatform&projectName=NewSMPShopManagementPlatformLib&rootNamespace=localhost)

* In the import dialog, select ``` Existing Java Project ``` and click ``` Next ```.

![Importing SDK into Eclipse - Step 2](https://apidocs.io/illustration/java?step=import1&workspaceFolder=New%20SMP%20%28Shop%20Management%20Platform%29-Java&workspaceName=NewSMPShopManagementPlatform&projectName=NewSMPShopManagementPlatformLib&rootNamespace=localhost)

* Browse to locate the folder containing the source code. Select the detected location of the project and click ``` Finish ```.

![Importing SDK into Eclipse - Step 3](https://apidocs.io/illustration/java?step=import2&workspaceFolder=New%20SMP%20%28Shop%20Management%20Platform%29-Java&workspaceName=NewSMPShopManagementPlatform&projectName=NewSMPShopManagementPlatformLib&rootNamespace=localhost)

* Upon successful import, the project will be automatically built by Eclipse after automatically resolving the dependencies.

![Importing SDK into Eclipse - Step 4](https://apidocs.io/illustration/java?step=import3&workspaceFolder=New%20SMP%20%28Shop%20Management%20Platform%29-Java&workspaceName=NewSMPShopManagementPlatform&projectName=NewSMPShopManagementPlatformLib&rootNamespace=localhost)

## How to Use

The following section explains how to use the NewSMPShopManagementPlatform library in a new console project.

### 1. Starting a new project

For starting a new project, click the menu command ``` File > New > Project ```.

![Add a new project in Eclipse](https://apidocs.io/illustration/java?step=createNewProject0&workspaceFolder=New%20SMP%20%28Shop%20Management%20Platform%29-Java&workspaceName=NewSMPShopManagementPlatform&projectName=NewSMPShopManagementPlatformLib&rootNamespace=localhost)

Next, choose ``` Maven > Maven Project ```and click ``` Next ```.

![Create a new Maven Project - Step 1](https://apidocs.io/illustration/java?step=createNewProject1&workspaceFolder=New%20SMP%20%28Shop%20Management%20Platform%29-Java&workspaceName=NewSMPShopManagementPlatform&projectName=NewSMPShopManagementPlatformLib&rootNamespace=localhost)

Here, make sure to use the current workspace by choosing ``` Use default Workspace location ```, as shown in the picture below and click ``` Next ```.

![Create a new Maven Project - Step 2](https://apidocs.io/illustration/java?step=createNewProject2&workspaceFolder=New%20SMP%20%28Shop%20Management%20Platform%29-Java&workspaceName=NewSMPShopManagementPlatform&projectName=NewSMPShopManagementPlatformLib&rootNamespace=localhost)

Following this, select the *quick start* project type to create a simple project with an existing class and a ``` main ``` method. To do this, choose ``` maven-archetype-quickstart ``` item from the list and click ``` Next ```.

![Create a new Maven Project - Step 3](https://apidocs.io/illustration/java?step=createNewProject3&workspaceFolder=New%20SMP%20%28Shop%20Management%20Platform%29-Java&workspaceName=NewSMPShopManagementPlatform&projectName=NewSMPShopManagementPlatformLib&rootNamespace=localhost)

In the last step, provide a ``` Group Id ``` and ``` Artifact Id ``` as shown in the picture below and click ``` Finish ```.

![Create a new Maven Project - Step 4](https://apidocs.io/illustration/java?step=createNewProject4&workspaceFolder=New%20SMP%20%28Shop%20Management%20Platform%29-Java&workspaceName=NewSMPShopManagementPlatform&projectName=NewSMPShopManagementPlatformLib&rootNamespace=localhost)

### 2. Add reference of the library project

The created Maven project manages its dependencies using its ``` pom.xml ``` file. In order to add a dependency on the *NewSMPShopManagementPlatformLib* client library, double click on the ``` pom.xml ``` file in the ``` Package Explorer ```. Opening the ``` pom.xml ``` file will render a graphical view on the cavas. Here, switch to the ``` Dependencies ``` tab and click the ``` Add ``` button as shown in the picture below.

![Adding dependency to the client library - Step 1](https://apidocs.io/illustration/java?step=testProject0&workspaceFolder=New%20SMP%20%28Shop%20Management%20Platform%29-Java&workspaceName=NewSMPShopManagementPlatform&projectName=NewSMPShopManagementPlatformLib&rootNamespace=localhost)

Clicking the ``` Add ``` button will open a dialog where you need to specify NewSMPShopManagementPlatform in ``` Group Id ``` and NewSMPShopManagementPlatformLib in the ``` Artifact Id ``` fields. Once added click ``` OK ```. Save the ``` pom.xml ``` file.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?step=testProject1&workspaceFolder=New%20SMP%20%28Shop%20Management%20Platform%29-Java&workspaceName=NewSMPShopManagementPlatform&projectName=NewSMPShopManagementPlatformLib&rootNamespace=localhost)

### 3. Write sample code

Once the ``` SimpleConsoleApp ``` is created, a file named ``` App.java ``` will be visible in the *Package Explorer* with a ``` main ``` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?step=testProject2&workspaceFolder=New%20SMP%20%28Shop%20Management%20Platform%29-Java&workspaceName=NewSMPShopManagementPlatform&projectName=NewSMPShopManagementPlatformLib&rootNamespace=localhost)

## How to Test

The generated code and the server can be tested using automatically generated test cases. 
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project *NewSMPShopManagementPlatformLib* from the package explorer.
2. Select "Run -> Run as -> JUnit Test" or use "Alt + Shift + X" followed by "T" to run the Tests.

## Initialization

### Authentication
In order to setup authentication and initialization of the API client, you need the following information.

| Parameter | Description |
|-----------|-------------|
| oAuthClientId | OAuth 2 Client ID |
| oAuthRedirectUri | OAuth 2 Redirection endpoint or Callback Uri |



API client can be initialized as following.

```java
// Configuration parameters and credentials
String oAuthClientId = "oAuthClientId"; // OAuth 2 Client ID
String oAuthRedirectUri = "oAuthRedirectUri"; // OAuth 2 Redirection endpoint or Callback Uri

NewSMPShopManagementPlatformClient client = new NewSMPShopManagementPlatformClient(oAuthClientId, oAuthRedirectUri);
```

You must authorize now authorize the client.

### Authorizing your client

Your application must obtain user authorization before it can execute an endpoint call.
The SDK uses *OAuth 2.0 Implicit Grant* to obtain a user's consent to perform an API request on user's behalf.

This process requires the presence of a client-side JavaScript code on the redirect URI page to 
receive the *access token* after the consent step is completed.

#### 1. Obtain consent

To obtain user's consent, you must redirect the user to the authorization page.
The `buildAuthorizationUrl()` method creates the URL to the authorization page.

```java
authUrl = client.auth().buildAuthorizationUrl();
httpServletResponse.sendRedirect(authUrl);
```

#### 2. Handle the OAuth server response

Once the user responds to the consent request, the OAuth 2.0 server responds to your application's access request by redirecting the user to the redirect URI specified set in `Configuration`.

The redirect URI will receive the *access token* as the `access_token` argument in the URL fragment.

```
https://example.com/oauth/callback#access_token=XXXXXXXXXXXXXXXXXXXXXXXXX
```

The access token must be extracted by the client-side JavaScript code. The access token can be used to authorize any further endpoint calls by the JavaScript code.



# Class Reference

## <a name="list_of_controllers"></a>List of Controllers

* [APIController](#api_controller)

## <a name="api_controller"></a>![Class: ](https://apidocs.io/img/class.png "localhost.controllers.APIController") APIController

### Get singleton instance

The singleton instance of the ``` APIController ``` class can be accessed from the API Client.

```java
APIController client = client.getClient();
```

### <a name="create_o2_o_shop_async"></a>![Method: ](https://apidocs.io/img/method.png "localhost.controllers.APIController.createO2OShopAsync") createO2OShopAsync

> Create o2o shop under sprcific brand with basic info


```java
void createO2OShopAsync(
        final String contentType,
        final CreateO2OShopRequest body,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| contentType |  ``` Required ```  | TODO: Add a parameter description |
| body |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String contentType = "application/json";
    String bodyValue = "{\r\n  \"id\": \"\",\r\n  \"shop_names\": {\r\n    \"default\": \"เรารักลุงสาขาบางนา\",\r\n    \"th\": \"เรารักลุงสาขาบางนา\",\r\n    \"en\": \"We love uncle @Bangna\",\r\n    \"cn\": \"我們愛叔叔在邦納開槍\",\r\n    \"jp\": \"\",\r\n    \"kr\": \"우리는 Bangna에서 삼촌 총을 사랑합니다\"\r\n  },\r\n  \"shop_types\": [\r\n    \"OFFLINE\",\r\n    \"ONLINE\"\r\n  ],\r\n  \"shop_categories\": [\r\n    \"FOOD\",\r\n    \"SERVICE\"\r\n  ],\r\n  \"shop_addresses\": {\r\n    \"full_address\": \"123/22 ถนนบางนา แขวงบางนา เขตบางนา กทม 10260\",\r\n    \"country\": {\r\n      \"name\": \"Thailand\",\r\n      \"country_code\": \"TH\"\r\n    },\r\n    \"city\": {\r\n      \"name\": \"Bangkok\",\r\n      \"HS_code\": \"BKK\"\r\n    },\r\n    \"district\": \"Bangna\",\r\n    \"postcode\": \"10260\",\r\n    \"geolocation\": \"13.6601781,100.6254328\"\r\n  },\r\n  \"shop_contacts\": [\r\n    {\r\n      \"full_name\": \"คุณปริญญา นามสมมติ\",\r\n      \"phone\": \"0912345678\"\r\n    }\r\n  ],\r\n  \"shop_details\": {\r\n    \"short_description\": \"\",\r\n    \"full_description\": \"\",\r\n    \"open_hours\": {\r\n      \"sun\": \"8.00AM-7:00PM\",\r\n      \"mon\": \"\",\r\n      \"tue\": \"8.00AM-7:00PM\",\r\n      \"wed\": \"8.00AM-7:00PM\",\r\n      \"thu\": \"8.00AM-7:00PM\",\r\n      \"fri\": \"8.00AM-7:00PM\",\r\n      \"sat\": \"8.00AM-7:00PM\"\r\n    },\r\n    \"rating\": {\r\n      \"point\": \"85.33\",\r\n      \"star\": \"4.2\"\r\n    }\r\n  },\r\n  \"shop_status\": \"ACTIVE\"\r\n}";
    CreateO2OShopRequest body = mapper.readValue(bodyValue,new TypeReference<CreateO2OShopRequest> (){});
    // Invoking the API call with sample inputs
    client.createO2OShopAsync(contentType, body, new APICallBack<void>() {
        public void onSuccess(HttpContext context, void response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


[Back to List of Controllers](#list_of_controllers)



