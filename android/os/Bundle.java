package android.os;

import java.util.HashMap;

public class Bundle {
    private HashMap<String, Integer> hashMap;

    public Bundle() {
        hashMap = new HashMap<>();
    }

    public void putInt(String key, int value) {
        hashMap.put(key, value);
    }

    public int getInt(String key) {
        Integer value = hashMap.get(key);
        return value != null ? value : 0;
    }
}
