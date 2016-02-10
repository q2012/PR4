package com.google.training.helloworld;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HelloClass {
    public String message = "Hello World";

    public HelloClass () {
    }

    public HelloClass (String name) {
        this.message = "Hello " + name + "!";
    }
    
    public HelloClass (String name, String period) {
        this.message = "Hello " + name + "! "+period;
    }

    public HelloClass(int i)
    {
    	this.message=""+i;
	}

	public String getMessage() {
        return message;
    }
}
