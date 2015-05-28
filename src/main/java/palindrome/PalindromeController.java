package palindrome;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PalindromeController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/check")
    public PalindromeCheck greeting(@RequestParam(value="word", defaultValue="") String name) {
        return new PalindromeCheck(counter.incrementAndGet(), name);
    }

}
