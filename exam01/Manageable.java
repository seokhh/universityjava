package javaprogramming2.week7.exam01;

import java.util.Scanner;

public interface Manageable {
    public void read(Scanner scan);
    public void print();
    public boolean matches(String kwd);
}