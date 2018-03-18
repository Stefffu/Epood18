package ee.ut.veebirakendus.epood.repository;

import ee.ut.veebirakendus.epood.bean.Toode;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToodeRepository extends CrudRepository<Toode, Long> {

}