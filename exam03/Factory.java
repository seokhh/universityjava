package javaprogramming2.week7.exam03;

public interface Factory <T extends Manageable> {
    public T create();
}