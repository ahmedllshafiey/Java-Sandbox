package Addition;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Collections {

    public static void main(String[] args) {
        // HashSet example
        HashSet<Object> hashSet = new HashSet<>();
        hashSet.add(20);
        hashSet.add(2.8);
        hashSet.add("Ahmed");
        hashSet.add(true);
        hashSet.add(8e78);
        Iterator<Object> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println("HashSet element: " + iterator.next());
        }

        // ArrayList example
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add(14);
        arrayList.add(145.8);
        arrayList.add("Mohamed");
        arrayList.add(false);
        arrayList.add(7e80);
        System.out.println("ArrayList elements:");
        for (Object element : arrayList) {
            System.out.println(element);
        }

        // TreeSet example
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Ali");
        treeSet.add("Mohamed");
        treeSet.add("Ahmed");
        treeSet.add("Esraa");
        System.out.println("TreeSet elements:");
        for (String element : treeSet) {
            System.out.println(element);
        }

        // HashMap example
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(0, "Ahmed");
        hashMap.put(1, "Mohamed");
        hashMap.put(2, "Ali");
        hashMap.put(3, "Esraa");
        hashMap.put(4, "Aly");
        System.out.println("HashMap elements:");
        for (Integer key : hashMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + hashMap.get(key));
        }
    }
}
