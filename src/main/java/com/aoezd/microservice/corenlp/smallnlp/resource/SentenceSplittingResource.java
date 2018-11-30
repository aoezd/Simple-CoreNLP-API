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

import edu.stanford.nlp.simple.Document;
import edu.stanford.nlp.simple.Sentence;

@Path("/ssplit")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SentenceSplittingResource {

	@POST
	@Timed
	public List<Sentence> sentences(Text text) {
		return new Document(text.getText()).sentences();
	}

	@POST
	@Timed
	@Path("/{index}")
	public Sentence sentence(Text text, @PathParam("index") int index) {
		return new Document(text.getText()).sentence(index);
	}
}
