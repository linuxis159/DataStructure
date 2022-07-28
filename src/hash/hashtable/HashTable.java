package hash.hashtable;
/*
    1.Key 값 입력
    2.함수에 Key넘겨줌
    3.해시함수에서 나온 결과 % 배열의 길이-> 배열의 인덱스
    4.함수에서 나온 배열 인덱스로 데이터에 접근
    5.충돌시 LinkedList에 데이터 추가 (Separate Chaining)
*/


import java.util.HashMap;
import java.util.LinkedList;

class HashTable {
    LinkedList<Node>[] data;
    HashTable(int size){
        this.data = new LinkedList[size];
    }
    class Node{
        String key;
        String value;
        Node(String key, String value){
            this.key = key;
            this.value = value;
        }
    }

    void put(String key, String value){
        int hashcode = hashFunction(key);
        int index = hashcode % data.length;
        Node node = null;
        //아직 해당 인덱스에 데이터가 들어온적이 없음 (충돌X)
        if(data[index] ==  null)
            data[index] = new LinkedList();

        //이미 해당 인덱스에 데이터가 있음 (충돌O)

        node = searchNodeByKey(data[index], key);
        if(node == null)
            data[index].add(new Node(key,value));
        else
            node.value = value;

    }

    String get(String key){
        LinkedList<Node> list = data[hashFunction(key) % data.length];
        Node node = searchNodeByKey(list, key);
        return node.value;
    }
    Node searchNodeByKey(LinkedList<Node> list, String key){
        if(list == null || list.size() == 0) return null;
        for(Node node : list){
            if(node.key.equals(key)) {
                return node;
            }
        }
        return null;
    }

    int hashFunction(String key){
        return key.length();
    }

}
