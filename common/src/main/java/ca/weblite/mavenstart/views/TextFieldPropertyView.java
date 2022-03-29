package ca.weblite.mavenstart.views;

import ca.weblite.mavenstart.models.NewProjectProperty;
import com.codename1.ui.Component;
import com.codename1.ui.TextField;

public class TextFieldPropertyView extends AbstractPropertyView {
    private TextField textField;
    public TextFieldPropertyView(NewProjectProperty model) {
        super(model);
    }

    @Override
    public void setText(String value) {
        textField.setText(value);
    }

    @Override
    public String getText() {
        return textField.getText();
    }

    @Override
    protected Component createFieldComponent() {
        textField = new TextField();
        return textField;
    }
}
