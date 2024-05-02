package com.dao;

import com.entity.CailiaoleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CailiaoleixingVO;
import com.entity.view.CailiaoleixingView;


/**
 * 材料类型
 * 
 * @author 
 * @email 
 * @date 2022-02-20 20:52:54
 */
public interface CailiaoleixingDao extends BaseMapper<CailiaoleixingEntity> {
	
	List<CailiaoleixingVO> selectListVO(@Param("ew") Wrapper<CailiaoleixingEntity> wrapper);
	
	CailiaoleixingVO selectVO(@Param("ew") Wrapper<CailiaoleixingEntity> wrapper);
	
	List<CailiaoleixingView> selectListView(@Param("ew") Wrapper<CailiaoleixingEntity> wrapper);

	List<CailiaoleixingView> selectListView(Pagination page,@Param("ew") Wrapper<CailiaoleixingEntity> wrapper);
	
	CailiaoleixingView selectView(@Param("ew") Wrapper<CailiaoleixingEntity> wrapper);
	

}
