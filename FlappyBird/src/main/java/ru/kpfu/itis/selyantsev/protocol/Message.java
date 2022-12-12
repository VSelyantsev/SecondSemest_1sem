package ru.kpfu.itis.selyantsev.protocol;

import java.util.HashMap;
import java.util.Map;

public class Message {

    private Map<String, String> headers;
    private ProtocolType type;
    private String body;

    public Message() {
        this.headers = new HashMap<>();
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    public ProtocolType getType() {
        return type;
    }

    public void setType(ProtocolType type) {
        this.type = type;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void addHeader(String key, String value) {
        headers.put(key, value);
    }
}
