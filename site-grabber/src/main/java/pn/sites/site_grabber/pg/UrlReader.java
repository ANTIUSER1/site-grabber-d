package pn.sites.site_grabber.pg;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Service
@Slf4j
public class UrlReader {

    public String read(Page p) throws IOException {
        BufferedReader in = new BufferedReader(
                new InputStreamReader(p.getAddress().openStream()));

        log.info(
                "\n \n OPEN_URL "+p.getAddress()
        );
        StringBuffer sbf=new StringBuffer();
        String inputLine;
        while ((inputLine = in.readLine()) != null)
         sbf.append(inputLine);
        in.close();
    return sbf.toString();
    }
}
