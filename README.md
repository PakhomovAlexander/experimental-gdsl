# Experimental Groovy dsl project

## Dynamic field highlighting in any closure PoC

This proof-of-concept example of dynamic fields highlighting.
To see how it works put [PoC.gdsl](poc/src/main/groovy/com/apakhomov/groovy/experimental/PoC.gdsl) file to your 
classpath and add `Metadata` class to `package com.apakhomov.groovy.experimental` package. 
in `Metadata` class you should add following code:

```java
class Metadata {
    List<String> fields = ['FIELD1', 'FIELD2', 'FIELD3']
}
```

`['FIELD1', 'FIELD2', 'FIELD3']` - fields to be recognized in any closure.

Now we have the following highlighting:

```java
transform {
    FIELD1 // highlighted
    FIELD4 // grayed
}
```
