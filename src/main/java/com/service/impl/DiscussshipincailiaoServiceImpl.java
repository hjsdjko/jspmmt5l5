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


import com.dao.DiscussshipincailiaoDao;
import com.entity.DiscussshipincailiaoEntity;
import com.service.DiscussshipincailiaoService;
import com.entity.vo.DiscussshipincailiaoVO;
import com.entity.view.DiscussshipincailiaoView;

@Service("discussshipincailiaoService")
public class DiscussshipincailiaoServiceImpl extends ServiceImpl<DiscussshipincailiaoDao, DiscussshipincailiaoEntity> implements DiscussshipincailiaoService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussshipincailiaoEntity> page = this.selectPage(
                new Query<DiscussshipincailiaoEntity>(params).getPage(),
                new EntityWrapper<DiscussshipincailiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussshipincailiaoEntity> wrapper) {
		  Page<DiscussshipincailiaoView> page =new Query<DiscussshipincailiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussshipincailiaoVO> selectListVO(Wrapper<DiscussshipincailiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussshipincailiaoVO selectVO(Wrapper<DiscussshipincailiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussshipincailiaoView> selectListView(Wrapper<DiscussshipincailiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussshipincailiaoView selectView(Wrapper<DiscussshipincailiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
