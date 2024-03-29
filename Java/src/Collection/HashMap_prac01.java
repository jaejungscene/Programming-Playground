package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.function.IntFunction;


class MyInteger{
    Integer v;

    MyInteger(Integer v) {
        this.v = v;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}

/**
 * -- How HashMap works in java (https://www.digitalocean.com/community/tutorials/java-hashmap#how-hashmap-works-in-java) --
 * hashCode is used to check if there is already a key with same hashCode or not.
 * If there is an existing key with same hashCode, then equals() method is used on key.
 * If equals returns true, then value is overwritten,
 * otherwise a new mapping is made to this singly linked list bucket.
 */
public class HashMap_prac01 {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(12, "jae");
        hm.put(4, "jung");
        System.out.println(hm);
        System.out.println(hm.get(3)); //null
        System.out.println(hm.get("as")); //null
        System.out.println(hm.get(4));
        hm.put(4, "diff");
        System.out.println(hm);
        System.out.println(new ArrayList<String>(hm.values()));
        System.out.println(Arrays.toString(hm.values().toArray()));
        System.out.println(hm.values().toArray().getClass());
        System.out.println("--------------------");

        HashMap<MyInteger, String> myHm = new HashMap<>();
        MyInteger x1 = new MyInteger(2);
        MyInteger x2 = new MyInteger(41);
        System.out.println(x1.equals(x2));
        myHm.put(x1, "hello");
        myHm.put(x2, "world");
        System.out.println(myHm);
        myHm.put(x2, "jaejung");
        System.out.println(myHm);

        System.out.println(new MyInteger(2).hashCode());
        System.out.println(new MyInteger(41).hashCode());

        HashMap<Integer, Integer> hm3 = new HashMap<>();
        hm3.put(12, 42);
        hm3.put(42, 142);
        int[] array = new int[hm3.size()];
        IntFunction intFunc = (x) -> x;
        array = hm3.values().stream().mapToInt(x->x).toArray();
        System.out.println(array.getClass());

        //.stream().map((x) -> (int)x).toA

    }
}
