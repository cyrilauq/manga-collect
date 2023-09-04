package manga.collect.views.home;

import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import manga.collect.viewmodels.MangaDescriptionViewModel;

import java.util.function.Consumer;

public class HomeMangaView extends VBox {

    public HomeMangaView(final MangaDescriptionViewModel manga, final Consumer<String> action) {
        getStyleClass().add("homeMangaView");
        final ImageView vignette = new ImageView(manga.getImgUrl());
        vignette.setFitWidth(130);
        vignette.setFitHeight(180);
        vignette.getStyleClass().add("vignette");
        getChildren().addAll(
                new Label(manga.getTitle() + " (" + manga.getYearParutionVf() + ")"),
                vignette
        );
        setOnMouseClicked(event -> action.accept(manga.getTitle()));
    }

}
