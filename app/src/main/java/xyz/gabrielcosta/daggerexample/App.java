package xyz.gabrielcosta.daggerexample;

import android.app.Application;

import dagger.ObjectGraph;

/**
 * Classe da aplication, deve ser definida no manifest
 * <p/>
 * Created by Gabriel Costa on 06/11/2015.
 * email: gabriel.costa@entelgy.com
 */
public class App extends Application {

    /**
     * Objeto onde serão guardadas as intancias dos objetos injetados
     */
    ObjectGraph objectGraph;

    @Override
    public void onCreate() {
        super.onCreate();
        //Adiciona o modulo no ObjectGraph
        this.objectGraph = ObjectGraph.create(new AppModule(this));
    }

    /**
     *
     * @return o ObjectGraph
     */
    public ObjectGraph getObjectGraph() {
        return this.objectGraph;
    }


}
