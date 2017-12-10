package com.task.chapter9.task9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Main {

    public static void main(String[] args) throws IOException {
        URL oracle = new URL("http://www.t-mobile.pl/");
        URLConnection yc = oracle.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();

        //I didn't write a page and login details.
        String data = "user" + ":" + "password";
        String encoding = Base64.getEncoder().encodeToString(
                data.getBytes(StandardCharsets.UTF_8));
        URL myURL = new URL("");
        URLConnection myURLConnection = myURL.openConnection();
        myURLConnection.setRequestProperty("Authorization", encoding);


    }

}
