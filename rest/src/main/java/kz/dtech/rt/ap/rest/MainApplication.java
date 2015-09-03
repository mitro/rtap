package kz.dtech.rt.ap.rest;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;
import kz.dtech.rt.ap.rest.resources.HelloResource;

/**
 * @author Dmitriy Melnik (d.b.melnik@yandex.ru)
 * @since 03.09.2015
 */
public class MainApplication extends Application<MainConfiguration> {

    public static void main(String[] args) throws Exception {
        new MainApplication().run(args);
    }

    @Override
    public void run(MainConfiguration mainConfiguration, Environment environment) throws Exception {
        registerResources(mainConfiguration, environment);
    }

    private void registerResources(MainConfiguration configuration, Environment environment) {
        Injector injector = createInjector(configuration);

        environment.jersey().register(injector.getInstance(HelloResource.class));
    }

    private Injector createInjector(final MainConfiguration configuration) {
        return Guice.createInjector(new AbstractModule() {
            @Override
            protected void configure() {
                bind(MainConfiguration.class).toInstance(configuration);
            }
        });
    }
}
