package collection.MyArrayList;

public interface IMyArrayList<T>{
    void add(T e);
    void remove(T e);
    T get(int index);
    void set(int index, T e);
    int size();
}