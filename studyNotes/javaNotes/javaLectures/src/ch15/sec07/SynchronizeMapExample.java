package ch15.sec07;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizeMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = Collections.synchronizedMap(new HashMap<>());
    }
}
