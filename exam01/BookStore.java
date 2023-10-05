package javaprogramming2.week5.exam01;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class BookStore {
    Scanner scan = new Scanner(System.in);
    //ArrayList<Book> bookList = new ArrayList<>();
    ArrayList<Manageable> sellList = new ArrayList<>();
    void run() {
        readAllBooks("book4.txt");
        printAllBooks();
        search();
    }
    void printAll() {
        for (Manageable m : sellList)
            m.print();
    }

    private void printAllBooks() {
        // TODO Auto-generated method stub
        for (Manageable b : sellList)
            b.print();
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

    void readAllBooks(String filename) {
        Scanner filein = openFile("book4.txt");
        int n = 0;
        Manageable b = null;
        while (filein.hasNext()) {
            n = filein.nextInt();
            if (n == 0)
                break;
            switch (n) {
                case 1:
                    b = new Book();
                    break;
                case 2:
                    b = new EBook();
                    break;
                case 3:
                    b = new ABook();
                    break;
                case 4:
                    b = new Pen();
                    break;
                case 5:
                    b = new Tissue();
                default:
                    break;
            }
            b.read(filein);
            sellList.add(b);
        }
        filein.close();
    }

    void search() {
        String kwd = null;
        while (true) {
            System.out.print(">> ");
            kwd = scan.next();
            for (Manageable b : sellList)
                if (b.matches(kwd))
                    b.print();
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        BookStore store = new BookStore();
        store.run();
        }
    }