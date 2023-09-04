package manga.collect.presenters;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class GoToArgs {
    private final SortedMap<String, String> filterValue = new TreeMap<>();

    public GoToArgs(final String filter, final String value) {
        this.filterValue.put(filter, value);
    }

    public GoToArgs(Map<String, String> filters) {
        filterValue.putAll(filters);
    }

    public String getValue() {
        return filterValue.get(filterValue.firstKey());
    }
}
