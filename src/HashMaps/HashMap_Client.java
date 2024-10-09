package HashMaps;

public class HashMap_Client {
    public static void main(String[] args) {
        Hashmap map=new Hashmap();
        HashMapLinkedList map2=new HashMapLinkedList();
        map.put("Ayushi", "My name is Ayushi");
        map.put("Gungun","Be humble to yourself");
        map.put("Dream","You own it");

        map2.put("Ayushi", "My name is Ayushi");
        map2.put("Gungun","Be humble to yourself");
        map2.put("Dream","You own it");
        System.out.println(map.get("Ayushi"));
        System.out.println(map2.get("Ayushi"));
        System.out.println(map2.toString());
    }

}
