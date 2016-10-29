package br.com.erudio.patterns.adapter.interfaces;

import org.junit.Test;

import br.com.erudio.patterns.adapter.implementation.SchemaConverter;

public class SchemaConverterTest {

	@Test
	public void testConverter() {
	      SchemaConverter schemaConverter = new SchemaConverter();

	      schemaConverter.convert("xml", "products.xml");
	      schemaConverter.convert("json", "persons.json");
	      schemaConverter.convert("csv", "sales.csv");
	      schemaConverter.convert("txt", "report_sales.txt");
	}

}
