package com.dao;

import com.entity.ShipincailiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShipincailiaoVO;
import com.entity.view.ShipincailiaoView;


/**
 * 食品材料
 * 
 * @author 
 * @email 
 * @date 2022-02-20 20:52:54
 */
public interface ShipincailiaoDao extends BaseMapper<ShipincailiaoEntity> {
	
	List<ShipincailiaoVO> selectListVO(@Param("ew") Wrapper<ShipincailiaoEntity> wrapper);
	
	ShipincailiaoVO selectVO(@Param("ew") Wrapper<ShipincailiaoEntity> wrapper);
	
	List<ShipincailiaoView> selectListView(@Param("ew") Wrapper<ShipincailiaoEntity> wrapper);

	List<ShipincailiaoView> selectListView(Pagination page,@Param("ew") Wrapper<ShipincailiaoEntity> wrapper);
	
	ShipincailiaoView selectView(@Param("ew") Wrapper<ShipincailiaoEntity> wrapper);
	

}
