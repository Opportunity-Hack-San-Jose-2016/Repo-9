package app.android.example.com.commontcents.Data;

/**
 * Created by lab on 7/10/2016.
 */
public class PoolCounter {

    private static int count = 0;

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }

    public int incrementFull() {
        for (int i = 0; i < 10; i++) {
            count++;
        }
        return count;
    }
}
