package uz.itjunior.fasterfood.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

import com.google.firebase.analytics.FirebaseAnalytics;

import uz.itjunior.fasterfood.R;

public class WelcomeScreenActivity extends AppCompatActivity {

    private FirebaseAnalytics mFirebaseAnalytics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_welcome_sreen);

        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(WelcomeScreenActivity.this, MainActivity.class));
                finish();
            }
        }, 500);
    }
}