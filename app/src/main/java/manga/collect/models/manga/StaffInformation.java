package manga.collect.models.manga;

import java.util.Objects;

public class StaffInformation {
    private final String designer;
    private final String illustrator;
    private final String author;

    public StaffInformation(
            String designer,
            String illustrator,
            String author) {
        this.designer = designer;
        this.illustrator = illustrator;
        this.author = author;
    }

    public String getDesigner() {
        return this.designer;
    }

    public String getIllustrator() {
        return this.illustrator;
    }

    public String getAuthor() {
        return this.author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StaffInformation that)) return false;
        return Objects.equals(getDesigner(), that.getDesigner()) && Objects.equals(getIllustrator(), that.getIllustrator()) && Objects.equals(getAuthor(), that.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDesigner(), getIllustrator(), getAuthor());
    }
}
