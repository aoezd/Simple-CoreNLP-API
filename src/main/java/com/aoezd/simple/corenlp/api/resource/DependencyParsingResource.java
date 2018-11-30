package com.aoezd.simple.corenlp.api.resource;

import java.util.Optional;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.aoezd.simple.corenlp.api.model.Text;
import com.codahale.metrics.annotation.Timed;

import edu.stanford.nlp.simple.Sentence;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class DependencyParsingResource {

	@POST
	@Timed
	@Path("/governor/{index}")
	public Integer governor(Text text, @PathParam("index") int index) {
		Optional<Integer> governor = new Sentence(text.getText()).governor(index);
		return governor.isPresent() ? governor.get() : null;
	}

	@POST
	@Timed
	@Path("/incomingDependencyLabel/{index}")
	public String incomingDependencyLabel(Text text, @PathParam("index") int index) {
		Optional<String> incomingDependencyLabel = new Sentence(text.getText()).incomingDependencyLabel(index);
		return incomingDependencyLabel.isPresent() ? incomingDependencyLabel.get() : null;
	}
}
