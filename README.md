# Rulebricks Java SDK

This SDK allows you to easily integrate Rulebricks' powerful rule engine into your Java applications.

## Installation

To use the Rulebricks Java SDK in your project, you will need to include it as a dependency in your build management tool.

For Maven:

```xml
<dependency>
  <groupId>com.rulebricks</groupId>
  <artifactId>rulebricks-sdk-java</artifactId>
  <version>1.0.0</version>
</dependency>
```

For Gradle:

```groovy
implementation 'com.rulebricks:rulebricks-sdk-java:1.0.0'
```

## Configuration

Before you can start using the SDK, you need to configure it with your Rulebricks API key:

```java
RulebricksClient client = new RulebricksClientBuilder()
    .setApiKey("YOUR_API_KEY")
    .build();
```

## Basic Usage

Here's a simple example of how to create a rule:

```java
Rule rule = client.rules().create(new Rule.Builder()
    .withName("My Rule")
    .withCondition("if (data.temperature > 100) { return true; }")
    .withAction("System.out.println('Alert! High temperature detected.');")
    .build());
```

## Asynchronous Usage

The SDK also supports asynchronous operations:

```java
client.rules().createAsync(new Rule.Builder()...).thenAccept(rule -> {
    // Handle the created rule
});
```

## Error Handling

The SDK throws exceptions to indicate API errors:

```java
try {
    Rule rule = client.rules().create(...);
} catch (RulebricksApiException e) {
    // Handle the error
}
```

## Feedback and Contributions

We welcome feedback and contributions to the SDK. Please report any issues or suggestions through the [GitHub issue tracker](https://github.com/rulebricks/java-sdk/issues).

For contributions, please submit a pull request with a clear description of the changes and any relevant tests.

## License

The Rulebricks Java SDK is released under the MIT License. See the LICENSE file for more details.
