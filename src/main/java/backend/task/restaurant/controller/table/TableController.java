package backend.task.restaurant.controller.table;

import backend.task.restaurant.controller.base.BaseController;
import backend.task.restaurant.model.dto.base.response.ResponseDto;
import backend.task.restaurant.model.dto.table.TableDto;
import backend.task.restaurant.model.dto.table.requests.CreateTableRequest;
import backend.task.restaurant.model.dto.table.requests.UpdateTableRequest;
import backend.task.restaurant.model.service.table.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller class for Tables.
 *
 * @author Vahe
 */
@RestController
@RequestMapping("/tables")
public class TableController extends BaseController {

    @Autowired
    private TableService tableService;

    /**
     * Finds all Tables.
     *
     * @return
     */
    @GetMapping
    public ResponseDto<List<TableDto>> findAll() {
        return toResponseDto(tableService.findAll(), HttpStatus.OK.value());
    }

    /**
     * Finds the Table with given ID.
     *
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public ResponseDto<TableDto> find(@PathVariable("id") Long id) {
        return toResponseDto(tableService.find(id), HttpStatus.OK.value());
    }

    /**
     * Creates a Table based on given CreateRequest.
     *
     * @param createTableRequest
     * @return
     */
    @PostMapping
    public ResponseDto<TableDto> create(@RequestBody CreateTableRequest createTableRequest) {
        return toResponseDto(tableService.create(createTableRequest), HttpStatus.CREATED.value());
    }

    /**
     * Updates the Table based on given UpdateRequest.
     *
     * @param id
     * @param updateTableRequest
     * @return
     */
    @PutMapping("/{id}")
    public ResponseDto<TableDto> update(@PathVariable("id") Long id, @RequestBody UpdateTableRequest updateTableRequest) {
        updateTableRequest.setId(id);

        return toResponseDto(tableService.update(updateTableRequest), HttpStatus.OK.value());
    }

    /**
     * Deletes the Table with the given ID.
     *
     * @param id
     */
    @DeleteMapping("/{id}")
    public ResponseDto<Long> delete(@PathVariable("id") Long id) {
        tableService.delete(id);
        return toResponseDto(id, HttpStatus.NO_CONTENT.value());
    }
}
