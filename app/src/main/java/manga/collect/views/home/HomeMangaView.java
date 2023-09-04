package manga.collect.views.home;

import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import manga.collect.presenters.GoToArgs;
import manga.collect.presenters.ViewName;
import manga.collect.viewmodels.MangaDescriptionViewModel;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class HomeMangaView extends VBox {

    public HomeMangaView(final MangaDescriptionViewModel manga, final Consumer<String> action) {
        getStyleClass().add("homeMangaView");
        getChildren().addAll(
                new Label(manga.getTitle())
        );
        setOnMouseClicked(event -> action.accept(manga.getIsbn()));
    }

}
