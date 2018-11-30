package com.aoezd.microservice.corenlp.smallnlp.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.aoezd.microservice.corenlp.smallnlp.model.Text;
import com.codahale.metrics.annotation.Timed;

import edu.stanford.nlp.simple.Sentence;

@Path("/tokenize")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TokenizationResource {

	@POST
	@Timed
	public List<String> tokenize(Text text) {
		return new Sentence(text.getText()).words();
	}

	@POST
	@Timed
	@Path("/{index}")
	public String tokenize(Text text, @PathParam("index") int index) {
		return new Sentence(text.getText()).word(index);
	}
}
