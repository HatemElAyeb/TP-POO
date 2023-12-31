import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        CustomArrayList customList = new CustomArrayList(5);
        customList.add(1);
        customList.add(2);
        customList.add(3);
        System.out.println("CustomArrayList size: " + customList.size());
        customList.add(1, "abc");
        System.out.println("CustomArrayList size: " + customList.size());
        System.out.println("Element at index 1: " + customList.get(1));
        System.out.println("Is 'abc' in the list?\n " + customList.isIn("abc"));
        customList.remove("abc");
        System.out.println("CustomArrayList size: " + customList.size());
        System.out.println("Is 'abc' in the list ?\n " + customList.isIn("Two"));
    }
}