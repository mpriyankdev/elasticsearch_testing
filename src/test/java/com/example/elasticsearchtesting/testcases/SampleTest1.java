package com.example.elasticsearchtesting.testcases;

import com.example.elasticsearchtesting.base.ElasticBaseConfiguration;
import com.example.elasticsearchtesting.base.ElasticBaseDetails;
import org.elasticsearch.action.admin.indices.get.GetIndexRequest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
public class SampleTest1 extends ElasticBaseConfiguration {

    private ElasticBaseDetails elasticBaseDetails;

    @Test
    @DisplayName("check if index exists")
    public void checkIfIndexExists() throws IOException {
        GetIndexRequest getIndexRequest = new GetIndexRequest();
        getIndexRequest.indices("testing");
        final boolean testing = restHighLevelClient.indices().exists(getIndexRequest);
        Assertions.assertEquals(testing, true);
    }

    @Test
    @DisplayName("sample testcase 2")
    public void testCase2() {
        Assertions.assertEquals(1, 1);
    }

    @Override
    protected void setElasticBaseDetails(ElasticBaseDetails elasticBaseDetails) {
        this.elasticBaseDetails = new ElasticBaseDetails("testing", "car");
    }
}
