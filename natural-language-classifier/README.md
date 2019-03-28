# Natural Language Classifier

## Installation

##### Maven
```xml
<dependency>
  <groupId>com.ibm.watson</groupId>
  <artifactId>natural-language-classifier</artifactId>
  <version>7.0.0</version>
</dependency>
```

##### Gradle
```gradle
'com.ibm.watson:natural-language-classifier:7.0.0'
```

## Usage
Use [Natural Language Classifier](https://console.bluemix.net/docs/services/natural-language-classifier/getting-started.html) service to create a classifier instance by providing a set of representative strings and a set of one or more correct classes for each as training. Then use the trained classifier to classify your new question for best matching answers or to retrieve next actions for your application.

```java
NaturalLanguageClassifier service = new NaturalLanguageClassifier();
IamOptions options = new IamOptions.Builder()
  .apiKey("<iam_api_key>")
  .build();
service.setIamCredentials(options);

ClassifyOptions classifyOptions = new ClassifyOptions.Builder()
  .classifierId("<classifier-id>")
  .text("Is it sunny?")
  .build();

Classification classification = service.classify(classifyOptions).execute().getResult();
System.out.println(classification);
```

**Note:** You will need to create and train a classifier in order to be able to classify phrases.
