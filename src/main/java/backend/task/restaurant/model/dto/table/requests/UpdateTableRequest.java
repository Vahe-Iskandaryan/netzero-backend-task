package backend.task.restaurant.model.dto.table.requests;

import backend.task.restaurant.model.persistence.entity.table.enums.Area;
import lombok.Getter;
import lombok.Setter;

/**
 * CreateTableRequest class.
 *
 * @author Vahe
 */
@Getter
@Setter
public class UpdateTableRequest {

    private Long id;

    private String name;

    private Integer seatNumber;

    private Area area;

    private boolean reservable;
}
