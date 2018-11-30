package com.aoezd.simple.corenlp.api.model;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Text {

	@NotEmpty
	@JsonProperty
	private String text;

	public Text() {
		// Jackson
	}

	public Text(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
