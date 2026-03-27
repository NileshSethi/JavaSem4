abstract class media{
    private String title;
    private int duration;
    protected boolean isPremium;
    
    public media(String title , int duration , boolean isPremium){
        this.title = title;
        this.duration = duration;
        this.isPremium = isPremium;
    }
    public String getTitle(){
        return title;
    }

    public String getDetails(){
        return "Title: " + title + ", Duration: " + duration + " mins";
    }

    abstract void playContent();
}

class movie extends media{
    public movie(String title, int duration, boolean isPremium) {
        super(title, duration, isPremium);
    }
    void playContent() {
        if (isPremium) {
            System.out.println("Verifying Subscription... ");
            System.out.println("Playing Movie: " + getTitle());
        } else {
            System.out.println("Please subscribe to watch: " + getTitle());
        }
        
    }
}
class podcast extends media{
    public podcast(String title, int duration){
        super(title, duration, false);
    }

    void playContent(){
        System.out.println("Loading Advertisement... Playing Podcast: " + getTitle());
    }
}
public class extra9 {
    public static void main(String[] args) {
        media[] m = new media[3];

        m[0] = new movie("Inception", 148, true);
        m[1] = new podcast("Tech Talk", 30);
        m[2] = new movie("Free Guy", 115, false);

        for(media x : m){
            x.playContent();
        }
    }
}