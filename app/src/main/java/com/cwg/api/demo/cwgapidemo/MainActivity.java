package com.cwg.api.demo.cwgapidemo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClickTTS(View btn) {

        switch (btn.getId()) {

            case R.id.btnSay1:
                CwgApiTools.sendApiInTTSSay(getApplicationContext(), "%date");
                break;

            case R.id.btnSay2:
                CwgApiTools.sendApiInTTSSay(getApplicationContext(), "%time");
                break;

            case R.id.btnSay3:
                CwgApiTools.sendApiInTTSSay(getApplicationContext(), "{Red|Green|Orange|Blue|Yellow|Black|White}");
                break;
        }

    }

    public void onClickMedia(View btn) {

        switch (btn.getId()) {

            case R.id.btnMedia1:
                CwgApiTools.sendApiInMediaCommand(getApplicationContext(), CarwebguruAPI.Media.PLAY_PAUSE);
                break;

            case R.id.btnMedia2:
                CwgApiTools.sendApiInMediaCommand(getApplicationContext(), CarwebguruAPI.Media.NEXT);
                break;

            case R.id.btnMedia3:
                CwgApiTools.sendApiInMediaCommand(getApplicationContext(), CarwebguruAPI.Media.VOLUME_INC);
                break;

            case R.id.btnMedia4:
                CwgApiTools.sendApiInMediaCommand(getApplicationContext(), CarwebguruAPI.Media.VOLUME_DEC);
                break;

        }
    }


    public void onClickGeneral(View btn) {

        switch (btn.getId()) {

            case R.id.btnG1:
                CwgApiTools.sendApiInGeneralCommand(getApplicationContext(), CarwebguruAPI.General.SLEEP_ON);
                break;

            case R.id.btnG2:
                CwgApiTools.sendApiInGeneralCommand(getApplicationContext(), CarwebguruAPI.General.SLEEP_OFF);
                break;

            case R.id.btnG3:
                CwgApiTools.sendApiInGeneralCommand(getApplicationContext(), CarwebguruAPI.General.SHOW_TOAST, "Message from API");
                break;
        }
    }




    public void mess(String txt) {
        Toast.makeText(getApplicationContext(), txt, Toast.LENGTH_SHORT).show();
    }
}
