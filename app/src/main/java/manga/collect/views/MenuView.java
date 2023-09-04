package manga.collect.views;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import manga.collect.presenters.IMenuPresenter;
import manga.collect.presenters.ViewName;

public class MenuView extends View implements IMenuView {

    private final IMenuPresenter presenter;

    public MenuView(ViewName viewName, IMenuPresenter presenter) {
        super(viewName);

        this.presenter = presenter;

        this.presenter.setView(this);
    }

    @Override
    public void onEnter(ViewName from) {
        presenter.onEnter(from);
    }

    @Override
    public void setMySpaceItems(Iterable<String> items) {
        final Label label = new Label("My Space");
        final VBox itemsBox = new VBox();
        items.forEach(item -> {
            final Button action = new Button(item);
            action.setOnAction(event -> presenter.onItemClicked(item));
            itemsBox.getChildren().add(action);
        });
        getChildren().addAll(
                label,
                itemsBox
        );
    }

    @Override
    public void setOtherItems(Iterable<String> items) {
        final Label label = new Label("Other");
        final VBox itemsBox = new VBox();
        items.forEach(item -> {
            final Button action = new Button(item);
            action.setOnAction(event -> presenter.onItemClicked(item));
            itemsBox.getChildren().add(action);
        });
        getChildren().addAll(
                label,
                itemsBox
        );
    }
}
