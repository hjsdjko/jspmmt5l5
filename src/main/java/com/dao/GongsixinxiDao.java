package com.dao;

import com.entity.GongsixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GongsixinxiVO;
import com.entity.view.GongsixinxiView;


/**
 * 公司信息
 * 
 * @author 
 * @email 
 * @date 2022-02-20 20:52:54
 */
public interface GongsixinxiDao extends BaseMapper<GongsixinxiEntity> {
	
	List<GongsixinxiVO> selectListVO(@Param("ew") Wrapper<GongsixinxiEntity> wrapper);
	
	GongsixinxiVO selectVO(@Param("ew") Wrapper<GongsixinxiEntity> wrapper);
	
	List<GongsixinxiView> selectListView(@Param("ew") Wrapper<GongsixinxiEntity> wrapper);

	List<GongsixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<GongsixinxiEntity> wrapper);
	
	GongsixinxiView selectView(@Param("ew") Wrapper<GongsixinxiEntity> wrapper);
	

}
