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

## Resources
Send a POST request with a JSON payload like this:
```
{
  text: "YOUR SENTENCE"
}
```
to any of the following resources:

FUNCTIONALITY | ANNOTATOR IN CORENLP | RESOURCE
------------ | ------------- | -------------
Tokenization | tokenize | /tokenize
Tokenization | tokenize | /tokenize/{index}
Lemmatization | lemma | /lemma
Lemmatization | lemma | /lemma/{index}
Sentence Splitting | ssplit | /ssplit
Sentence Splitting | ssplit | /ssplit/{index}
Part of Speech Tagging | pos | /pos
Part of Speech Tagging | pos | /pos/{index}
Open Information Extraction | openie | /openie
Open Information Extraction | openie | /openieTriples
Natural Logic Polarity | natlog | /natlog
Natural Logic Polarity | natlog | /natlog/{index}
Named Entity Recognition | ner | /ner
Named Entity Recognition | ner | /ner/{index}
Dependency Parsing | depparse | /governor/{index}
Dependency Parsing | depparse | /incomingDependencyLabel/{index}
Coreference Resolution | dcoref | /coref
Constituency Parsing | parse | /parse
