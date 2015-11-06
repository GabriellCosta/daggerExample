package xyz.gabrielcosta.daggerexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    public static final String PREF_KEY = "test";

    /**
     * Interface a ser Injetada
     */
    @Inject
    PreferencesModel preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        App application = (App) this.getApplication();
        application.getObjectGraph().inject(this);

        preferences.createPreference(PREF_KEY, "Valor present na preference");

        Toast.makeText(getApplicationContext(), preferences.getPreference(PREF_KEY), Toast.LENGTH_LONG).show();

    }
}
