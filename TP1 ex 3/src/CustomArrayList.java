import java.util.Arrays;
public class CustomArrayList {
    private Object[] elements;
    private int size;

    public CustomArrayList() {
        this.elements = new Object[10];
        this.size = 0;
    }
    public CustomArrayList(int initialSize) {
        this.elements = new Object[initialSize];
        this.size = 0;
    }
    public void add(Object obj) {
        elements[size++] = obj;
    }
    public void add(int index, Object x) {
        if (index < 0 || index > size) {
            System.out.println("Wrong index");
        }
        for (int i = size - 1; i >= index; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = x;
        size++;
    }
    public Object get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Wrong index");
        }
        return elements[index];
    }
    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public boolean isIn(Object x) {
        return find(x) != -1;
    }
    public int find(Object x) {
        for (int j = 0; j < size; j++) {
            if (elements[j]==x) {
                return j;
            }
        }
        return -1;
    }
    public void remove(Object x) {
        int index = find(x);
        if (index != -1) {
            for (int i = index; i < size - 1; i++) {
                elements[i] = elements[i + 1];
            }
            elements[--size] = null;
        }
    }
}