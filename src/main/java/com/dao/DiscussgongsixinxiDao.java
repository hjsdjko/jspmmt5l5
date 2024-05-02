package com.dao;

import com.entity.DiscussgongsixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussgongsixinxiVO;
import com.entity.view.DiscussgongsixinxiView;


/**
 * 公司信息评论表
 * 
 * @author 
 * @email 
 * @date 2022-02-20 20:52:54
 */
public interface DiscussgongsixinxiDao extends BaseMapper<DiscussgongsixinxiEntity> {
	
	List<DiscussgongsixinxiVO> selectListVO(@Param("ew") Wrapper<DiscussgongsixinxiEntity> wrapper);
	
	DiscussgongsixinxiVO selectVO(@Param("ew") Wrapper<DiscussgongsixinxiEntity> wrapper);
	
	List<DiscussgongsixinxiView> selectListView(@Param("ew") Wrapper<DiscussgongsixinxiEntity> wrapper);

	List<DiscussgongsixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussgongsixinxiEntity> wrapper);
	
	DiscussgongsixinxiView selectView(@Param("ew") Wrapper<DiscussgongsixinxiEntity> wrapper);
	

}
