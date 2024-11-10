package com.example.menuexperiment;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        // Set up Toolbar as the app bar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Register TextView for context menu
        registerForContextMenu(textView);
    }

    // Inflate the options menu for the toolbar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    // Handle options menu item clicks
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == R.id.action_settings) {
            textView.setText("Settings selected");
            return true;
        } else if (itemId == R.id.action_about) {
            textView.setText("About selected");
            return true;
        } else if (itemId == R.id.action_share) {
            textView.setText("Share selected");
            return true;
        } else if (itemId == R.id.action_help) {
            textView.setText("Help selected");
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    // Create context menu on long press of TextView
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.main_menu, menu);
        menu.setHeaderTitle("Choose an option");
    }

    // Handle context menu item clicks
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == R.id.action_settings) {
            textView.setText("Settings selected from context menu");
            return true;
        } else if (itemId == R.id.action_about) {
            textView.setText("About selected from context menu");
            return true;
        }
        return super.onContextItemSelected(item);
    }
}
