package com.aoezd.simple.corenlp.api.resource;

import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.aoezd.simple.corenlp.api.model.Text;
import com.codahale.metrics.annotation.Timed;

import edu.stanford.nlp.ie.util.RelationTriple;
import edu.stanford.nlp.simple.Sentence;
import edu.stanford.nlp.util.Quadruple;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class OpenInformationExtractionResource {

	@POST
	@Timed
	@Path("/openie")
	public Collection<Quadruple<String, String, String, Double>> openie(Text text) {
		return new Sentence(text.getText()).openie();
	}

	@POST
	@Timed
	@Path("/openieTriples")
	public Collection<RelationTriple> openieTriples(Text text) {
		return new Sentence(text.getText()).openieTriples();
	}
}
