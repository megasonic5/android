package android.os;

import java.util.HashMap;
import java.util.Set;

public class Bundle {
    private HashMap<String, Integer> hashMap;

    public void putInt(String key, int value) {
        hashMap.put(key, value);
    }

    public int getInt(String key) {
        return hashMap.get(key);
    }
}
