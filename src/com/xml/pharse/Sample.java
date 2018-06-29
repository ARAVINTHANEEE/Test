package com.xml.pharse;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;

public class Sample {

	public static void main(String[] args) throws JAXBException {

		 JAXBContext jc = JAXBContext.newInstance(SampleBean.class);

		 SampleBean customer = new SampleBean();
	        customer.setFirstName("Jane");
	        customer.setLastName("Doe");
	        Marshaller marshaller = jc.createMarshaller();
	        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	        JAXBElement<SampleBean> rootElement = new JAXBElement<SampleBean>(new QName("SampleBean"), SampleBean.class, customer);
	        System.out.println(rootElement);
	        marshaller.marshal(rootElement, System.out);
		
	}

}
