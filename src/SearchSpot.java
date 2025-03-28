import java.util.List;

public class SearchSpot {
    private String name;
    private boolean searched;
    private List<Item> hiddenItems;

    public SearchSpot(String name, List<Item> hiddenItems) {
        this.name = name;
        this.hiddenItems = hiddenItems;
        this.searched = false;
    }

    public String getName() {
        return name;
    }

    public boolean isSearched() {
        return searched;
    }

    public List<Item> search() {
        if (!searched) {
            searched = true;
            return hiddenItems;
        }
        return null;
    }
}



