package com.official.foundation.facade.product;

import java.util.List;

import com.official.foundation.domain.po.product.Specification;
import com.official.foundation.facade.BaseFacadeService;

public interface SpecificationFacadeService extends BaseFacadeService<Specification,Long>{
	/**
	 * 是否存在title
	 * @param title
	 * @return
	 */
	public boolean checkTitle(String title);
	
	public List<Specification> searchSpec(Specification specification);
}
