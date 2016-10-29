package br.com.erudio.patterns.adapter;

import br.com.erudio.patterns.adapter.implementation.CsvConverter;
import br.com.erudio.patterns.adapter.implementation.JsonConverter;
import br.com.erudio.patterns.adapter.interfaces.AdvancedSchemaConverter;
import br.com.erudio.patterns.adapter.interfaces.Converter;

public class SchemaAdapter implements Converter {

	AdvancedSchemaConverter advancedSchemaConverter;

	public SchemaAdapter(String mediaType) {

		if (mediaType.equalsIgnoreCase("csv")) {
			advancedSchemaConverter = new CsvConverter();

		} else if (mediaType.equalsIgnoreCase("json")) {
			advancedSchemaConverter = new JsonConverter();
		}
	}

	public void convert(String audioType, String data) {

		if (audioType.equalsIgnoreCase("csv")) {
			advancedSchemaConverter.convertCsv(data);
		} else if (audioType.equalsIgnoreCase("json")) {
			advancedSchemaConverter.convertJson(data);
		}
	}
}
