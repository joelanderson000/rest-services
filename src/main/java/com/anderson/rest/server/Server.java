package com.anderson.rest.server;

import static spark.Spark.get;
import static spark.Spark.port;

import com.anderson.rest.messages.TestMessage;
import com.google.gson.Gson;

public class Server {

    public static void main(String[] args){
        port(8080);
        Gson gson = new Gson();

        get("/", (request, response) -> "Hello");

        get("/jsonSample", (request, response) -> {
            TestMessage message = new TestMessage();

            return gson.toJson(message);

        });
    }
}
