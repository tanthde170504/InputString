package view;

import java.util.HashMap;
import java.util.Map;

public class View {
    public void display(HashMap<String, ?> result) {
        for (Map.Entry<String, ?> entry : result.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}