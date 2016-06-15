package mapper;

import java.util.List;

import com.bwie.entity.Human;

public interface NightAuditorMapper {
	
	/**
	 * 查找房间的价格，账户的余额
	 * @return
	 */
	List<Human> findPriceAndBalance();
}