package br.com.erudio.patterns.adapter.implementation;

import br.com.erudio.patterns.adapter.interfaces.AdvancedSchemaConverter;

public class CsvConverter implements AdvancedSchemaConverter {
	
	public void convertCsv(String data) {
		System.out.println("Converting CSV file. Name: " + data);
	}

	public void convertJson(String data) {
		// do nothing
	}
}
