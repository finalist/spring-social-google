package org.springframework.social.google.api.gdata.impl;

import nu.xom.XPathContext;

public abstract class Namespaces {

	public static final String AtomNamespace = "http://www.w3.org/2005/Atom";
	public static final String GdataNamespace = "http://schemas.google.com/g/2005";
	public static final String SearchNamespace = "http://a9.com/-/spec/opensearch/1.1/";
	public static final String ContactNamespace = "http://schemas.google.com/contact/2008";
	public static final String PicasaNamespace = "http://schemas.google.com/photos/2007";
	public static final String MediaNamespace = "http://search.yahoo.com/mrss/";
	
	public static final XPathContext NamespaceContext;
	
	static {
		NamespaceContext = new XPathContext();
		NamespaceContext.addNamespace("atom", AtomNamespace);
		NamespaceContext.addNamespace("gd", GdataNamespace);
		NamespaceContext.addNamespace("openSearch", SearchNamespace);
		NamespaceContext.addNamespace("gContact", ContactNamespace);
		NamespaceContext.addNamespace("gphoto", PicasaNamespace);
		NamespaceContext.addNamespace("media", MediaNamespace);
	}
}
