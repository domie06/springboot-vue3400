package com.entity.view;

import com.entity.YingyuanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 影院信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-14 17:50:56
 */
@TableName("yingyuanxinxi")
public class YingyuanxinxiView  extends YingyuanxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YingyuanxinxiView(){
	}
 
 	public YingyuanxinxiView(YingyuanxinxiEntity yingyuanxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, yingyuanxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
