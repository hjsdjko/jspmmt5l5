package com.dao;

import com.entity.JiagonggongyiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiagonggongyiVO;
import com.entity.view.JiagonggongyiView;


/**
 * 加工工艺
 * 
 * @author 
 * @email 
 * @date 2022-02-20 20:52:54
 */
public interface JiagonggongyiDao extends BaseMapper<JiagonggongyiEntity> {
	
	List<JiagonggongyiVO> selectListVO(@Param("ew") Wrapper<JiagonggongyiEntity> wrapper);
	
	JiagonggongyiVO selectVO(@Param("ew") Wrapper<JiagonggongyiEntity> wrapper);
	
	List<JiagonggongyiView> selectListView(@Param("ew") Wrapper<JiagonggongyiEntity> wrapper);

	List<JiagonggongyiView> selectListView(Pagination page,@Param("ew") Wrapper<JiagonggongyiEntity> wrapper);
	
	JiagonggongyiView selectView(@Param("ew") Wrapper<JiagonggongyiEntity> wrapper);
	

}
