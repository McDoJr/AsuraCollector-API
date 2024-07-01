# ChunkCollector-API
API for AsuraCollector Plugin

Using the pom.xml in maven:
```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
<dependencies>
    <dependency>
        <groupId>com.github.McDoJr</groupId>
        <artifactId>AsuraCollector-API</artifactId>
        <version>1.0</version>
    </dependency>
</dependencies>
```

Using the build.gradle in gradle:
```groovy
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
dependencies {
        implementation 'com.github.McDoJr:AsuraCollector-API:1.0'
}
```
