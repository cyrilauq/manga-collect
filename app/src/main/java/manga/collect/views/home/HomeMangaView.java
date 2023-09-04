package manga.collect.views.home;

import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import manga.collect.viewmodels.MangaDescriptionViewModel;

import java.util.function.Consumer;

public class HomeMangaView extends VBox {

    public HomeMangaView(final MangaDescriptionViewModel manga, final Consumer<String> action) {
        getStyleClass().add("homeMangaView");
        getChildren().addAll(
                new Label(manga.getTitle() + " (" + manga.getYearParutionVf() + ")"),
                new ImageView()
        );
        setOnMouseClicked(event -> action.accept(manga.getIsbn()));
    }

}
