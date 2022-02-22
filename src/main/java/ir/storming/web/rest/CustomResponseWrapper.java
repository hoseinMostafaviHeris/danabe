package ir.storming.web.rest;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Set;

public class CustomResponseWrapper {
    /*"status": "ok",
        "metadata": {
        "message": "ورود با موفقیت انجام شد."
    },*/
    private String status;
    private Object metadata;
    private  Object data;

    @JsonProperty
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty
    public Object getMetadata() {
        return metadata;
    }

    public void setMetadata(Object metadata) {
        this.metadata = metadata;
    }

    @JsonProperty
    public Object getData() {
        return data;
    }


    public void setData(Object data) {
        this.data = data;
    }

    public CustomResponseWrapper(String status, Object metadata,Object[] data) {
        this.status = status;
        this.metadata = metadata;
        this.data = data;
    }
    static class Metadata {

        private String message;

        @JsonProperty
        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public Metadata(String message) {
            this.message = message;
        }
    }
    static class Data {

        private Object data;

        @JsonProperty
        public Object getData() {
            return data;
        }

        public void setData(Object data) {
            this.data = data;
        }



        public Data(Object[]  object) {
            this.data = object;
        }
    }
}
