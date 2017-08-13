package submarinos.spring.fighter;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/fighter")
public class FighterController {


  @RequestMapping(method = RequestMethod.GET)
  public ResponseEntity<String> hello() {

    return ResponseEntity.ok("foo? fighter!");
  }
}
