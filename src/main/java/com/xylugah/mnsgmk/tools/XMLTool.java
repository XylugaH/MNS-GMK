package com.xylugah.mnsgmk.tools;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.xylugah.mnsgmk.entity.Issuance;

public class XMLTool{

	public XMLTool() {
		super();
	}

	public boolean marshal(final File file, final Issuance product) throws JAXBException{
		
		JAXBContext jaxbContext = JAXBContext.newInstance(Issuance.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

		// output pretty printed
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		jaxbMarshaller.marshal(product, file);
		jaxbMarshaller.marshal(product, System.out);
		return false;
	}
	
	public Object unMarshal(final File file) throws JAXBException{
		JAXBContext jaxbContext = JAXBContext.newInstance(Issuance.class);

		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		Object obj = jaxbUnmarshaller.unmarshal(file);
		return obj;
	}
}
