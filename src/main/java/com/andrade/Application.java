package com.andrade;

import java.io.FileInputStream;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.elasticsearch.client.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;

import com.andrade.email.model.Email;
import com.andrade.email.service.EmailService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.mongodb.BasicDBObject;
import com.mongodb.util.JSON;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private ElasticsearchOperations es;

	@Autowired
	private EmailService emailService;

	public static void main(String args[]) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		FileInputStream fileInputStream = null;
		ObjectMapper mapper = new ObjectMapper();
		printElasticSearchInfo();

		if(args.length != 1) {
			System.err.println("Invalid command line, exactly one argument required");
			System.exit(1);
		}

		fileInputStream = new FileInputStream(args[0]);
		Scanner scanner = new Scanner(fileInputStream);
		while (scanner.hasNext()) {
			BasicDBObject basicDBObject = (BasicDBObject) JSON.parse(scanner.nextLine());			
			JsonObject jsonObject = new Mongo2gson().getAsJsonObject(basicDBObject);

			Email email = new Gson().fromJson(jsonObject, Email.class);

			emailService.save(email);
		}

		scanner.close();

		System.out.println("----dsadasda----adsaasd");
		List<Email> emails = emailService.findBySender("rosalee.fleming@enron.com");

		emails.forEach(x -> System.out.println(x));


	}

	//useful for debug
	private void printElasticSearchInfo() {

		System.out.println("--ElasticSearch-->");
		Client client = es.getClient();
		Map<String, String> asMap = client.settings().getAsMap();

		asMap.forEach((k, v) -> {
			System.out.println(k + " = " + v);
		});
		System.out.println("<--ElasticSearch--");
	}

}