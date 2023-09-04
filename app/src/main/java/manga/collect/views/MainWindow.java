package manga.collect.views;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import manga.collect.presenters.GoToArgs;
import manga.collect.presenters.ViewName;

import java.util.HashMap;
import java.util.Map;

/**
 * @author cyril
 * @version 1.0
 * @created 30-ao�t-2023 11:27:09
 */
public class MainWindow extends Scene implements IViewNavigator {
	private final Map<String, View> views = new HashMap<>();
//	private final Popup popup = new Popup();
	private View currentView;
	private Stage stage;
	private Stage sndStage;
	private Pane root;

	/**
	 * Crée une nouvelle MainWindow avec un Pane et des vues données.
	 *
	 * @param root      Conteneur de départ.
	 * @param views     Vues que l'application devra utiliser.
	 */
	public MainWindow(final Pane root, final View menuView, final View... views) {
		super(root);
		setRoot(root);
		getStylesheets().add(getClass().getResource("/css/styles.css").toExternalForm());
		setMenuView(menuView);
		initViews(views);
		setWidthHandler();
	}

	private void setRoot(Pane root) {
		this.root = root;
		this.root.getChildren().addAll(new Pane(), new Pane());
	}

	private void setWidthHandler() {
		widthProperty().addListener((observable, oldValue, newValue) -> {
			if(currentView != null) {
				currentView.setPrefWidth(newValue.intValue() - 200);
			}
		});
	}

	private void setMenuView(View menuView) {
		setMenuPane(menuView);
		menuView.onEnter(null);
		menuView.setPrefWidth(200);
	}

	private void setCurrentView(View view) {
		this.root.getChildren().set(1, view);
	}

	private void setMenuPane(View menuView) {
		this.root.getChildren().set(0, menuView);
	}

	private void initViews(final View... views) {
		for(final var v : views) {
			// TODO : se documenter sur les références de méthodes.
			currentView = v;
			v.setRouter(viewName -> goTo(viewName));
			v.setRouter((viewName, args) -> goTo(viewName, args));
			v.setShowPopUp(this::setSndView);
			v.setRefresh(this::refreshAll);
			this.views.put(v.getViewName().getViewName(), v);
		}
	}

	private void initSndStage() {
		sndStage = new Stage();
		sndStage.setScene(new Scene(new VBox()));
		sndStage.initOwner(stage);
//		sndStage.getScene().getStylesheets().add(getClass().getResource("/css/styles.css").toExternalForm());
		sndStage.initModality(Modality.WINDOW_MODAL);
		sndStage.setResizable(false);
//		sndStage.setX(105 + Theme.WINDOW_WIDTH);
//		sndStage.setY(100);
	}

	private void setSndView(final ViewName viewName) {
		var found = foundView(viewName.getViewName());
		if(found != null) {
			sndStage.getScene().setRoot(found);
			found.onEnter(currentView == null ? null : currentView.getViewName());
			sndStage.show();
		}
	}

	/**
	 * Permet de voyager d'une vue à une autre.
	 *
	 * @param viewName  Vue vers laquelle on veut aller.
	 *
	 * Source: AI bloc 1 2022 et 2021.
	 */
	public void goTo(final ViewName viewName) {
		var found = foundView(viewName.getViewName());

		found.onEnter(currentView.getViewName());
		currentView.onLeave(found.getViewName());
		setCurrentView(currentView = found);
	}

	@Override
	public void goTo(ViewName viewName, GoToArgs args) {
		var found = foundView(viewName.getViewName());

		found.onEnter(currentView.getViewName(), args);
		currentView.onLeave(found.getViewName());
		this.root.getChildren().set(1, currentView = found);
	}

	private View foundView(final String viewName) {
		var found = views.get(viewName);
		if(found == null) {
			throw new IllegalArgumentException("La fenêtre " + viewName + " n'existe pas.");
		}
		return found;
	}

	/**
	 * Démarre l'application avec la vue donnée.
	 *
	 * @param viewName    Vue à afficher au démarrage de l'application.
	 */
	public void start(final ViewName viewName) {
		goTo(viewName);
	}

	public void setStage(final Stage stage) {
		this.stage = stage;
		for(var v : views.keySet()) {
			views.get(v).setStage(stage);
		}
		initSndStage();
	}

	private void refreshAll(final ViewName fromView) {
		views.keySet().forEach(v -> views.get(v).refresh());
	}
}