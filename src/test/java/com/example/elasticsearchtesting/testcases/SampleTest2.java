package com.example.elasticsearchtesting.testcases;

import com.example.elasticsearchtesting.base.ElasticBaseConfiguration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SampleTest2 extends ElasticBaseConfiguration {

    @Test
    @DisplayName("sample testcase 3")
    public void testCase3() {
        Assertions.assertEquals(1, 1);
    }

    @Test
    @DisplayName("sample testcase 4")
    public void testCase4() {
        Assertions.assertEquals(1, 1);
    }


}
