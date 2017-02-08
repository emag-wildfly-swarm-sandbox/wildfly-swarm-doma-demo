# wildfly-swarm-doma-demo

WildFly Swarm Doma Demo

## Build & Run

``` sh
./mvnw clean package &&\
java -jar target/wildfly-swarm-doma-demo-swarm.jar
```

## Access APIS

### GET all

``` sh
curl localhost:8080
```

``` json
[
  {
    "id": 1,
    "name": "ALLEN",
    "age": 30,
    "version": 0
  },
  {
    "id": 2,
    "name": "WARD",
    "age": 32,
    "version": 0
  },
  {
    "id": 3,
    "name": "JONES",
    "age": 38,
    "version": 0
  }
]
```

### GET by id

``` sh
$ curl localhost:8080/1 | jq .
```

``` json
{
  "id": 1,
  "name": "ALLEN",
  "age": 30,
  "version": 0
}
```

### POST(Create a resource)

``` sh
 curl -XPOST -H 'Content-Type: application/json' -d '{"name": "Alice", "age": 30}' localhost:8080 -v
```

``` sh
< HTTP/1.1 201 Created
[...]
< Location: http://localhost:8080/100
[...]
```
