package builderhttp;

public class Main {

    public static void main(String args[]) {
        HttpRequest.RequestBuilder builder = new HttpRequest.RequestBuilder("localhost", "post");

        HttpRequest request = builder.setHeader("json").setTimeOut("100ms").build();

    }
}
