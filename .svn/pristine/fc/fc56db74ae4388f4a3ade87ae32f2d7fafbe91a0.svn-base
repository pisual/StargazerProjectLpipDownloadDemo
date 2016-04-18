package com.stargazerproject.parameter;

import java.util.Locale;

import com.stargazerproject.util.ParameterCalibration;

public class SwitchI18NLocale {

	public static Locale getI18NLocale(String localeName){
		ParameterCalibration.basicParameterCalibration(localeName);
		Locale locale;
		switch (localeName) {
		case "CHINA":
			locale = Locale.CHINA;
			break;
		case "US":
			locale = Locale.US;
			break;
		default:
			locale = Locale.CHINA;
			break;
		}
		return locale;
	}
}
