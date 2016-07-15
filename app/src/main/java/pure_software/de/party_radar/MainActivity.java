package pure_software.de.party_radar;

import android.os.Bundle;
import android.os.Environment;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import pure_software.de.party_radar.memo.UserMemo;
import pure_software.de.party_radar.datasource.UserDataSource;


public class MainActivity extends AppCompatActivity {

    public static final String LOG_TAG = MainActivity.class.getSimpleName();
    private UserDataSource dataSource;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void checkDetails(View view) {
        UserMemo userMemo = new UserMemo(21, 0, 0, "Fuchs", 0001, 0, "Jonathan", "JeyFox");
        Log.d(LOG_TAG, "Inhalt der UserMemo " + userMemo.getName() + " " + userMemo.getPrename() + " " + userMemo.getAge());
        dataSource = new UserDataSource(this);

        Log.i("Information: ", Environment.getDataDirectory().toString());
        Log.d(LOG_TAG, "Die Datenquelle wird geöffnet!");
        dataSource.open();

        Log.d(LOG_TAG, "Die Datenquelle wird geschlossen");
        dataSource.close();
    }
}
