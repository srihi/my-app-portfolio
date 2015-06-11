package com.dankira.udacityportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class PortfolioMain extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio_main);
        Log.i("PORTFOLIO", "Application has started....");
        final Button spotifyStreamerBtn = (Button) findViewById(R.id.btn_spotifyStreamer);
        spotifyStreamerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ShowCustomToast((String)spotifyStreamerBtn.getText());
            }
        });

        final Button scoresAppBtn = (Button) findViewById(R.id.btn_scoresApp);

        scoresAppBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ShowCustomToast((String) scoresAppBtn.getText());
            }
        });
        final Button libraryAppBtn = (Button) findViewById(R.id.btn_libraryApp);
        libraryAppBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ShowCustomToast((String)libraryAppBtn.getText());
            }
        });
        final Button buildItBiggerBtn = (Button) findViewById(R.id.btn_buildItBigger);
        buildItBiggerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ShowCustomToast((String)buildItBiggerBtn.getText());
            }
        });

        final Button xyzReaderBtn = (Button) findViewById(R.id.btn_xyzReader);
        xyzReaderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowCustomToast((String)xyzReaderBtn.getText());

            }
        });

        final Button capstoneBtn = (Button) findViewById(R.id.btn_capstone);
        capstoneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ShowCustomToast((String)capstoneBtn.getText());
            }
        });

    }

    private void ShowCustomToast(String textMessage) {
        LayoutInflater inflater = getLayoutInflater();
        View toastLayout = inflater.inflate(R.layout.custom_toast,(ViewGroup) findViewById(R.id.toast_layout_root));

        TextView toastTextView = (TextView) toastLayout.findViewById(R.id.toast_textArea);
        toastTextView.setText("This button will Launch "+textMessage);

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(toastLayout);
        toast.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_portfolio_main, menu);
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
}
