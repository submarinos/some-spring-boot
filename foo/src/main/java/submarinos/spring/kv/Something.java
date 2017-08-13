package submarinos.spring.kv;

import org.springframework.data.annotation.Id;

public class Something {

  @Id
  public String id;

  public String name;

  public long value;
}
