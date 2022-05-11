package crawling;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class textCrawling {
    public static void main(String[] args) {
        // 1. 원하는 URL 주소 지정
        String URL = "https://n.news.naver.com/mnews/article/047/0002352618?sid=100";

        try {
            // 2. URL에서 전체 구조를 받아온다
            Document doc = Jsoup.connect(URL).get();
            // doc에 저장된 html 소스 코드 출력
            // System.out.println(doc);

            // 3. 원하는 요소만 추출한다.
            Elements title = doc.select("#ct > div.media_end_head.go_trans > div.media_end_head_title > h2 ");
            Elements content = doc.select("#dic_area");

            // 4. 추출한 요소를 변수에 저장하거나 출력한다.
            System.out.println(title.text());
            // System.out.println(content.text());
            System.out.println("------------------------------");

            // 내용을 줄바꿈 출력
            String[] p = content.get(0).text().split("\\. ");

            for (int i=0; i<p.length; i++) {
                System.out.println(p[i] + ".");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
