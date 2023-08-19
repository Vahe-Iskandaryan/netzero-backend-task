package backend.task.restaurant.model.service.base.mapper;


import backend.task.restaurant.model.dto.base.BaseDto;
import backend.task.restaurant.model.persistence.entity.base.BaseEntity;

import java.util.List;

/**
 * Base mapper class. Contains general methods for conversion between DTO and Entity objects.
 *
 * @author Vahe
 */
public abstract class BaseMapper<DTO extends BaseDto, Entity extends BaseEntity> {

	/**
	 * Converts Entity to Dto.
	 * @param entity
	 * @return
	 */
	public abstract DTO toDto(Entity entity);
	
	/**
	 * Converts a list of Entities into a list of Dto objects.
	 *
	 * @param entities
	 * @return
	 */
	public abstract List<DTO> toDtos(List<Entity> entities);
}