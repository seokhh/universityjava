package javaprogramming2.week4.exam01;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Bookstore {
    Scanner scan = new Scanner(System.in);
    ArrayList<Book> booklist = new ArrayList<>();
    void run(){
        readAllBooks("book입력파일1.txt");
        printAllBooks();
    }
    void readAllBooks(String filename) {
        Scanner filein = openFile(filename);
        Book book;
        while (filein.hasNext()){
            book = new Book();
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
    public static void main(String[] args){
        Bookstore store = new Bookstore();
        store.run();
    }
}