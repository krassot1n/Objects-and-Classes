package pro.sky.java.course1.leson12;

public class Main {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Уильям","Голдинг");
        Autor autor2 = new Autor("Михаил","Булгаков");
        Book book1 = new Book("Повелитель мух",autor1,1954);
        Book book2 = new Book("Мастер и Маргарита",autor2,1966);
        book1.setYear(1955);
        System.out.println("Название - " + book1.getTitle() + ", Автор: " + book1.getAutor().getFirstName() + " " + book1.getAutor().getLastName() + ", Дата публикации: " + book1.getYear());
        System.out.println("Название - " + book2.getTitle() + ", Автор: " + book2.getAutor().getFirstName() + " " + book2.getAutor().getLastName() + ", Дата публикации: " + book2.getYear());



    }
}

