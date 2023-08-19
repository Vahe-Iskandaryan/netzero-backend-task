package backend.task.restaurant.model.service.table.mapper;

import backend.task.restaurant.model.dto.table.TableDto;
import backend.task.restaurant.model.dto.table.requests.CreateTableRequest;
import backend.task.restaurant.model.dto.table.requests.UpdateTableRequest;
import backend.task.restaurant.model.persistence.entity.table.TableEntity;
import backend.task.restaurant.model.service.base.mapper.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

/**
 * Mapper class for Tables.
 *
 * @author Vahe
 */
@Mapper(componentModel = "spring")
public abstract class TableMapper extends BaseMapper<TableDto, TableEntity> {


    /**
     * Creates a TableEntity based on the given CreateRequest.
     *
     * @param createTableRequest
     * @return
     */
    public abstract TableEntity toDto(CreateTableRequest createTableRequest);

    /**
     * Updates the TableEntity based on given UpdateRequest.
     *
     * @param table
     * @param updateTableRequest
     */
    @Mapping(target = "id", ignore = true)
    public abstract void updateEntity(@MappingTarget TableEntity table, UpdateTableRequest updateTableRequest);
}
