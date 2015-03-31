package pl.tajchert.bluetoothpadkey;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;


public class MainActivity extends ActionBarActivity implements View.OnKeyListener {
    private static final String TAG = "MainActivity";
    //RIGHT
    //Y = 100
    //X = 99
    //B = 97
    //A = 96

    //LEFT D-Pad and this funny thing that moves
    //TOP = 19
    //DOWN = 20
    //LEFT = 21
    //RIGHT = 22

    //TOP
    //LEFT
    //L1 = 102
    //L2 = 104
    //RIGHT
    //R1 = 103
    //R2 = 105

    //MENU BUTTON = 108
    //BACK BUTTON = 109
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override public boolean dispatchKeyEvent(KeyEvent event) {
        Log.d(TAG, "onKey : " + event.getKeyCode());
       return true;
    }

    @Override
    public boolean onKey(View v, int keyCode, KeyEvent event) {
        return false;
    }
}
