package br.com.erudio.patterns.adapter.implementation;

import br.com.erudio.patterns.adapter.interfaces.AdvancedSchemaConverter;

public class JsonConverter implements AdvancedSchemaConverter{

	public void convertCsv(String data) {
		// do nothing
	}

	public void convertJson(String data) {
		System.out.println("Converting JSON file. Name: " + data);
	}
}