package ca.weblite.mavenstart.models;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class NewProjectModel {
    private ProjectType type;
    private String artifactId;
    private String groupId;
    private String version;
    private final Map<String, NewProjectProperty> properties = new LinkedHashMap<>();


    public ProjectType getType() {
        return type;
    }

    public void setType(ProjectType type) {
        this.type = type;
    }

    public String getArtifactId() {
        return artifactId;
    }

    public void setArtifactId(String artifactId) {
        this.artifactId = artifactId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public NewProjectProperty getProperty(String propertyName) {
        return properties.get(propertyName);
    }

    public Collection<NewProjectProperty> getProperties() {
        return new LinkedHashSet<NewProjectProperty>(properties.values());
    }
}
