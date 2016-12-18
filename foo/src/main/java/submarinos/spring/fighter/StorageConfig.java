package submarinos.spring.fighter;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;

import java.util.Collections;
import java.util.List;

@Configuration
@EnableCouchbaseRepositories
public class StorageConfig extends AbstractCouchbaseConfiguration {

  @Override
  protected List<String> getBootstrapHosts() {
    return Collections.singletonList("couch");
  }

  @Override
  protected String getBucketName() {
    return "default";
  }

  @Override
  protected String getBucketPassword() {
    return "";
  }
}
