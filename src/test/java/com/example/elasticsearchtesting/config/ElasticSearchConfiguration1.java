/*
package com.example.elasticsearchtesting.config;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ElasticSearchConfiguration1 {

    private static final Logger LOG = LoggerFactory.getLogger(ElasticSearchConfiguration1.class);

    private RestHighLevelClient restHighLevelClient;

    @Bean(name = "restElasticClient")
    public RestHighLevelClient buildClient() {
        try {
            restHighLevelClient = new RestHighLevelClient(
                    RestClient.builder(
                            new HttpHost("localhost", 9200, "http")));
        } catch (Exception e) {
            LOG.error(e.getMessage());
        }
        return restHighLevelClient;
    }
}

*/
