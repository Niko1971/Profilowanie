package profilowanie;

import java.util.Map;


public class Profilowanie {
    public String key;
    

    public Profilowanie(String key) {
        this.key = key;
    }

    public static void main(String[] args) {
        try {
            Map map = System.getProperties();
            for (;;) {
                map.put(new Profilowanie("key"), "value");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}