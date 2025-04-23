package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 电影信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-14 17:50:56
 */
@TableName("dianyingxinxi")
public class DianyingxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DianyingxinxiEntity() {
		
	}
	
	public DianyingxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 电影名称
	 */
					
	private String dianyingmingcheng;
	
	/**
	 * 电影类型
	 */
					
	private String dianyingleixing;
	
	/**
	 * 电影封面
	 */
					
	private String dianyingfengmian;
	
	/**
	 * 演员
	 */
					
	private String yanyuan;
	
	/**
	 * 导演
	 */
					
	private String daoyan;
	
	/**
	 * 发行商
	 */
					
	private String faxingshang;
	
	/**
	 * 电影简介
	 */
					
	private String dianyingjianjie;
	
	/**
	 * 电影内容
	 */
					
	private String dianyingneirong;
	
	/**
	 * 影院名称
	 */
					
	private String yingyuanmingcheng;
	
	/**
	 * 影院地址
	 */
					
	private String yingyuandizhi;
	
	/**
	 * 上映日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date shangyingriqi;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	/**
	 * 点击次数
	 */
					
	private Integer clicknum;
	
	/**
	 * 价格
	 */
					
	private Float price;
	
	/**
	 * 座位总数
	 */
					
	private Integer number;
	
	/**
	 * 已选座位[用,号隔开]
	 */
					
	private String selected;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：电影名称
	 */
	public void setDianyingmingcheng(String dianyingmingcheng) {
		this.dianyingmingcheng = dianyingmingcheng;
	}
	/**
	 * 获取：电影名称
	 */
	public String getDianyingmingcheng() {
		return dianyingmingcheng;
	}
	/**
	 * 设置：电影类型
	 */
	public void setDianyingleixing(String dianyingleixing) {
		this.dianyingleixing = dianyingleixing;
	}
	/**
	 * 获取：电影类型
	 */
	public String getDianyingleixing() {
		return dianyingleixing;
	}
	/**
	 * 设置：电影封面
	 */
	public void setDianyingfengmian(String dianyingfengmian) {
		this.dianyingfengmian = dianyingfengmian;
	}
	/**
	 * 获取：电影封面
	 */
	public String getDianyingfengmian() {
		return dianyingfengmian;
	}
	/**
	 * 设置：演员
	 */
	public void setYanyuan(String yanyuan) {
		this.yanyuan = yanyuan;
	}
	/**
	 * 获取：演员
	 */
	public String getYanyuan() {
		return yanyuan;
	}
	/**
	 * 设置：导演
	 */
	public void setDaoyan(String daoyan) {
		this.daoyan = daoyan;
	}
	/**
	 * 获取：导演
	 */
	public String getDaoyan() {
		return daoyan;
	}
	/**
	 * 设置：发行商
	 */
	public void setFaxingshang(String faxingshang) {
		this.faxingshang = faxingshang;
	}
	/**
	 * 获取：发行商
	 */
	public String getFaxingshang() {
		return faxingshang;
	}
	/**
	 * 设置：电影简介
	 */
	public void setDianyingjianjie(String dianyingjianjie) {
		this.dianyingjianjie = dianyingjianjie;
	}
	/**
	 * 获取：电影简介
	 */
	public String getDianyingjianjie() {
		return dianyingjianjie;
	}
	/**
	 * 设置：电影内容
	 */
	public void setDianyingneirong(String dianyingneirong) {
		this.dianyingneirong = dianyingneirong;
	}
	/**
	 * 获取：电影内容
	 */
	public String getDianyingneirong() {
		return dianyingneirong;
	}
	/**
	 * 设置：影院名称
	 */
	public void setYingyuanmingcheng(String yingyuanmingcheng) {
		this.yingyuanmingcheng = yingyuanmingcheng;
	}
	/**
	 * 获取：影院名称
	 */
	public String getYingyuanmingcheng() {
		return yingyuanmingcheng;
	}
	/**
	 * 设置：影院地址
	 */
	public void setYingyuandizhi(String yingyuandizhi) {
		this.yingyuandizhi = yingyuandizhi;
	}
	/**
	 * 获取：影院地址
	 */
	public String getYingyuandizhi() {
		return yingyuandizhi;
	}
	/**
	 * 设置：上映日期
	 */
	public void setShangyingriqi(Date shangyingriqi) {
		this.shangyingriqi = shangyingriqi;
	}
	/**
	 * 获取：上映日期
	 */
	public Date getShangyingriqi() {
		return shangyingriqi;
	}
	/**
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
	/**
	 * 设置：点击次数
	 */
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
	/**
	 * 设置：价格
	 */
	public void setPrice(Float price) {
		this.price = price;
	}
	/**
	 * 获取：价格
	 */
	public Float getPrice() {
		return price;
	}
	/**
	 * 设置：座位总数
	 */
	public void setNumber(Integer number) {
		this.number = number;
	}
	/**
	 * 获取：座位总数
	 */
	public Integer getNumber() {
		return number;
	}
	/**
	 * 设置：已选座位[用,号隔开]
	 */
	public void setSelected(String selected) {
		this.selected = selected;
	}
	/**
	 * 获取：已选座位[用,号隔开]
	 */
	public String getSelected() {
		return selected;
	}

}
