package backend.task.restaurant.model.dto.base.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * ResponseDTO class. It is used for wrapping the data into a ResponseDTO
 *
 * @author Vahe
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDto<Data> {

    private Data data;

    private int responseCode;
}
