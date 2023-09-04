package manga.collect.models;

import manga.collect.models.manga.CollectionInformations;
import manga.collect.models.manga.ParutionInformations;
import manga.collect.models.manga.StaffInformation;
import manga.collect.models.manga.TitlesInformations;

/**
 * @author cyril
 * @version 1.0
 * @created 30-ao�t-2023 11:27:10
 */
public class Manga {
	private final TitlesInformations titlesInformations;
	private final ParutionInformations parutionInformations;
	private final CollectionInformations collectionInformations;
	private final String synopsis;
	private final String imageUrl;
	private final StaffInformation staffInformation;

    public Manga(
			TitlesInformations titlesInformations,
			ParutionInformations parutionInformations,
			CollectionInformations collectionInformations,
			String synopsis,
			final String imageUrl,
			StaffInformation staffInformation) {
		this.titlesInformations = titlesInformations;
		this.parutionInformations = parutionInformations;
		this.collectionInformations = collectionInformations;
		this.synopsis = synopsis;
		this.imageUrl = imageUrl;
		this.staffInformation = staffInformation;
    }

	public String getImageUrl() {
		return imageUrl;
	}

	public TitlesInformations getTitlesInformations() {
		return titlesInformations;
	}

	public ParutionInformations getParutionInformations() {
		return parutionInformations;
	}

	public CollectionInformations getCollectionInformations() {
		return collectionInformations;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public StaffInformation getStaffInformation() {
		return staffInformation;
	}
}