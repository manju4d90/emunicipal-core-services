package org.egov.waterConnection.service;

import java.util.List;

import org.egov.common.contract.request.RequestInfo;
import org.egov.waterConnection.model.Property;
import org.egov.waterConnection.model.WaterConnection;
import org.egov.waterConnection.model.WaterConnectionRequest;
import org.egov.waterConnection.model.WaterConnectionSearchCriteria;

public interface WaterService {

	public List<WaterConnection> createWaterConnection(WaterConnectionRequest waterConnectionRequest);

	public List<WaterConnection> search(WaterConnectionSearchCriteria criteria, RequestInfo requestInfo);

}
