package mapper;

import com.bwie.entity.Status;

public interface StatusMapper {
	
	
    int deleteByPrimaryKey(Integer roomstatusId);

    int insert(Status record);

    int insertSelective(Status record);

    Status selectByPrimaryKey(Integer roomstatusId);
    
    int updateByPrimaryKeySelective(Status record);

    int updateByPrimaryKey(Status record);
}