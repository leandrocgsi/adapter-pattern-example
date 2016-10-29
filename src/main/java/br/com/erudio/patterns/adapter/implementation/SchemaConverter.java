package br.com.erudio.patterns.adapter.implementation;

import br.com.erudio.patterns.adapter.SchemaAdapter;
import br.com.erudio.patterns.adapter.interfaces.Converter;

public class SchemaConverter implements Converter {
   SchemaAdapter schemaAdapter; 

   public void convert(String schemaType, String data) {		

      if(schemaType.equalsIgnoreCase("xml")){
         System.out.println("Converting XML file. Name: " + data);			
      } 
      
      else if(schemaType.equalsIgnoreCase("json") || schemaType.equalsIgnoreCase("csv")){
         schemaAdapter = new SchemaAdapter(schemaType);
         schemaAdapter.convert(schemaType, data);
      }
      
      else{
         System.out.println("Invalid media. " + schemaType + " format not supported");
      }
   }   
}