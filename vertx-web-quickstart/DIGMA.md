# Run app with OTEL + Digma with java agent

## Build and run

build :

```shell
./mvnw install
```

Run with OTEL + Digma javaagent

```shell
java \
 -Dquarkus.http.port=8096 \
 -javaagent:target/otel/opentelemetry-javaagent.jar \
 -Dotel.javaagent.extensions=target/otel/digma-otel-agent-extension.jar \
 -Dotel.service.name="quarkus-vertx-web-digmatized" \
 -DCODE_PACKAGE_PREFIXES=org.acme \
 -jar target/quarkus-app/quarkus-run.jar
```

## Execute app

browse locally to:
<br>
[Link local to web](http://localhost:8096/vertx/web)
<br>
[Link local to book](http://localhost:8096/vertx/book)
<br>
[Link local to lorem](http://localhost:8096/vertx/lorem)
<br>
[Say hello to john](http://localhost:8096/vertx/hello?name=john)
