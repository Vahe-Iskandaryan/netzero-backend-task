package backend.task.restaurant.controller.base;

import backend.task.restaurant.model.dto.base.response.ResponseDto;

/**
 * Base class for Controllers.
 *
 * @author Vahe
 */
public class BaseController {

    /**
     * Converts the given data into ResponseDTO
     *
     * @param data
     * @param responseCode
     * @return
     * @param <Data>
     */
    protected <Data> ResponseDto<Data> toResponseDto(Data data, int responseCode) {
        return new ResponseDto<>(data, responseCode);
    }
}
