package com.official.foundation.facade.product;

import java.util.Map;

import com.official.foundation.domain.po.product.Commodity;
import com.official.foundation.facade.BaseFacadeService;

public interface CommodityFacadeService extends BaseFacadeService<Commodity,Long>{
	
	public Map<String,Object> searchCommodity(Commodity commodity,Integer pageIndex,Integer pageSize);
}
