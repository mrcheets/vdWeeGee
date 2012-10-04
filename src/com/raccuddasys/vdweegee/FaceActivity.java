package com.raccuddasys.vdweegee;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class FaceActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_face);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_face, menu);
        return true;
    }
}
