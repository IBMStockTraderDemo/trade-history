package com.ibm.hybrid.cloud.sample.stocktrader.tradehistory.demo;

import java.io.Serializable;
import javax.json.Json;

public class DemoConsumedMessage implements Serializable{

    private String topic;
    private int partition;
    private long offset;
    private String value;
    private long timestamp;

    public DemoConsumedMessage(String topic, int partition, long offset, String value, long timestamp) {
        this.topic = topic;
        this.partition = partition;
        this.offset = offset;
        this.value = value;
        this.timestamp = timestamp;
    }

    public String getTopic() {
        return topic;
    }

    public int getPartition() {
        return partition;
    }

    public long getOffset() {
        return offset;
    }

    public String getValue() {
        return value;
    }

    public long getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return new StringBuffer().append(encode()).toString();
    }

    public String encode() {
        return Json.createObjectBuilder()
            .add("topic", topic)
            .add("partition", partition)
            .add("offset", offset)
            .add("value", value)
            .add("timestamp", timestamp)
            .build().toString();
    }
}