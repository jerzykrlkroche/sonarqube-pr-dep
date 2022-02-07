package hello;

import org.joda.time.LocalTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld {

    private static final Logger logger = LoggerFactory.getLogger(HelloWorld.class);

    public static void main(String[] args) {
        LocalTime currentTime = new LocalTime();
        if (logger.isInfoEnabled()) {
            logger.info("The current local time is: {}", currentTime);
        }

        Greeter greeter = new Greeter();
        if (logger.isInfoEnabled()) {
            logger.info(greeter.sayHello());
        }
    }
}