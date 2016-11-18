/**
 * Copyright (c) on Alibaba GaoDe.
 */
package com.pramid.test.ml.alg.pcs;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.pramid.ml.ml.pcs.PearsonCorrelationScore;

/**
 * @Auther: leimingming.lm（花名：穆雷）<br>
 * @Date: Nov 18, 2016 11:19:48 AM<br>
 * @Project: dpmp-ml<br>
 * @Package: com.autonavi.dpmp.ml.pcs<br>
 * @File: TestCodes.java<br>
 * @Description: <br>
 */
public class TestCodes {

	private static final Logger logger = LoggerFactory
			.getLogger(TestCodes.class);

	@Test
	public void test01() {
		PearsonCorrelationScore pearsonCorrelationScore = new PearsonCorrelationScore();
		logger.info("score: {}", pearsonCorrelationScore.sim_pearson(
				"Lisa Rose", "Jack Matthews"));
	}
}
