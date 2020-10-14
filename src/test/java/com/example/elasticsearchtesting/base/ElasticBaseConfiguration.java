package com.example.elasticsearchtesting.base;

import org.apache.http.HttpHost;
import org.elasticsearch.client.Requests;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public abstract class ElasticBaseConfiguration {

    private static final Logger LOGGER = LoggerFactory.getLogger(ElasticBaseConfiguration.class);
    protected static RestHighLevelClient restHighLevelClient;


    @BeforeAll
    public static void setUp() throws IOException {

        LOGGER.info("setUp started for test-class : {}", ElasticBaseConfiguration.class.getCanonicalName());

        restHighLevelClient = buildClient();
        final boolean testing = restHighLevelClient.indices().create(Requests.createIndexRequest("testing")).isAcknowledged();
        if (testing) {
            System.out.println("index created");
        }
    }


    @AfterAll
    public static void tearDown() throws IOException {
        LOGGER.info("tearDown started for test-class : {}", ElasticBaseConfiguration.class.getCanonicalName());

        boolean isDeleted = restHighLevelClient.indices().delete(Requests.deleteIndexRequest("testing")).isAcknowledged();
        if (isDeleted) {
            LOGGER.info("Index deleted successfully");
        }

        restHighLevelClient.close();
    }

    private static RestHighLevelClient buildClient() {
        try {
            restHighLevelClient = new RestHighLevelClient(
                    RestClient.builder(
                            new HttpHost("localhost", 9200, "http")));

        } catch (Exception e) {
            LOGGER.error(e.getMessage());
        }
        return restHighLevelClient;
    }
}
