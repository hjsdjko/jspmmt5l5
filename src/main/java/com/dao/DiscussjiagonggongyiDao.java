package com.dao;

import com.entity.DiscussjiagonggongyiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjiagonggongyiVO;
import com.entity.view.DiscussjiagonggongyiView;


/**
 * 加工工艺评论表
 * 
 * @author 
 * @email 
 * @date 2022-02-20 20:52:54
 */
public interface DiscussjiagonggongyiDao extends BaseMapper<DiscussjiagonggongyiEntity> {
	
	List<DiscussjiagonggongyiVO> selectListVO(@Param("ew") Wrapper<DiscussjiagonggongyiEntity> wrapper);
	
	DiscussjiagonggongyiVO selectVO(@Param("ew") Wrapper<DiscussjiagonggongyiEntity> wrapper);
	
	List<DiscussjiagonggongyiView> selectListView(@Param("ew") Wrapper<DiscussjiagonggongyiEntity> wrapper);

	List<DiscussjiagonggongyiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjiagonggongyiEntity> wrapper);
	
	DiscussjiagonggongyiView selectView(@Param("ew") Wrapper<DiscussjiagonggongyiEntity> wrapper);
	

}
