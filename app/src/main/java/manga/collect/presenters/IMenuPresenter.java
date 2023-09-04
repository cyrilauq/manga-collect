package manga.collect.presenters;

import manga.collect.views.IMenuView;

public interface IMenuPresenter extends IPresenter {

    void onItemClicked(final String item);

    void setView(final IMenuView view);

}
