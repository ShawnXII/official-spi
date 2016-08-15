package com.official.foundation.facade.product;

import java.util.List;
import java.util.Map;

import com.official.foundation.domain.po.product.Classify;
import com.official.foundation.facade.BaseFacadeService;

public interface ClassifyFacadeService extends BaseFacadeService<Classify,Long>{
	/**
	 * 查询产品分类
	 * @param classify
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 */
	public  List<Classify> searchClassify(Classify classify);
	
	
}
