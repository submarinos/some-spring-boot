package submarinos.spring.kv;

import org.springframework.data.keyvalue.repository.KeyValueRepository;

public interface SomethingRepository extends KeyValueRepository<Something, String> {
}
