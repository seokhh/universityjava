package javaprogramming2.week7.exam02;

public interface Factory <T extends Manageable> {
    public T create();
}