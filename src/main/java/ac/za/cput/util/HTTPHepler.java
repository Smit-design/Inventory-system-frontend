package ac.za.cput.util;

import org.apache.http.HttpHeaders;
import org.codehaus.jackson.io.UTF8Writer;

import javax.xml.bind.DatatypeConverter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Base64;

public class HTTPHepler {
    private final static HttpClient HTTP_CLIENT = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_2)
            .build();

    //Admin Credentials
    private static String ADMIN_USERNAME="admin";
    private static String ADMIN_PASSWORD="1234";

    //Clerk Credentials
    private static String CLERK_USERNAME="clerk";
    private static String CLERK_PASSWORD="4567";

    public static HttpResponse<String> sendGet(String url) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .GET().uri(URI.create(url))
                .build();

        HttpResponse<String> response = HTTP_CLIENT.send(request, HttpResponse.BodyHandlers.ofString());
        return response;
    }

    public static HttpResponse<String> sendPost(String url, String requestBody) throws IOException, InterruptedException {
        HttpRequest.BodyPublisher publisher = HttpRequest.BodyPublishers.ofString(requestBody);
        HttpRequest request = HttpRequest.newBuilder().POST(publisher).uri(URI.create(url))
                .setHeader(HttpHeaders.AUTHORIZATION, basicAuth(ADMIN_USERNAME, ADMIN_PASSWORD))
                .setHeader(HttpHeaders.CONTENT_TYPE, "application/json")
                .build();
        HttpResponse<String> response = HTTP_CLIENT.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("Status Code: " + response.statusCode());
        System.out.println("Response Body: " + response.body());
        return response;
    }

    private static String basicAuth(String username, String password) throws UnsupportedEncodingException {
        return "Basic " + DatatypeConverter.printBase64Binary((username + ":" + password).getBytes("UTF-8"));
    }
}
