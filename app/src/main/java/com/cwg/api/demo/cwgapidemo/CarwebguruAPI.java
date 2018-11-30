package com.cwg.api.demo.cwgapidemo;

public class CarwebguruAPI {

    public static final class Packages {
        public static final String COMMON = "com.softartstudio.carwebguru";
        public static final String SERVICE_LOCATION = "com.softartstudio.carwebguru.gps";
        public static final String SERVICE_MUSIC = "com.softartstudio.carwebguru.music";
    }


    public static final class Actions {
        public final static String API_IN_MEDIA = "in.carwebguru.media";
        public final static String API_IN_TTS = "in.carwebguru.tts";
        public final static String API_IN_LOCATION = "in.carwebguru.location";
        public final static String API_IN_GENERAL = "in.carwebguru.general";
    }


    public static final class Data {
        public final static String CMD = "cmd"; // Command - integer
        public final static String INT = "di"; // 0, 1, 2 ...
        public final static String STRING = "ds"; // "Hello"
        public final static String FLOAT = "df"; // 123.23, 2.6 ...
        public final static String DOUBLE = "dd"; //
    }


    public static final class General {
        public final static int SLEEP_ON = 1;
        public final static int SLEEP_OFF = 2;

        public final static int LOCATION_SERVICE_START = 3;
        public final static int LOCATION_SERVICE_STOP = 4;

        public final static int MEDIA_SERVICE_START = 5;
        public final static int MEDIA_SERVICE_STOP = 6;

        public final static int SHOW_TOAST = 7;

        public final static int CUSTOM_WIDGET = 10; // Custom widget control
    }


    public static final class TTS {
        public final static int SAY_BEGIN = 1;
        public final static int SAY_END = 2;
    }


    public static final class Media {
        public final static int PLAY_PAUSE = 1;
        public final static int PLAY = 2;
        public final static int STOP = 3;
        public final static int PAUSE = 4;
        public final static int NEXT = 5;
        public final static int PREV = 6;
        public final static int RANDOM = 7;  // Toogle (on, off)
        public final static int SEEK = 8;  // for value (0% - 100%)
        public final static int SHOW_PLAYER = 9;  // Show current player GUI
        public final static int PLAY_BY_INDEX = 10; // Play music track by index in list
        public final static int PLAYER_CHANGED = 11; // Recreate player when changed

        public final static int VISUALIZER_ON = 12; // Start visualizer
        public final static int VISUALIZER_OFF = 13; // Stop visualizer

        public final static int VOLUME_INC = 14; // Increase volume
        public final static int VOLUME_DEC = 15; // Decrease volume
        public final static int VOLUME_MUTE = 16; // Mute volume
        public final static int VOLUME_UNMUTE = 17; // Unmute volume
        public final static int VOLUME_SET_PERCENT = 18; // Set Volume in percent (0 - 100)
        public final static int VOLUME_SET_ADDON = 19; // Set Volume Addon (used by Speed)
        public final static int VOLUME_CHANGED = 20; //

        public final static int RESET_TRACK_INFO = 21; // Reset all track information: Title, Artict, Image...

        public final static int PLAYER_STATE_CHANGED = 22; //
        public final static int TRACK_CHANGED = 23; //
        public final static int META_CHANGED = 24; //
        public final static int MUSIC_IMAGE_CHANGED = 25; //

        public final static int SET_TRACKLIST_FROM_STR = 26; // Set tracklist from string with splitter: Const.TRACK_SPLITTER
        public final static int SET_TRACKLIST_INDEX = 27; // set index for play

        public final static int SERVICE_DESTROY = 28;

        public final static int ON_MUSIC_START = 29;
        public final static int ON_MUSIC_END = 30;

        public final static int DELETE_MUSIC_FILE = 31;
        public final static int LIKE_MUSIC_FILE = 32;
        public final static int DISLIKE_MUSIC_FILE = 33;
    }


    public static final class Location {
        public final static int START = 1; // Start GPS listener
        public final static int STOP = 2; // Stop GPS listener
        public final static int RESTART = 3; // Restart GPS

        public final static int FAKE_ON = 4; // Start Fake Speed
        public final static int FAKE_OFF = 5; // Stop Fake Speed

        public final static int MANUAL_TIMER_START = 6;
        public final static int MANUAL_TIMER_STOP = 7;
        public final static int MANUAL_TIMER_TOGGLE = 8;
        public final static int MANUAL_TIMER_RESET = 9;

        public final static int MOVE_START = 10;  // On Car Move Start
        public final static int MOVE_STOP = 11;  // On Car Stop
        public final static int RACE_END = 12;  // On Race End
        public final static int NEW_BEST = 14;  // On New Best Record

        public final static int SET_LAT = 100; // value as double
        public final static int SET_LON = 101; // value as double
        public final static int SET_SPEED_MS = 102; // value as Float (metter in seconds)
        public final static int SET_DIST_TOTAL_KM = 103; // value as float
        public final static int SET_SPEED_MAX = 104; // value as float
        public final static int SET_BEST_100 = 105; // value as float (seconds)
        public final static int SET_BEST_60 = 106; // value as float (seconds)
        public final static int SET_BEST_14 = 107; // value as float (seconds)

        public final static int TRIP_COUNTER_RESET = 108; //


        public final static int GEOCODER_START = 200;
        public final static int GEOCODER_STOP = 201;
        public final static int GEOCODER_UPDATE = 202;

        public final static int WEATHER_START = 220;
        public final static int WEATHER_STOP = 221;
        public final static int WEATHER_UPDATE = 222;

        public final static int SERVICE_DESTROY = 223;
    }


}
