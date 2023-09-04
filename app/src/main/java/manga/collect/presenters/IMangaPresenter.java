package manga.collect.presenters;

import manga.collect.views.IMangaView;

/**
 * @author cyril
 * @version 1.0
 * @created 30-ao�t-2023 11:26:35
 */
public interface IMangaPresenter extends IPresenter {

    void setView(final IMangaView view);

}