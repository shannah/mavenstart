package ca.weblite.mavenstart.models;

import java.util.ArrayList;
import java.util.List;

public class ProjectType {
    private String id;
    private String archetypeGroupId;
    private String archetypeArtifactId;
    private String archetypeVersion;
    private String imageUrl;
    private List<ProjectPropertyDescription> properties = new ArrayList<ProjectPropertyDescription>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getArchetypeGroupId() {
        return archetypeGroupId;
    }

    public void setArchetypeGroupId(String archetypeGroupId) {
        this.archetypeGroupId = archetypeGroupId;
    }

    public String getArchetypeArtifactId() {
        return archetypeArtifactId;
    }

    public void setArchetypeArtifactId(String archetypeArtifactId) {
        this.archetypeArtifactId = archetypeArtifactId;
    }

    public String getArchetypeVersion() {
        return archetypeVersion;
    }

    public void setArchetypeVersion(String archetypeVersion) {
        this.archetypeVersion = archetypeVersion;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void addProjectProperty(ProjectPropertyDescription property) {
        properties.add(property);
    }


}
