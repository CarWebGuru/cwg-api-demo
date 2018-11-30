package com.cwg.api.demo.cwgapidemo;

import android.content.Context;
import android.content.Intent;

public class CwgApiTools {


    public static void sendApiInGeneralCommand(Context ctx, int cmd) {
        Intent intent = new Intent();
        intent.setAction(CarwebguruAPI.Actions.API_IN_GENERAL);
        intent.putExtra(CarwebguruAPI.Data.CMD, cmd);
        ctx.sendBroadcast(intent);
    }


    public static void sendApiInGeneralCommand(Context ctx, int cmd, String text) {
        Intent intent = new Intent();
        intent.setAction(CarwebguruAPI.Actions.API_IN_GENERAL);
        intent.putExtra(CarwebguruAPI.Data.CMD, cmd);
        intent.putExtra(CarwebguruAPI.Data.STRING, text);
        ctx.sendBroadcast(intent);
    }


    public static void sendApiInTTSSay(Context ctx, String text) {
        if (ctx != null) {
            Intent intent = new Intent();
            intent.setAction(CarwebguruAPI.Actions.API_IN_TTS);
            intent.putExtra(CarwebguruAPI.Data.STRING, text);
            ctx.sendBroadcast(intent);
        }
    }


    public static void sendApiInMediaCommand(Context ctx, int cmd) {
        Intent intent = new Intent();
        intent.setAction(CarwebguruAPI.Actions.API_IN_MEDIA);
        intent.putExtra(CarwebguruAPI.Data.CMD, cmd);
        ctx.sendBroadcast(intent);
    }

    public static void sendApiInLocationCommand(Context ctx, int cmd) {
        Intent intent = new Intent();
        intent.setAction(CarwebguruAPI.Actions.API_IN_LOCATION);
        intent.putExtra(CarwebguruAPI.Data.CMD, cmd);
        ctx.sendBroadcast(intent);
    }


    public static void sendApiInGeneralWidget(Context ctx, int wIndex, String txtInfo) {
        Intent intent = new Intent();
        intent.setAction(CarwebguruAPI.Actions.API_IN_GENERAL); // group for CWG API
        intent.putExtra("cmd", 10); // command: update widget
        intent.putExtra("di", wIndex); // set widget index (0..4)
        intent.putExtra("ds", txtInfo); // set text for widget
        ctx.sendBroadcast(intent);
    }

}
