# Countryservice

This program creates a simple REST api that exposes two endpoints to get country data.

## Prerequisites

- [JDK](https://www.oracle.com/java/technologies/downloads/#java11)
- [Maven](https://maven.apache.org/)

## Installing and running

First, clone this repository. Then in the 'countryservice' directory, use this command to run:

```
./mvnw spring-boot::run
```

You can then access the API at localhost with a REST client or web browser at http://127.0.0.1:8080/

## Available endpoints

### GET /countries/

Will return country data like so: 

```
{
    "countries": [
        {
            "name": "Belarus",
            "country_code": "BY"
        },
        {
            "name": "Japan",
            "country_code": "JP"
        },
        ...
    ]
}
```

### GET /countries/{name}

Will return single country data like so: 

```
{
    "name": "Finland",
    "country_code": "FI",
    "capital": "Helsinki",
    "flag_file_url": "https://flagcdn.com/fi.svg",
    "population": 5530719
}
```
