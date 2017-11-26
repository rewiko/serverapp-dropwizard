package com.serverapp.main;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyApplication extends Application<AppConfiguration> {

    public static final Logger LOGGER = LoggerFactory.getLogger(MyApplication.class);

    public static void main(final String[] args) throws Exception {
        new MyApplication().run(args);
    }

    @Override
    public void run(final AppConfiguration configuration, final Environment environment)
            throws Exception {

        LOGGER.info("Application name: {}", configuration.getAppName());
    }

}
