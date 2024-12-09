package pn.sites.site_grabber.parsers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pn.sites.site_grabber.errors.UrlDataException;
import pn.sites.site_grabber.pg.Page;
import pn.sites.site_grabber.pg.UrlReader;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

@Service
@Slf4j
public class UrlParser {

    @Autowired
    private UrlReader urlReader;
    public Page create(String[] address) throws UrlDataException, IOException {
        if (address.length != 1 ) {
            log.info("\n error in URL ");
            throw new UrlDataException();
        }
        if ( address[0].length() < 8) {
            log.info("\n error in URL ");
            throw new UrlDataException();
        }

        Page pg = new Page();
        pg.setAddress( new URL(address[0]));
        pg.setPgData(urlReader.read(pg));
        log.info(
                "\n PAGE READ \n "+pg .getAddress()
              +  "\n PAGE content \n "+pg .getPgData()
        );
        return pg;
    }
}
