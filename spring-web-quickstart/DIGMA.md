# Run app with OTEL + Digma with java agent

## Build and run

build :

```shell
./mvnw install
```

Run with OTEL + Digma javaagent

```shell
java \
 -javaagent:target/otel/opentelemetry-javaagent.jar \
 -Dotel.javaagent.extensions=target/otel/digma-otel-agent-extension.jar \
 -Dotel.service.name="quarkus-spring-web-digmatized" \
 -DCODE_PACKAGE_PREFIXES=org.acme.spring.web \
 -jar target/quarkus-app/quarkus-run.jar
```

## Execute app

browse locally to:
<br>
[say hello to john](http://localhost:8080/greeting/john)
<br>
[say hello to mark](http://localhost:8080/greeting/mark)

