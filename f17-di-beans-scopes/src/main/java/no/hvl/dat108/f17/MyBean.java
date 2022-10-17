package no.hvl.dat108.f17;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;

import java.time.LocalDateTime;

@Component
@RequestScope // Gir et nytt objekt for hver request
//@ApplicationScope // Gir et objekt bare en gang over hele applikasjonen
public class MyBean {

    private final LocalDateTime tid;

    public MyBean() {
        tid = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "tid=" + tid +
                '}';
    }
}
