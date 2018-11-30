package com.aoezd.simple.corenlp.api.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.aoezd.simple.corenlp.api.model.Text;
import com.codahale.metrics.annotation.Timed;

import edu.stanford.nlp.simple.Sentence;

@Path("/ner")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class NamedEntityRecognitionResource {

	@POST
	@Timed
	public List<String> nerTags(Text text) {
		return new Sentence(text.getText()).nerTags();
	}

	@POST
	@Timed
	@Path("/{index}")
	public String nerTag(Text text, @PathParam("index") int index) {
		return new Sentence(text.getText()).nerTag(index);
	}
}
