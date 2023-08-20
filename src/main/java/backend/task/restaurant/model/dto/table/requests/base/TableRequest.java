package backend.task.restaurant.model.dto.table.requests.base;

import backend.task.restaurant.model.persistence.entity.table.enums.Area;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

/**
 * CreateTableRequest class.
 *
 * @author Vahe
 */
@Getter
@Setter
public class TableRequest {

    @NotEmpty
    private String name;

    @Positive
    private Integer seatNumber;

    @NotNull
    private Area area;

    private boolean reservable;
}
