package pn.sites.site_grabber;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pn.sites.site_grabber.parsers.UrlParser;

import java.util.Arrays;

@Component
@Slf4j
public class CLIRun  implements CommandLineRunner {
   @Autowired
   private UrlParser urlParser;
    @Override
    public void run(String... args) throws Exception {
        log.info("\n\n    ===  START "  );
        urlParser.create( args );
    }
}
