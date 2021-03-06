/**
 * Copyright (c) 2016 Saúl Piña <sauljabin@gmail.com>.
 * 
 * This file is part of idempierewsc.
 * 
 * idempierewsc is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * idempierewsc is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with idempierewsc.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.brerp.webservice.client.request;

import org.brerp.webservice.client.base.ModelCRUDRequest;
import org.brerp.webservice.client.base.Enums.WebServiceDefinition;
import org.brerp.webservice.client.base.Enums.WebServiceMethod;
import org.brerp.webservice.client.base.Enums.WebServiceResponseModel;

/**
 * CreateUpdateData. iDempiere Web Service CreateUpdateData
 */
public class CreateUpdateDataRequest extends ModelCRUDRequest {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.idempiere.webservice.client.base.WebServiceRequest#getWebServiceMethod()
	 */
	@Override
	public WebServiceMethod getWebServiceMethod() {
		return WebServiceMethod.createUpdateData;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.idempiere.webservice.client.base.WebServiceRequest#getWebServiceDefinition()
	 */
	@Override
	public WebServiceDefinition getWebServiceDefinition() {
		return WebServiceDefinition.ModelADService;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.idempiere.webservice.client.base.WebServiceRequest#getWebServiceResponseModel()
	 */
	@Override
	public WebServiceResponseModel getWebServiceResponseModel() {
		return WebServiceResponseModel.StandardResponse;
	}

}
