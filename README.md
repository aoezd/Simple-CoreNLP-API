# aoezd-simple-corenlp-api

A small Dropwizard project that abstracts the Stanfords [Simple CoreNLP API](https://stanfordnlp.github.io/CoreNLP/simple.html).

## Getting started

Open a command line (UNIX) and type the following:

```
git clone https://github.com/aoezd/aoezd-simple-corenlp-api.git

cd aoezd-simple-corenlp-api/

./gradlew build

cd build/libs/

cp ../../src/main/resources/config.yml .

java -jar aoezd-simple-corenlp-api-1.0.0-all.jar server config.yml
```

## Swagger API description
