import java.util.*;

public class SortKey {
    static Map<String, Integer> map = new HashMap<>();
    public static void sortbykey()
    {
        TreeMap<String, Integer> sorted = new TreeMap<>();
        sorted.putAll(map);
        System.out.println("---Sorting In terms of Keys-----Where Keys = Names------");
        sorted.forEach((k,v)-> System.out.println(k +" "+v));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. Of Values: ");
        int n = sc.nextInt();
        System.out.println("Enter The Values: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Age: ");
            Integer age = sc.nextInt();
            map.put(name, age);
        }
        sortbykey();
    }
}
