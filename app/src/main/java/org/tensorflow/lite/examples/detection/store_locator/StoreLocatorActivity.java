package org.tensorflow.lite.examples.detection.store_locator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.tensorflow.lite.examples.detection.R;

import java.util.List;

public class StoreLocatorActivity extends AppCompatActivity {
    public static List<String> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store_locator);
        getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,new MapsFragment()).commit();
    }
}