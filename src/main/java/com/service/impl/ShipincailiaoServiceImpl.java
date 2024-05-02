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


import com.dao.ShipincailiaoDao;
import com.entity.ShipincailiaoEntity;
import com.service.ShipincailiaoService;
import com.entity.vo.ShipincailiaoVO;
import com.entity.view.ShipincailiaoView;

@Service("shipincailiaoService")
public class ShipincailiaoServiceImpl extends ServiceImpl<ShipincailiaoDao, ShipincailiaoEntity> implements ShipincailiaoService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShipincailiaoEntity> page = this.selectPage(
                new Query<ShipincailiaoEntity>(params).getPage(),
                new EntityWrapper<ShipincailiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShipincailiaoEntity> wrapper) {
		  Page<ShipincailiaoView> page =new Query<ShipincailiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShipincailiaoVO> selectListVO(Wrapper<ShipincailiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShipincailiaoVO selectVO(Wrapper<ShipincailiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShipincailiaoView> selectListView(Wrapper<ShipincailiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShipincailiaoView selectView(Wrapper<ShipincailiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
