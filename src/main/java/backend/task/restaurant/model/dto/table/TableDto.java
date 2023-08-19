package backend.task.restaurant.model.dto.table;

import backend.task.restaurant.model.dto.base.BaseDto;
import backend.task.restaurant.model.persistence.entity.table.enums.Area;
import lombok.Getter;
import lombok.Setter;

/**
 * DTO class for Tables.
 *
 * @author Vahe
 */
@Getter
@Setter
public class TableDto extends BaseDto {

    private String name;

    private Integer seatNumber;

    private Area area;

    private boolean reservable;
}
