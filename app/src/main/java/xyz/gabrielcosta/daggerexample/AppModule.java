package xyz.gabrielcosta.daggerexample;


import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Modulo, classe que ira prover as intancias a serem injetadas
 * <p/>
 * Created by Gabriel Costa on 06/11/2015.
 * email: gabriel.costa@entelgy.com
 */
@Module(injects = MainActivity.class)
public class AppModule {

    private App app;

    public AppModule(App app) {
        this.app = app;
    }

    /**
     * Metodo que ira prover uma dependencia para que seja injetada
     *
     * @return instancia para dependencia
     */
    @Provides
    @Singleton
    public PreferencesModel getSharedPreferences() {
        return new PreferencesModleImpl(app);
    }
}
