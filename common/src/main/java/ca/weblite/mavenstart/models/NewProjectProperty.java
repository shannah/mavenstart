package ca.weblite.mavenstart.models;

public class NewProjectProperty {
    private ProjectPropertyDescription propertyType;
    private String value;

    public ProjectPropertyDescription getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(ProjectPropertyDescription propertyType) {
        this.propertyType = propertyType;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
