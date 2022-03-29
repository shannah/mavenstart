package ca.weblite.mavenstart.models;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class MavenStartConfiguration {
    private Map<String,ProjectType> projectTypes = new LinkedHashMap<>();

    public void addProjectType(ProjectType projectType) {
        projectTypes.put(projectType.getId(), projectType);
    }

    public Collection<ProjectType> getProjectTypes() {
        return new LinkedHashSet<ProjectType>(projectTypes.values());
    }

    public ProjectType getProjectType(String id) {
        return projectTypes.get(id);
    }
}
