package manga.collect.views.home;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.util.List;
import java.util.function.Consumer;

public class MangasContainer extends VBox {

    private int itemsCount = 0;

    private final Label titleLbl = new Label();
    private final Button seeMoreBtn = new Button("See more");
    private final HBox firstRow = new HBox();
    private final HBox secondRow = new HBox();

    public MangasContainer(final String title, Consumer<?> seeMoreAction) {
        firstRow.getStyleClass().add("mangasContainer");
        secondRow.getStyleClass().add("mangasContainer");

        titleLbl.setText(title);

        seeMoreBtn.setOnAction(e -> seeMoreAction.accept(null));

        getChildren().addAll(
                titleLbl,
                firstRow,
                secondRow,
                seeMoreBtn
        );
    }

    public void add(HomeMangaView manga) {
        if(itemsCount == 12) {
            return;
        }
        itemsCount++;
        (itemsCount > 6 ? secondRow : firstRow).getChildren().add(manga);
    }

    public void addAll(HomeMangaView... mangas) {
        List.of(mangas).forEach(this::add);
    }

}
