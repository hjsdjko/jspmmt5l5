package com.entity.model;

import com.entity.JiagonggongyiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 加工工艺
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-02-20 20:52:54
 */
public class JiagonggongyiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 公司名称
	 */
	
	private String gongsimingcheng;
		
	/**
	 * 所需原料
	 */
	
	private String suoxuyuanliao;
		
	/**
	 * 工艺目的
	 */
	
	private String gongyimude;
		
	/**
	 * 工艺步骤
	 */
	
	private String gongyibuzhou;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
		
	/**
	 * 工艺详情
	 */
	
	private String gongyixiangqing;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
		
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
	 * 设置：公司名称
	 */
	 
	public void setGongsimingcheng(String gongsimingcheng) {
		this.gongsimingcheng = gongsimingcheng;
	}
	
	/**
	 * 获取：公司名称
	 */
	public String getGongsimingcheng() {
		return gongsimingcheng;
	}
				
	
	/**
	 * 设置：所需原料
	 */
	 
	public void setSuoxuyuanliao(String suoxuyuanliao) {
		this.suoxuyuanliao = suoxuyuanliao;
	}
	
	/**
	 * 获取：所需原料
	 */
	public String getSuoxuyuanliao() {
		return suoxuyuanliao;
	}
				
	
	/**
	 * 设置：工艺目的
	 */
	 
	public void setGongyimude(String gongyimude) {
		this.gongyimude = gongyimude;
	}
	
	/**
	 * 获取：工艺目的
	 */
	public String getGongyimude() {
		return gongyimude;
	}
				
	
	/**
	 * 设置：工艺步骤
	 */
	 
	public void setGongyibuzhou(String gongyibuzhou) {
		this.gongyibuzhou = gongyibuzhou;
	}
	
	/**
	 * 获取：工艺步骤
	 */
	public String getGongyibuzhou() {
		return gongyibuzhou;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：发布日期
	 */
	 
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}
				
	
	/**
	 * 设置：工艺详情
	 */
	 
	public void setGongyixiangqing(String gongyixiangqing) {
		this.gongyixiangqing = gongyixiangqing;
	}
	
	/**
	 * 获取：工艺详情
	 */
	public String getGongyixiangqing() {
		return gongyixiangqing;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
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
			
}
