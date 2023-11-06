package javaprogramming2.week9.exam04.mgr;

public interface Factory<T extends Manageable> {
    public T create();
}