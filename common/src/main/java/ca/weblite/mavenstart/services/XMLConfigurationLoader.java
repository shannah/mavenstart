package ca.weblite.mavenstart.services;

import ca.weblite.mavenstart.models.MavenStartConfiguration;
import ca.weblite.mavenstart.models.ProjectPropertyDescription;
import ca.weblite.mavenstart.models.ProjectType;
import ca.weblite.mavenstart.models.PropertyType;
import com.codename1.xml.Element;

import java.io.IOException;
import java.util.ArrayList;

public class XMLConfigurationLoader implements ConfigurationLoader {
    private Element root;

    public XMLConfigurationLoader(Element root) {
        this.root = root;
    }
    @Override
    public void load(MavenStartConfiguration config) throws IOException {
        ArrayList<Element> projectTypes = new ArrayList<Element>(root.getChildrenByTagName("projectTypes"));
        if (projectTypes.isEmpty()) return;
        projectTypes = new ArrayList<Element>(projectTypes.get(0).getChildrenByTagName("projectType"));
        for (Element el : projectTypes) {
            ProjectType projectType = new ProjectType();
            loadProjectType(projectType, el);
            config.addProjectType(projectType);
        }
    }

    private void loadProjectType(ProjectType projectType, Element el) throws IOException {
        projectType.setArchetypeArtifactId(el.getAttribute("archetypeArtifactId"));
        projectType.setArchetypeGroupId(el.getAttribute("archetypeGroupId"));
        projectType.setArchetypeVersion(el.getAttribute("archetypeVersion"));
        projectType.setId(el.getAttribute("id"));

        ArrayList<Element> propertyElements = new ArrayList<Element>(el.getChildrenByTagName("property"));
        for (Element propertyEl : propertyElements) {
            ProjectPropertyDescription property = new ProjectPropertyDescription();
            loadPropertyDescription(property, propertyEl);
            projectType.addProjectProperty(property);
        }
    }

    private void loadPropertyDescription(ProjectPropertyDescription property, Element propertyEl) throws IOException {
        property.setPropertyName(propertyEl.getAttribute("name"));
        property.setLabel(propertyEl.getAttribute("label"));
        if (propertyEl.getAttribute("type") != null) {
            property.setPropertyType(PropertyType.valueOf(propertyEl.getAttribute("type").toUpperCase()));
        }
        property.setRequired("true".equals(propertyEl.getAttribute("required")));
        property.setDefaultValue(propertyEl.getAttribute("default"));
    }
}
