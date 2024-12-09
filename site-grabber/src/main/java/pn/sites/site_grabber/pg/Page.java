package pn.sites.site_grabber.pg;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.net.URL;
import java.util.List;

@Entity
@Setter
@Getter
@ToString
public class Page {

    @Id
    private long id;
    private URL address;
    //private List<String> pageList;
  private String pgData;

}
