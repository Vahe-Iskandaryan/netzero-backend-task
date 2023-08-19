package backend.task.restaurant.model.service.table;

import backend.task.restaurant.model.dto.table.TableDto;
import backend.task.restaurant.model.dto.table.requests.CreateTableRequest;
import backend.task.restaurant.model.dto.table.requests.UpdateTableRequest;

import java.util.List;

/**
 * Service interface for Tables.
 *
 * @author Vahe
 */
public interface TableService {

    /**
     * Finds all tables.
     *
     * @return
     */
    List<TableDto> findAll();

    /**
     * Finds a table based on given ID.
     *
     * @param id
     * @return
     */
    TableDto find(Long id);

    /**
     * Creates a table based on given Request.
     *
     * @param createTableRequest
     * @return
     */
    TableDto create(CreateTableRequest createTableRequest);

    /**
     * Updates the table based on given request.
     *
     * @param updateTableRequest
     * @return
     */
    TableDto update(UpdateTableRequest updateTableRequest);

    /**
     * Deletes the table based on given ID.
     *
     * @param id
     */
    void delete(Long id);
}
