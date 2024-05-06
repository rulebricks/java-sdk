# Rulebricks Java SDK

This SDK allows you to easily integrate Rulebricks' powerful rule engine into your Java applications.

## Installation

To use the Rulebricks Java SDK in your project, you will need to include it as a dependency in your build management tool.

For Maven:

```xml
<dependency>
  <groupId>com.rulebricks</groupId>
  <artifactId>rulebricks-sdk-java</artifactId>
  <version>1.0</version>
</dependency>
```

For Gradle:

```groovy
implementation 'com.rulebricks:rulebricks-sdk-java:1.0.0'
```

## Configuration

Before you can start using the SDK, you need to configure it with your Rulebricks API key:

```java
RulebricksApiClient client = RulebricksApiClient.builder()
    .apiKey("YOUR_API_KEY")
    .build();
```

## Basic Usage

Here's a simple example of how to solve a rule:

```java
Map<String, Object> requestData = new HashMap<>();
requestData.put("dataKey", "dataValue"); // Replace with actual rule data keys and values

Map<String, Object> result = client.rules().solve("rule-slug", requestData);
```

Here's how to solve multiple rules in bulk:

```java
List<Map<String, Object>> requestDataList = new ArrayList<>();
requestDataList.add(requestData); // Add all request data maps

List<Map<String, Object>> results = client.rules().bulkSolve("rule-slug", requestDataList);
```

Parallel solving rules requires a particular format using `$rule` alongside respective data payloads:

```java
Map<String, Map<String, Object>> requestDataMap = new HashMap<>();
requestDataMap.put("eligibility", {
    "$rule": "1ef03ms",
    "customer_id": "anc39as3",
    "purchase_history": ["t-shirt", "mug"],
    "account_age_days": 4,
    "last_purchase_days_ago": 3,
    "email_subscription": false
});
requestDataMap.put("offers", {
    "$rule": "OvmsYwn",
    "customer_id": "anc39as3",
    "last_purchase_days_ago": 3,
    "selected_plan": "premium"
});

Map<String, Object> results = client.rules().parallelSolve(requestDataMap);
```

## Error Handling

The SDK throws exceptions to indicate API errors:

```java
try {
    Map<String, Object> result = client.rules().solve("rule-slug", requestData);
} catch (Exception e) {
    // Handle the error
}
```

## Feedback and Contributions

We welcome feedback and contributions to the SDK. Please report any issues or suggestions through the [GitHub issue tracker](https://github.com/rulebricks/java-sdk/issues).

For contributions, please submit a pull request with a clear description of the changes and any relevant tests.

## License

The Rulebricks Java SDK is released under the MIT License. See the LICENSE file for more details.
