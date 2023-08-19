package backend.task.restaurant.model.persistence.repository;

import backend.task.restaurant.model.persistence.entity.base.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * Base interface for all repositories.
 *
 * @author Vahe
 */
@NoRepositoryBean
public interface BaseRepository<E extends BaseEntity> extends JpaRepository<E, Long> {

    /**
     * Finds the entity by the given ID
     *
     * @param id
     * @return
     */
    default E findEntityById(Long id) {
        return findById(id).orElseThrow(() -> new RuntimeException("No entity with ID " + id));
    }
}
