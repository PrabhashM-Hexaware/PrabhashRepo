
package com.vodafone.azuremigration.migration.model.request.body;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
public class Properties {

	private String azureLocation;

	private String azureOfferCode;

	private String azurePricingTier;

	private String azureStorageRedundancy;

	private Double scalingFactor;

	private String percentile;

	private String timeRange;

	private String stage;

	private String currency;

	private String azureHybridUseBenefit;

	private Integer discountPercentage;

	private String sizingCriterion;

	private VmUptime vmUptime;

	private String azureDiskType;

	private String reservedInstance;

}
