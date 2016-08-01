package org.cbsoft.framework;

public class Main {
	
	public static void main(String[] args){
		Product p = new Product("notebook", "HP", 1999.99, "2348203894032948");
		p.setSecretCode("Não aparecer");
				
		FileSerializer cxs = new FileSerializer(new PropertiesFormatter(), new Compressor());
		cxs.generateFile("product.zip", p);
		
	}

}
