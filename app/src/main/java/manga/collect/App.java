/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package manga.collect;

import javafx.application.Application;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import manga.collect.infrastructures.IMangaRepository;
import manga.collect.presenters.*;
import manga.collect.repositories.FakeMangaRepository;
import manga.collect.views.*;

import java.util.List;

public class App extends Application {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        launch(args);
    }



    @Override
    public void start(Stage stage) throws Exception {
        MainWindow mainWindow = getMainWindow();
        mainWindow.start(ViewName.HOME_VIEW);

        stage.setTitle("Manga-collect");
        stage.setResizable(true);
        stage.setX(100);
        stage.setY(100);

        stage.setScene(mainWindow);
        mainWindow.setStage(stage);

        stage.show();
    }

    /**
     * Instancie une nouvelle MainWindow
     *
     * @return  Retourne une nouvelle MainWindow avec une Session et un Repository.
     */
    private static MainWindow getMainWindow() {
        final IMangaRepository repository = new FakeMangaRepository();
        return new MainWindow(
                new HBox(),
                new MenuView(ViewName.MENU_VIEW,
                        new IMenuPresenter() {
                            private IMenuView view;

                            @Override
                            public void onEnter(ViewName from) {
                                this.view.setMySpaceItems(List.of(
                                        "My profile",
                                        "My collection",
                                        "My shopping list",
                                        "My next parution",
                                        "Not begon"
                                ));
                                this.view.setOtherItems(List.of(
                                        "Planning",
                                        "Most popular",
                                        "All mangas"
                                ));
                            }

                            @Override
                            public void onLeave(ViewName to) {

                            }

                            @Override
                            public void onEnter(ViewName from, GoToArgs args) {
                                onEnter(from);
                            }

                            @Override
                            public void onLeave(ViewName to, GoToArgs args) {

                            }

                            @Override
                            public void onItemClicked(String item) {

                            }

                            @Override
                            public void setView(IMenuView view) {
                                this.view = view;
                            }
                        }
                ),
                new HomeView(
                        ViewName.HOME_VIEW,
                        new HomePresenter(repository)
                ),
                new MangaView(
                        ViewName.MANGA_VIEW,
                        new MangaPresenter()
                ),
                new SearchView(
                        ViewName.SEARCH_MANGA_VIEW,
                        new ISearchPresenter() {
                            @Override
                            public void goToPage(int pageNumber) {

                            }

                            @Override
                            public void searchFor() {

                            }

                            @Override
                            public void setView(SearchView searchView) {

                            }

                            @Override
                            public void onEnter(ViewName from) {

                            }

                            @Override
                            public void onLeave(ViewName to) {

                            }

                            @Override
                            public void onEnter(ViewName from, GoToArgs args) {

                            }

                            @Override
                            public void onLeave(ViewName to, GoToArgs args) {

                            }
                        }
                )
        );
    }

}
