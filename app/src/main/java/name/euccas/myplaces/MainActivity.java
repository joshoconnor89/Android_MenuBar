package name.euccas.myplaces;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

//MainActivity -- the screen showing all places

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //click the button to start the Place Activity
    //no need override, as no super class method
    public void newActivityOnClick(View V) {
        //Create an Intent, which will be use for PlaceActivity and start the Activity
        Intent intent=new Intent(getApplicationContext(), PlaceActivity.class);
        startActivity(intent);




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu); //get menu items from menu/main.xml
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here
        int id = item.getItemId();
        switch (id) {
            case R.id.action_search:
                return true;
            case R.id.action_settings:
                return true;
            default:
                return super.onOptionsItemSelected(item);
        } // end of switch
    }
}
