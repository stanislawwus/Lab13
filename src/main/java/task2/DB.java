package task2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
public class DB extends БазаДаних{

    @Getter
    private БазаДаних db;

    public DB() {
        this.db = new БазаДаних();
    }

    public String getUserData() {
        return db.отриматиДаніКористувача();
    }

    public String getStatistics() {
        return db.отриматиСтатистичніДані();
    }

}
