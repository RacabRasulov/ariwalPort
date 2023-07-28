package com.example.ariwalport.service;

import com.example.ariwalport.repository.PortNameRepository;
import lombok.AllArgsConstructor;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@AllArgsConstructor
public class PortNameService {

public final PortNameRepository repository;
   // @Scheduled(fixedRate = 5000)
    public void hello() throws IOException {
        Document doc = (Document) Jsoup.connect("https://www.butaairways.az/").get();
        Elements elements = doc.getElementsByClass("dropdown-menu");
        String s = elements.get(0).html();
        System.out.println(s);



}
}
