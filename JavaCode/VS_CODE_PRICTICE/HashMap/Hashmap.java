import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
 
        /*
         * Note
         * >> in Hashmap dublicate are not allow
         * >> it is used to util packege
         * >> it have two attributes keys and values
         * >> keys are unique
         * >> to check size of hash map to use size() method
         * >> if dublicate key found the latest value will consider
         */

        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        // add hash map element using >> put keyword
        hm.put(11, "india");
        hm.put(12, "india12");
        hm.put(13, "india13");
        hm.put(11, "india14");
        hm.put(14, "bihar");
        hm.put(15, "punjab");
        hm.put(17, "india");
        System.out.println(hm);
        System.out.println(hm.size());

        // // remove or delete hash map elements using >> remove keyword
        // hm.remove(11, "india14");
        // System.out.println(hm);
        // System.out.println(hm.size());

    }

}
