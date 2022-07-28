package hash.hashtable;

public class Main {
    public static void main(String[] args){
        HashTable hashTable = new HashTable(100);
        hashTable.put("1","100");
        hashTable.put("2","200");
        hashTable.put("3","300");
        hashTable.put("4","400");
        hashTable.put("5","500");
        System.out.println(hashTable.get("1"));
        System.out.println(hashTable.get("2"));
        System.out.println(hashTable.get("3"));
        System.out.println(hashTable.get("4"));
        System.out.println(hashTable.get("5"));
    }
}
