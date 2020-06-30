package ar.afip.mvc;

import java.util.*;
import org.slf4j.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class AfipController {

    private Logger log = LoggerFactory.getLogger(AfipController.class);

    @RequestMapping(value="/lista", method = RequestMethod.GET)
    public @ResponseBody List<Object> getLista() throws Exception{
        try {
            return new ArrayList<>();
        } catch (Exception e) {
            log.error(e.getMessage());
            return null;
        }
    }

    @RequestMapping(value="/", method = RequestMethod.GET)
    //public @ResponseBody ModelAndView getRoot() throws Exception{ TODO: anterior template inicial, comentado para que funcione
    public  String getRoot() {
        return "/";
    }

}