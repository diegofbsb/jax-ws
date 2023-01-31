package br.com.server;

import javax.xml.ws.Endpoint;

public class Application {

	 public static void main(String[] args) {

		System.out.println("Aplicação iniciada na porta 9090");
		Endpoint.publish("http://localhost:9090/pessoa", new CadastroPessoaWS());
	}

}
