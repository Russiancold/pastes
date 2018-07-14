package pastes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pastes.entities.Paste;

import java.util.Optional;

@Repository
public interface PastesRepository extends CrudRepository<Paste, Long> {
    Optional<Paste> findById(Long id);
}