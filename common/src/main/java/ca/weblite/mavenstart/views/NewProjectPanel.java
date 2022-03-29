package ca.weblite.mavenstart.views;

import ca.weblite.mavenstart.models.NewProjectModel;
import ca.weblite.mavenstart.models.NewProjectProperty;
import com.codename1.ui.Container;
import com.codename1.ui.Label;
import com.codename1.ui.TextField;
import com.codename1.ui.layouts.BoxLayout;

import java.util.ArrayList;
import java.util.List;

import static ca.weblite.mavenstart.util.StringHelper.str;

public class NewProjectPanel extends Container {
    private NewProjectModel model;
    private PropertyViewFactory viewFactory = new PropertyViewFactory();
    private List<AbstractPropertyView> propertyViews = new ArrayList<>();

    private TextField
            artifactId,
            groupId;

    private void buildUI() {
        setLayout(BoxLayout.y());
        artifactId = new TextField();
        artifactId.addActionListener(evt->{
            model.setArtifactId(artifactId.getText());
        });
        groupId = new TextField();
        groupId.addActionListener(evt->{
            model.setGroupId(groupId.getText());
        });

        for (NewProjectProperty property : model.getProperties()) {
            propertyViews.add(viewFactory.createView(property));
        }

        add(new Label("Artifact ID")).add(artifactId)
                .add(new Label("Group ID")).add(groupId);

        for (AbstractPropertyView propertyView : propertyViews) {
            add(propertyView);
        }


    }

    public void updateUI() {
        artifactId.setText(str(model.getArtifactId()));
        groupId.setText(str(model.getGroupId()));
        for (AbstractPropertyView propertyView : propertyViews) {
            propertyView.updateUI();
        }


    }




}
