package com.aoezd.microservice.corenlp.smallnlp.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.aoezd.microservice.corenlp.smallnlp.model.Text;
import com.codahale.metrics.annotation.Timed;

import edu.stanford.nlp.simple.Sentence;
import edu.stanford.nlp.trees.Tree;

@Path("parse")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ConstituencyParsingResource {

	@POST
	@Timed
	public Tree parse(Text text) {
		return new Sentence(text.getText()).parse();
	}
}
