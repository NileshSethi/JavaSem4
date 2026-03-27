abstract class libraryitem {
    private String itemid;
    private String title;
    protected boolean isreserved;

    public libraryitem(String itemid, String title) {
        this.itemid = itemid;
        this.title = title;
        this.isreserved = false;
    }

    public String getitemid() {
        return itemid;
    }

    public String gettitle() {
        return title;
    }

    public void showDetails() {
        System.out.println("id: " + itemid + "| title: " + title);
    }

    public abstract void processloan();
}


class textbook extends libraryitem {

    public textbook(String itemid, String title) {
        super(itemid, title);
    }
    public void processloan() {
        if (!isreserved) {
            isreserved = true;
            System.out.println("textbook " + gettitle() + " issued for blah blah days");
        } else {
            System.out.println("error: " + gettitle() + " is already on loan");
        }
    }
}

class researchpaper extends libraryitem {

    public researchpaper(String itemid, String title) {
        super(itemid, title);
    }
    public void processloan() {
        System.out.println("Generating secure PDF download link... ");
    }
}


public class extra6 {   
    public static void main(String[] args) {
        libraryitem book = new textbook("b2221", "java core");
        book.processloan();
        book.processloan();
        libraryitem paper = new researchpaper("r23212", "ml research");
        paper.processloan();
    }
}
