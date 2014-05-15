package cn.xuebing.pattern.singleton;

/**
 * 
 * Hungry Man Mode of Singleton Pattern.
 */
public class HungrySingleton {

    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
        // TDDO
    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}
