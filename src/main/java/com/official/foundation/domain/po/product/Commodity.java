package com.official.foundation.domain.po.product;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

import com.official.core.base.entity.BaseEntity;

/**
 * 商品
 * @author ShawnXII
 * @Version 1.0
 */
@Entity
@Table(name = "business_commodity")
public class Commodity extends BaseEntity<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8881358485663628350L;
	
	//产品标题
	@Column(name="title",nullable=false)
	private String title;
	
	//副标题
	@Column(name="sub_title")
	private String subTitle;
	
	//价格 = 价格-折扣
	@Column(precision = 12, scale = 2,name="price",nullable=false)
	private BigDecimal price;
	
	//折扣
	@Column(precision = 12, scale = 2,name="discount")
	private BigDecimal discount;
	
	//商品体积 平方米
	@Column(precision = 12, scale = 2,name="volume")
	private BigDecimal volume;
	
	//商品重量 kg
	@Column(precision = 12, scale = 2,name="weight")
	private BigDecimal weight;
	
	//功能参数 JSON数组
	@Lob
	@Column(columnDefinition = "LongText",name="function_paramete")
	private String functionParamete;
	
	//规格参数 JSON 数组
	@Lob
	@Column(columnDefinition = "LongText",name="specification_parameter")
	private String specificationParameter;
	
	//净水器分类
	@Column(name="classify_id",nullable=false)
	private Long classifyId;
	
	//净水器品牌
	@Column(name="brand_id",nullable=false)
	private Long brandId;
	
	//净水器内部编号 
	@Column(name="item",nullable=false)
	private String item;
	
	//主图
	@Column(name="main_picture",nullable=false)
	private String mainPicture;
	
	//组图 JSON数组
	@Lob
	@Column(columnDefinition = "LongText",name="details_pictures")
	private String detailsPictures;
	
	//详细描述 JSON 建议使用纯图片 也可以使用文字+图片的格式来描述该商品
	@Lob
	@Column(columnDefinition = "LongText",name="candicine")
	private String candicine;
	
	
	//SEO 关键字 多个关键字用','隔开
	@Column(name="keywords")
	private String keywords;
	
	//SEO 详细描述
	@Column(name="description")
	private String description;
	
	//供应商ID
	@Column(name="store_id")
	private Long storeId;
	
	//商品型号
	@Column(name="model")
	private String model;
	
	//销售区域 0:全国 1:区域销售 默认0
	@Column(name="sales")
	private Integer sales=0;
	
	//商品状态 0:默认状态 1:商家  2:下架 
	@Column(name="state")
	private Integer state=0;
	
	//下架状态 1:无货 2:停产 3:违规
	@Column(name="lower_state")
	private Integer lowerState;
	
	//下架状态描述
	@Column(name="lower_message")
	private String lowerMessage;
	
	//商品颜色
	@Column(name="color")
	private String color;
	
	//包装清单 JSON 格式:{'':''}
	@Column(name="packing_list")
	private String packingList;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getDiscount() {
		return discount;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	public BigDecimal getVolume() {
		return volume;
	}

	public void setVolume(BigDecimal volume) {
		this.volume = volume;
	}

	public BigDecimal getWeight() {
		return weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	public String getFunctionParamete() {
		return functionParamete;
	}

	public void setFunctionParamete(String functionParamete) {
		this.functionParamete = functionParamete;
	}

	public String getSpecificationParameter() {
		return specificationParameter;
	}

	public void setSpecificationParameter(String specificationParameter) {
		this.specificationParameter = specificationParameter;
	}

	public Long getClassifyId() {
		return classifyId;
	}

	public void setClassifyId(Long classifyId) {
		this.classifyId = classifyId;
	}

	public Long getBrandId() {
		return brandId;
	}

	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getMainPicture() {
		return mainPicture;
	}

	public void setMainPicture(String mainPicture) {
		this.mainPicture = mainPicture;
	}

	public String getDetailsPictures() {
		return detailsPictures;
	}

	public void setDetailsPictures(String detailsPictures) {
		this.detailsPictures = detailsPictures;
	}

	public String getCandicine() {
		return candicine;
	}

	public void setCandicine(String candicine) {
		this.candicine = candicine;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getStoreId() {
		return storeId;
	}

	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Integer getSales() {
		return sales;
	}

	public void setSales(Integer sales) {
		this.sales = sales;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Integer getLowerState() {
		return lowerState;
	}

	public void setLowerState(Integer lowerState) {
		this.lowerState = lowerState;
	}

	public String getLowerMessage() {
		return lowerMessage;
	}

	public void setLowerMessage(String lowerMessage) {
		this.lowerMessage = lowerMessage;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPackingList() {
		return packingList;
	}

	public void setPackingList(String packingList) {
		this.packingList = packingList;
	}
}
