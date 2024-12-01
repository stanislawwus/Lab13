package task2;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
public class Auth {

    private Авторизація auth;

    public Auth() {
        this.auth = new Авторизація();
    }

    public boolean authorise(DB db) {
        return auth.авторизуватися(db.getDb());
    }

}
