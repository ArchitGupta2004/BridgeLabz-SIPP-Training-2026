interface StreamingService {
    void playMovie(String movieName);
    default void showSubscriptionDetails() {
        System.out.println("Streaming Service: Premium Subscription active.");
    }
}

interface GamingService {
    void playGame(String gameName);
    default void showSubscriptionDetails() {
        System.out.println("Gaming Service: Unlimited Gaming Pass active.");
    }
}

class SmartTV implements StreamingService, GamingService {
    @Override
    public void playMovie(String movieName) {
        System.out.println("Playing Movie: " + movieName);
    }

    @Override
    public void playGame(String gameName) {
        System.out.println("Playing Game: " + gameName);
    }

    @Override
    public void showSubscriptionDetails() {
        StreamingService.super.showSubscriptionDetails();
        GamingService.super.showSubscriptionDetails();
        System.out.println("SmartTV: All subscriptions managed centrally.");
    }
}

public class SmartTVSystem {
    public static void main(String[] args) {
        SmartTV tv = new SmartTV();
        String[] movies = {"Inception", "The Matrix"};
        String[] games = {"Cyberpunk 2077", "Elden Ring"};
        
        tv.showSubscriptionDetails();
        
        System.out.println("--- Movies ---");
        for (String movie : movies) {
            tv.playMovie(movie);
        }
        
        System.out.println("--- Games ---");
        for (String game : games) {
            tv.playGame(game);
        }
    }
}
