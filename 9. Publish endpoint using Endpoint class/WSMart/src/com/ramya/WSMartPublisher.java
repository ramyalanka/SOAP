package com.ramya;

import javax.xml.ws.Endpoint;

public class WSMartPublisher {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:1234/wsmart", new ProductCategory());
	}
}
