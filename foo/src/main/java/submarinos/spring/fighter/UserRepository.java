package submarinos.spring.fighter;

import org.springframework.data.couchbase.core.query.Dimensional;
import org.springframework.data.couchbase.core.query.View;
import org.springframework.data.geo.Box;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, String> {

  /**
   * Additional custom finder method, backed by an auto-generated N1QL query.
   */
  List<User> findByFirstname(String firstName);

  /**
   * Additional custom finder method, backed by a View that indexes the names.
   */
  @View(designDocument = "user", viewName = "byName")
  List<User> findByLastname(String lastName);

  /**
   * Additional custom finder method, backed by a geospatial view and
   * allowing multi-dimensional queries.
   * You can also query within a Circle or a Polygon.
   */
  @Dimensional(designDocument = "userGeo", spatialViewName = "byLocation")
  List<User> findByLocationWithin(Box cityBoundingBox);

}
