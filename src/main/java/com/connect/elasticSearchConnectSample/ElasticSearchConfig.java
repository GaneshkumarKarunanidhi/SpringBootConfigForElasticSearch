package com.connect.elasticSearchConnectSample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.elc.ElasticsearchConfiguration;

@Configuration
public class ElasticSearchConfig extends ElasticsearchConfiguration {
	
	@Value("${spring.elasticsearch.uris}")
	private String elasticSearchURL;
	
	@Value("${spring.elasticsearch.username}")
	private String userName;
	
	@Value("${spring.elasticsearch.password}")
	private String password;

	@Override
	public ClientConfiguration clientConfiguration() {
		return ClientConfiguration.builder()
				.connectedTo(elasticSearchURL)
				.withBasicAuth(userName, password)
				.withConnectTimeout(30)
				.build();
   }

}
