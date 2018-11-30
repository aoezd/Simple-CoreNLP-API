package com.aoezd.simple.corenlp.api.resource;

import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.aoezd.simple.corenlp.api.model.Text;
import com.codahale.metrics.annotation.Timed;

import edu.stanford.nlp.coref.data.CorefChain;
import edu.stanford.nlp.simple.Sentence;

@Path("/dcoref")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CoreferenceResolutionResource {

	@POST
	@Timed
	public Map<Integer, CorefChain> coref(Text text) {
		return new Sentence(text.getText()).coref();
	}
}
