package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YingyuanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YingyuanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YingyuanxinxiView;


/**
 * 影院信息
 *
 * @author 
 * @email 
 * @date 2022-04-14 17:50:56
 */
public interface YingyuanxinxiService extends IService<YingyuanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YingyuanxinxiVO> selectListVO(Wrapper<YingyuanxinxiEntity> wrapper);
   	
   	YingyuanxinxiVO selectVO(@Param("ew") Wrapper<YingyuanxinxiEntity> wrapper);
   	
   	List<YingyuanxinxiView> selectListView(Wrapper<YingyuanxinxiEntity> wrapper);
   	
   	YingyuanxinxiView selectView(@Param("ew") Wrapper<YingyuanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YingyuanxinxiEntity> wrapper);
   	

}

