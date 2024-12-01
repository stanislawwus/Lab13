package task1;

public class FacebookUserAdapter implements UniUser {

    private final FacebookUser facebookUser;

    public FacebookUserAdapter(FacebookUser facebookUser) {
        this.facebookUser = facebookUser;
    }

    @Override
    public String getEmail() {
        return facebookUser.getEmail();
    }

    @Override
    public String getCountry() {
        return facebookUser.getUserCountry();
    }

    @Override
    public String getActiveTime() {
        return facebookUser.getUserActivityTime();
    }
}
