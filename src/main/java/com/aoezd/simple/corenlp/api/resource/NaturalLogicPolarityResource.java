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

import edu.stanford.nlp.naturalli.Polarity;
import edu.stanford.nlp.simple.Sentence;

@Path("/natlog")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class NaturalLogicPolarityResource {

	@POST
	@Timed
	public List<Polarity> natlogPolarities(Text text) {
		return new Sentence(text.getText()).natlogPolarities();
	}

	@POST
	@Timed
	@Path("/{index}")
	public Polarity natlogPolarity(Text text, @PathParam("index") int index) {
		return new Sentence(text.getText()).natlogPolarity(index);
	}
}
