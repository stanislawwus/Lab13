package task2;

import lombok.Builder;
import lombok.Data;

import java.util.concurrent.atomic.AtomicInteger;

@Data
@Builder
public class Client {

    private static AtomicInteger counter = new AtomicInteger(0);
    private final int id = counter.incrementAndGet();

    private String name;
    private int age;
    private String sex;
    private String email;
}
