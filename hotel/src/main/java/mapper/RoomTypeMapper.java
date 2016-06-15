package mapper;

import com.bwie.entity.RoomType;

public interface RoomTypeMapper {
    int deleteByPrimaryKey(Integer roomtypeId);

    int insert(RoomType record);

    int insertSelective(RoomType record);

    RoomType selectByPrimaryKey(Integer roomtypeId);

    int updateByPrimaryKeySelective(RoomType record);

    int updateByPrimaryKey(RoomType record);
}