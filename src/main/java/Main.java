import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
//        try {
//            Document document = Jsoup.connect("https://hh.ru").get();
//            Elements h1 = document.select("head>title");
//            System.out.println(h1);
//        } catch (IOException exception) {
//            exception.getMessage();
//        }

        try {
            Document document = Jsoup.connect("https://ru.wikipedia.org/wiki/Java").get();
            Elements elements = document.select("#mw-content-text > div.mw-parser-output > p:nth-child(8)");
           // System.out.println(elements);
           for(Element element: elements.select("a"))
               System.out.println(element.text());
           String str = "-";
            System.out.println(str.repeat(10));
            System.out.println(elements.select("a").get(2).text());
            System.out.println(str.repeat(10));
            for(Element element: elements.select("sup"))
                System.out.println(element.text());
            System.out.println("-------Ссылки--------");
            for(Element link: elements.select("a"))
            {
                String absHref = link.attr("abs:href");
                System.out.println(absHref);
            }

        } catch (IOException exception) {
            exception.getMessage();
        }
    }
}
