package xyz.gabrielcosta.daggerexample;

/**
 * Created by Gabriel Costa on 06/11/2015.
 * email: gabriel.costa@entelgy.com
 */
public interface PreferencesModel {
    void createPreference(String key, String value);

    String getPreference(String target);
}
