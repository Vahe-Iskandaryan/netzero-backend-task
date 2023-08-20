package backend.task.restaurant.model.service.table.impl;

import backend.task.restaurant.model.dto.table.TableDto;
import backend.task.restaurant.model.dto.table.requests.CreateTableRequest;
import backend.task.restaurant.model.dto.table.requests.UpdateTableRequest;
import backend.task.restaurant.model.persistence.entity.table.TableEntity;
import backend.task.restaurant.model.persistence.repository.table.TableRepository;
import backend.task.restaurant.model.service.table.TableService;
import backend.task.restaurant.model.service.table.mapper.TableMapper;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import java.util.List;

/**
 * Implementation of TableService.
 *
 * @author Vahe
 */
@Service
@Slf4j
@Validated
public class TableServiceImpl implements TableService {

    @Autowired
    private TableRepository tableRepository;

    @Autowired
    private TableMapper tableMapper;

    /**
     * Finds all tables.
     *
     * @return
     */
    //For simplicity’s sake a List is used. Pageable and Page classes are preferable for larger data sets.
    @Override
    public List<TableDto> findAll() {
        List<TableEntity> tables = tableRepository.findAll();

        return tableMapper.toDtos(tables);
    }

    /**
     * Finds a table based on given ID.
     *
     * @param id
     * @return
     */
    @Override
    public TableDto find(Long id) {
        TableEntity table = tableRepository.findEntityById(id);

        return tableMapper.toDto(table);
    }

    /**
     * Creates a table based on given Request.
     *
     * @param createTableRequest
     * @return
     */
    @Override
    @Transactional
    public TableDto create(@Valid CreateTableRequest createTableRequest) {
        TableEntity table = tableMapper.toDto(createTableRequest);

        tableRepository.save(table);

        log.info("Table created with ID {}", table.getId());

        return tableMapper.toDto(table);
    }

    /**
     * Updates the table based on given request.
     *
     * @param updateTableRequest
     * @return
     */
    @Override
    @Transactional
    public TableDto update(@Valid UpdateTableRequest updateTableRequest) {
        TableEntity table = tableRepository.findEntityById(updateTableRequest.getId());

        tableMapper.updateEntity(table, updateTableRequest);

        log.info("Table with ID {} has been updated", table.getId());

        return tableMapper.toDto(table);
    }

    /**
     * Deletes the table based on given ID.
     *
     * @param id
     */
    @Override
    @Transactional
    public void delete(Long id) {
        TableEntity table = tableRepository.findEntityById(id);

        tableRepository.delete(table);

        log.info("Table with ID {} has been deleted", id);
    }
}
