package pro.sky.java.course1.leson12;

public class Book {
    private String title;
    private Autor autor;
    private int year;

    public Book(String title,Autor autor,int year){
        this.title = title;
        this.autor = autor;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public Autor getAutor() {
        return autor;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

