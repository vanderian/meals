package sk.vander.garwan;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import sk.vander.garwan.ui.adapter.ExpandableAdapter;
import sk.vander.garwan.ui.model.ListDetailItem;
import sk.vander.garwan.ui.model.ListGroupItem;
import sk.vander.garwan.ui.model.ListSource;

/**
 * Created by arashid on 21/06/16.
 */
@Module
public class AppModule {

  Application application;

  public AppModule(Application application) {
    this.application = application;
  }

  @Provides @Singleton Application providesApplication() {
    return application;
  }

  @Provides @Singleton ExpandableAdapter<ListGroupItem, ListDetailItem> providesAdpater() {
    return new ExpandableAdapter<>(new ListSource());
  }
}