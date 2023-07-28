package com.example.ariwalport.service;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Document doc = (Document) Jsoup.connect("https://butaairways.az/az/").get();
        Elements elements = doc.getElementsByClass("buta-input-group");


        String s = elements.get(0).toString();
        System.out.println(s);
    }
}
