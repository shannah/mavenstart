package ca.weblite.mavenstart.services;

import ca.weblite.mavenstart.models.MavenStartConfiguration;

import java.io.IOException;

public interface ConfigurationLoader {

    public void load(MavenStartConfiguration config) throws IOException;
}
