package app.android.example.com.commontcents;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBarDrawerToggle;

/**
 * Created by lab on 7/9/2016.
 */
public class HomeScreen extends Activity {

    private ActionBarDrawerToggle drawerToggle;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen);

    }

}
