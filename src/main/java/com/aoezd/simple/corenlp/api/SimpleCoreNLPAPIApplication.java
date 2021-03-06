package com.aoezd.simple.corenlp.api;

import com.aoezd.simple.corenlp.api.healthcheck.TestHealthCheck;
import com.aoezd.simple.corenlp.api.resource.ConstituencyParsingResource;
import com.aoezd.simple.corenlp.api.resource.CoreferenceResolutionResource;
import com.aoezd.simple.corenlp.api.resource.DependencyParsingResource;
import com.aoezd.simple.corenlp.api.resource.LemmaResource;
import com.aoezd.simple.corenlp.api.resource.NamedEntityRecognitionResource;
import com.aoezd.simple.corenlp.api.resource.NaturalLogicPolarityResource;
import com.aoezd.simple.corenlp.api.resource.OpenInformationExtractionResource;
import com.aoezd.simple.corenlp.api.resource.PartOfSpeechTaggingResource;
import com.aoezd.simple.corenlp.api.resource.SentenceSplittingResource;
import com.aoezd.simple.corenlp.api.resource.TokenizationResource;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class SimpleCoreNLPAPIApplication extends Application<SimpleCoreNLPAPIConfiguration> {

	public static void main(String[] args) throws Exception {
		new SimpleCoreNLPAPIApplication().run(args);
	}

	@Override
	public void run(SimpleCoreNLPAPIConfiguration configuration, Environment environment) throws Exception {

		// Register all healthchecks
		environment.healthChecks().register("TestHealthCheck", new TestHealthCheck(configuration.getTest()));

		// Register all resources
		environment.jersey().register(new ConstituencyParsingResource());
		environment.jersey().register(new CoreferenceResolutionResource());
		environment.jersey().register(new DependencyParsingResource());
		environment.jersey().register(new LemmaResource());
		environment.jersey().register(new NamedEntityRecognitionResource());
		environment.jersey().register(new NaturalLogicPolarityResource());
		environment.jersey().register(new OpenInformationExtractionResource());
		environment.jersey().register(new PartOfSpeechTaggingResource());
		environment.jersey().register(new SentenceSplittingResource());
		environment.jersey().register(new TokenizationResource());
	}
}
