package task1;

public class TwitterUserAdapter implements UniUser {

    private final TwitterUser twitterUser;

    public TwitterUserAdapter(TwitterUser twitterUser) {
        this.twitterUser = twitterUser;
    }

    @Override
    public String getEmail() {
        return twitterUser.getUserMail();
    }

    @Override
    public String getCountry() {
        return twitterUser.getCountry();
    }

    @Override
    public String getActiveTime() {
        return twitterUser.getLastActiveTime();
    }
}
