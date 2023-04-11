package com.lordsdk.helper;

import com.lordsdk.Constants;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpUtils {
    /**
     * @param url is the URI to access resources
     * @return HttpResponse from the API call
     * @throws IOException
     * @throws InterruptedException
     */
    public HttpResponse<String> getHttpResponse(String url) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).header("Authorization", "Bearer " + Constants.AUTH_TOKEN).GET().build();
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpResponse<String> response = null;
        response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        return response;
    }
}
