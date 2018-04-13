package cr.ac.unadeca.galeria.database;

import android.app.Application;

import com.raizlabs.android.dbflow.config.FlowManager;

/**
 * Created by WiltonTuckerHart on 26/3/2018.
 */

public class galeriaapp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FlowManager.init(this);
    }
}
