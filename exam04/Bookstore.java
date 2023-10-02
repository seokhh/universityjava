package javaprogramming2.week4.exam04;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Bookstore {
    Scanner scan = new Scanner(System.in);
    ArrayList<Book> booklist = new ArrayList<>();
    void run(){
        readAllBooks("c:\\java\\book2.txt");
        printAllBooks();
        search();
    }

    void readAllBooks(String filename) {
        Scanner filein = openFile(filename);
        Book book = null;
        int type = 0;
        while (filein.hasNext()){
            type = filein.nextInt();
            switch (type){
                case 1: book = new Book(); break;
                case 2: book = new Ebook(); break;
                default: type = 0; break;
            }
            book.read(filein);
            booklist.add(book);
        }
        filein.close();
    }
    Scanner openFile(String filename){
        Scanner filein = null;
        try {
            filein = new Scanner(new File(filename));
        } catch (IOException e){
            System.out.println("파일 오픈 실패 " + filename);
            System.exit(0);
        }
        return filein;
    }
    void printAllBooks() {
        for (Book b: booklist){
            b.print();
        }
    }
    void search() {
        String kwd = null;
        while (true){
            System.out.print("검색 키워드: ");
            kwd = scan.next();
            if (kwd.contentEquals("end"))
                break;
            for (Book b: booklist)
                if (b.matches(kwd))
                    b.print();
        }
    }
    public static void main(String[] args){
        Bookstore store = new Bookstore();
        store.run();
    }
}