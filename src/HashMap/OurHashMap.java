package HashMap;

import java.util.*;

public class OurHashMap implements Map<Integer,String> {

    LinkedList<Insert>[] repo = new LinkedList[20];

    private class Insert{
        int Key;
        String value;
        public Insert(int key, String value) {
            Key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "Insert{" +
                    "Key=" + Key +
                    '}';
        }
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public String get(Object key) {
        return null;
    }

    @Override
    public String put(Integer key, String value) {
        int index = createHash(key);
        if(repo[index] == null)
            repo[index] = new LinkedList<>();
        Insert entry = new Insert(key,value);

        for (var i:repo[index])
            if(i.Key==key){
                i.value=value;
                return value;}

        repo[index].addLast(entry);
        return value;
    }


    private int createHash(int key){
        return (Objects.hash(key)) % 20;
    }

    @Override
    public String remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends String> m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set<Integer> keySet() {
        return null;
    }

    @Override
    public Collection<String> values() {
        return null;
    }

    @Override
    public Set<Entry<Integer, String>> entrySet() {
        return null;
    }
}
