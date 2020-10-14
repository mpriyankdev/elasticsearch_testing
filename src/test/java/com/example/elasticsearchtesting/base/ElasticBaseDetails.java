package com.example.elasticsearchtesting.base;

import java.util.Objects;

public class ElasticBaseDetails {

    private String index;
    private String type;
    private String schema;
    private Integer shards;
    private Integer replicas;

    public ElasticBaseDetails(String index, String type, String schema, Integer shards, Integer replicas) {
        this.index = index;
        this.type = type;
        this.schema = schema;
        this.shards = shards;
        this.replicas = replicas;
    }

    public ElasticBaseDetails() {
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public Integer getShards() {
        return shards;
    }

    public void setShards(Integer shards) {
        this.shards = shards;
    }

    public Integer getReplicas() {
        return replicas;
    }

    public void setReplicas(Integer replicas) {
        this.replicas = replicas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ElasticBaseDetails that = (ElasticBaseDetails) o;
        return Objects.equals(index, that.index) &&
                Objects.equals(type, that.type) &&
                Objects.equals(schema, that.schema) &&
                Objects.equals(shards, that.shards) &&
                Objects.equals(replicas, that.replicas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(index, type, schema, shards, replicas);
    }
}
