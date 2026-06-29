interface TextModeration {
    boolean checkText(String post);
    default void displayModerationPolicy() {
        System.out.println("Policy: Text must not contain offensive words.");
    }
    static boolean containsRestrictedWords(String post) {
        String[] restricted = {"badword", "offensive", "hate"};
        String lowerPost = post.toLowerCase();
        for (String word : restricted) {
            if (lowerPost.contains(word)) {
                return true;
            }
        }
        return false;
    }
}

interface SpamDetection {
    boolean isSpam(String post);
    default void displayModerationPolicy() {
        System.out.println("Policy: Posts must not be repetitive spam.");
    }
}

class ContentModerator implements TextModeration, SpamDetection {
    @Override
    public boolean checkText(String post) {
        return !TextModeration.containsRestrictedWords(post);
    }

    @Override
    public boolean isSpam(String post) {
        return post.toLowerCase().contains("buy now") || post.toLowerCase().contains("click here");
    }

    @Override
    public void displayModerationPolicy() {
        TextModeration.super.displayModerationPolicy();
        SpamDetection.super.displayModerationPolicy();
    }
}

public class ContentModerationSystem {
    public static void main(String[] args) {
        ContentModerator moderator = new ContentModerator();
        String[] posts = {
            "Hello world, having a great day!",
            "Click here to buy now!",
            "This is a hate speech post.",
            "I love programming in Java."
        };

        moderator.displayModerationPolicy();
        System.out.println("---------------------------------");

        for (String post : posts) {
            System.out.println("Post: \"" + post + "\"");
            if (moderator.isSpam(post)) {
                System.out.println("-> Identified as: SPAM");
            } else if (!moderator.checkText(post)) {
                System.out.println("-> Identified as: OFFENSIVE");
            } else {
                System.out.println("-> Identified as: VALID");
            }
        }
    }
}
