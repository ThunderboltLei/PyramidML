/**
 * Copyright (c) on Alibaba GaoDe.
 */
package com.pramid.ml.ml.encog;

import org.encog.util.text.BagOfWords;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @Auther: leimingming.lm（花名：穆雷）<br>
 * @Date: Nov 17, 2016 4:30:00 PM<br>
 * @Project: dpmp-ml<br>
 * @Package: com.pramid.ml.ml.test<br>
 * @File: Test01.java<br>
 * @Description: <br>
 */
public class Test01 {
	
	private static final Logger logger = LoggerFactory.getLogger(Test01.class);
	
	public static void main(String[] args) {
		
		String str = "com alibaba jstorm metric TopologyMetricContext";
		
		BagOfWords bagOfWords = new BagOfWords();
		bagOfWords.process(str);
		int count = bagOfWords.getCount(str);
		
		logger.info("count: {}", count);
	}

}
