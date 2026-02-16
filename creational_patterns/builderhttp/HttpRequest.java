package builderhttp;

public class HttpRequest {
    private final String url;
    private final String method;
    private String headers;// could be a map
    private String queryParams;
    private String body;
    private String timeout;
    private String authenticationToken;

    HttpRequest(RequestBuilder builder) {
        this.url = builder.url;
        this.method = builder.method;
        this.headers = builder.headers;
        this.queryParams = builder.queryParams;
        this.body = builder.body;
        this.timeout = builder.timeout;
        this.authenticationToken = builder.authenticationToken;

    }

    public static class RequestBuilder {

        private String url;
        private String method;
        private String headers;
        private String queryParams;
        private String body;
        private String timeout;
        private String authenticationToken;

        public RequestBuilder(String url, String method) {
            this.url = url;
            this.method = method;
        }

        public RequestBuilder setHeader(String headers) {
            this.headers = headers;
            return this;
        }

        public RequestBuilder setQueryParams(String queryParams) {
            this.queryParams = queryParams;
            return this;
        }

        public RequestBuilder setBody(String body) {
            this.body = body;
            return this;
        }

        public RequestBuilder setTimeOut(String timeout) {
            this.timeout = timeout;
            return this;
        }

        public RequestBuilder setAuthToken(String authenticationToken) {
            this.authenticationToken = authenticationToken;
            return this;
        }

        public HttpRequest build() {
            return new HttpRequest(this);
        }
    }
}
