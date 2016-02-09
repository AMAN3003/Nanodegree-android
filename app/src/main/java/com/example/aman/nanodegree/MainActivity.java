package com.example.aman.nanodegree;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;



    public class MainActivity extends ActionBarActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.content_main);

            initButtons();
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
                actionSettings();
                return true;
            }

            return super.onOptionsItemSelected(item);
        }

        private void actionSettings(){
            Toast.makeText(this, "This is Settings", Toast.LENGTH_SHORT).show();
        }

        private void initButtons(){
            initButtonDefault(R.id.button_popmov);
            initButtonDefault(R.id.button_duo1);
            initButtonDefault(R.id.button_duo2);
            initButtonDefault(R.id.button_bigger);
            initButtonDefault(R.id.button_bacon);
            initButtonDefault(R.id.button_capstone);
        }

        private void initButtonDefault(final int idButton){
            Button defaultButton = (Button) findViewById(idButton);
            defaultButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    actionButton(idButton);
                }
            });
        }

        private void actionButton(int idButton){
            switch (idButton){
                case R.id.button_popmov:
                    showProvisionalButtonAction(getString(R.string.app_streamer));
                    break;
                case R.id.button_duo1:
                    showProvisionalButtonAction(getString(R.string.app_football_scores));
                    break;
                case R.id.button_duo2:
                    showProvisionalButtonAction(getString(R.string.app_library));
                    break;
                case R.id.button_bigger:
                    showProvisionalButtonAction(getString(R.string.app_build_it_bigger));
                    break;
                case R.id.button_bacon:
                    showProvisionalButtonAction(getString(R.string.app_XYZReader));
                    break;
                case R.id.button_capstone:
                    showProvisionalButtonAction(getString(R.string.app_capstone));
                    break;
            }
        }

        private void showProvisionalButtonAction(String appName){
            Toast.makeText(this, "This will launch my " + appName + " app.", Toast.LENGTH_SHORT).show();
        }
    }