package com.anderson.rest.messages;

import java.util.ArrayList;

public class TestMessage {
    public String title;
    public String message;
    public ArrayList<String> data;

    public TestMessage(){
        title = "Default Title";
        message = "Default Message";
        data = new ArrayList<>();

    }
}
