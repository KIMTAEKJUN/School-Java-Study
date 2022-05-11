package crawling;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class webtoonCrawling {
    public static void main(String[] args) {
        String url = "https://comic.naver.com/webtoon/detail?titleId=747269&no=102&weekday=wed";

        try {
            Document doc = Jsoup.connect(url).get();
            // System.out.println(doc);

            Elements img = doc.select("#comic_view_area > div.wt_viewer > img"); // ArrayList<Elements>
            System.out.println(img);

            for (int i=0; i<img.size(); i++) {
                String src = img.get(i).attr("src");

                URL wturl = new URL(src);
                HttpURLConnection conn = (HttpURLConnection)wturl.openConnection();

                conn.setRequestProperty("Referer", src);
                BufferedImage bimg = ImageIO.read(conn.getInputStream());

                FileOutputStream out = new FileOutputStream("/Users/kimtaekjun/GitHub/School_Java_Study/ip2022/src/crawling/data/IMAGE101_" + (i + 1) + ".jpg");
                ImageIO.write(bimg, "jpg", out);
            }
            System.out.println(img.size() + "개 크롤링 완료 ! !");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
