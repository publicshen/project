package mapper;

import com.bwie.entity.Function;

public interface FunctionMapper {
    int deleteByPrimaryKey(Integer functionid);

    int insert(Function record);

    int insertSelective(Function record);

    Function selectByPrimaryKey(Integer functionid);

    int updateByPrimaryKeySelective(Function record);

    int updateByPrimaryKey(Function record);
}