package ca.weblite.mavenstart.views;

import ca.weblite.mavenstart.models.NewProjectProperty;
import com.codename1.ui.Component;
import com.codename1.ui.Container;
import com.codename1.ui.Label;
import com.codename1.ui.layouts.BorderLayout;

public abstract class AbstractPropertyView extends Container {

    private NewProjectProperty model;
    private Label label;

    public AbstractPropertyView(NewProjectProperty model) {
        this.model = model;
    }

    private void buildUI() {
        setLayout(new BorderLayout());
        Component field = createFieldComponent();
        label = new Label();
        add(BorderLayout.NORTH, label);
        add(BorderLayout.CENTER, field);


    }

    public void updateUI() {
        label.setText(model.getPropertyType().getLabel());
        setText(model.getValue());
    }

    public abstract void setText(String value);
    public abstract String getText();
    protected abstract Component createFieldComponent();
}
