package xyz.gabrielcosta.daggerexample;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Gabriel Costa on 06/11/2015.
 * email: gabriel.costa@entelgy.com
 */
public class PreferencesModleImpl implements PreferencesModel {

    public static final String DAGGER_PREF = "DaggerPref";
    public static final int PRIVATE_MODE = 0;
    SharedPreferences preferences;
    SharedPreferences.Editor editor;

    public PreferencesModleImpl(Context context) {
        this.preferences = context.getSharedPreferences(DAGGER_PREF, PRIVATE_MODE);
        editor = this.preferences.edit();
    }

    @Override
    public void createPreference(String pref, String value) {
        editor.putString(pref, value).commit();
    }

    @Override
    public String getPreference(String target) {
        return preferences.getString(target, null);
    }
}
