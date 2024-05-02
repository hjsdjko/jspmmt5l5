package com.dao;

import com.entity.DiscussshipincailiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussshipincailiaoVO;
import com.entity.view.DiscussshipincailiaoView;


/**
 * 食品材料评论表
 * 
 * @author 
 * @email 
 * @date 2022-02-20 20:52:54
 */
public interface DiscussshipincailiaoDao extends BaseMapper<DiscussshipincailiaoEntity> {
	
	List<DiscussshipincailiaoVO> selectListVO(@Param("ew") Wrapper<DiscussshipincailiaoEntity> wrapper);
	
	DiscussshipincailiaoVO selectVO(@Param("ew") Wrapper<DiscussshipincailiaoEntity> wrapper);
	
	List<DiscussshipincailiaoView> selectListView(@Param("ew") Wrapper<DiscussshipincailiaoEntity> wrapper);

	List<DiscussshipincailiaoView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussshipincailiaoEntity> wrapper);
	
	DiscussshipincailiaoView selectView(@Param("ew") Wrapper<DiscussshipincailiaoEntity> wrapper);
	

}
