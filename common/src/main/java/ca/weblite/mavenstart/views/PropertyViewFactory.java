package ca.weblite.mavenstart.views;

import ca.weblite.mavenstart.models.NewProjectProperty;

public class PropertyViewFactory {
    public AbstractPropertyView createView(NewProjectProperty property) {
        switch (property.getPropertyType().getPropertyType()) {
            case TEXTFIELD: return new TextFieldPropertyView(property);
            default:
                throw new IllegalArgumentException("Unsupported property type "+property.getPropertyType().getPropertyType());
        }
    }
}
