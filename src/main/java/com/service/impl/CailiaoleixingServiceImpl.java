package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.CailiaoleixingDao;
import com.entity.CailiaoleixingEntity;
import com.service.CailiaoleixingService;
import com.entity.vo.CailiaoleixingVO;
import com.entity.view.CailiaoleixingView;

@Service("cailiaoleixingService")
public class CailiaoleixingServiceImpl extends ServiceImpl<CailiaoleixingDao, CailiaoleixingEntity> implements CailiaoleixingService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CailiaoleixingEntity> page = this.selectPage(
                new Query<CailiaoleixingEntity>(params).getPage(),
                new EntityWrapper<CailiaoleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CailiaoleixingEntity> wrapper) {
		  Page<CailiaoleixingView> page =new Query<CailiaoleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CailiaoleixingVO> selectListVO(Wrapper<CailiaoleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CailiaoleixingVO selectVO(Wrapper<CailiaoleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CailiaoleixingView> selectListView(Wrapper<CailiaoleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CailiaoleixingView selectView(Wrapper<CailiaoleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
