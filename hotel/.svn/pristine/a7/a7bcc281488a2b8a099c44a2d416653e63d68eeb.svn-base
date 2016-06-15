package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bwie.entity.Human;
import com.bwie.entity.Page;

public interface HumanMapper {
	
	//列表
	List<Human> getHumanList(Page page);
	
	//总数
	int listCount();
	
	//删除
	void deleteHuman(int humanId);
	
	//添加
	void insertHuman(Human human);
	
	//根据ID找对象
	Human getById(int humanId);
	
	//修改
	void updateHuman(Human human);
   
}