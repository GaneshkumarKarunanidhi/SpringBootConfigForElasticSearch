package com.connect.elasticSearchConnectSample.controller;

import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch._types.ElasticsearchException;
import co.elastic.clients.transport.ElasticsearchTransport;

@RestController
@RequestMapping("/api/elastic")
public class SearchController {

	@Autowired
	ElasticsearchClient elasticsearchClient;

	@Autowired
	ElasticsearchTransport elasticsearchTransport;

	@GetMapping("/version")
	public String getElasticVersion() {
		try {
			return elasticsearchClient.info().version().number();
		} catch (ElasticsearchException | IOException e) {
			e.printStackTrace();
			return "Facing issue while get the elastic search version";
		}
	}

}
