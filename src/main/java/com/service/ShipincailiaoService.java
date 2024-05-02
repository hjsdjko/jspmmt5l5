package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShipincailiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShipincailiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShipincailiaoView;


/**
 * 食品材料
 *
 * @author 
 * @email 
 * @date 2022-02-20 20:52:54
 */
public interface ShipincailiaoService extends IService<ShipincailiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShipincailiaoVO> selectListVO(Wrapper<ShipincailiaoEntity> wrapper);
   	
   	ShipincailiaoVO selectVO(@Param("ew") Wrapper<ShipincailiaoEntity> wrapper);
   	
   	List<ShipincailiaoView> selectListView(Wrapper<ShipincailiaoEntity> wrapper);
   	
   	ShipincailiaoView selectView(@Param("ew") Wrapper<ShipincailiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShipincailiaoEntity> wrapper);
   	

}

