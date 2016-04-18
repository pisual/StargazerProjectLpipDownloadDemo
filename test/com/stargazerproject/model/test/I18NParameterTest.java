package com.stargazerproject.model.test;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.stargazerproject.model.I18NParameter;
import com.stargazerproject.model.Location;

public class I18NParameterTest {
	
	@Rule
	public ExpectedException thrown= ExpectedException.none();
	
	@Test
	public void initParements(){
		I18NParameter.getInstance().I18N(Location.US);
	}
	
	@Test
	public void initParementsLocationIsNull(){
		thrown.expect(NullPointerException.class);
		thrown.expectMessage("parameter 参数为空");
		I18NParameter.getInstance().I18N(null);
	}
}
