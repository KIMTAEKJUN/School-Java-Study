package book;

public class Book {
    String title;
    int star;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    static int cnt;

    public Book(String title, int star) {
        this.title = title;
        this.star = star;
        cnt++;
    }

    @Override
    public String toString() {
        return "책 제목 : " + title + "\n책 별점 : " + star;
    }
}
