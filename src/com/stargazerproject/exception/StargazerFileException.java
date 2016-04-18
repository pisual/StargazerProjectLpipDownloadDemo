package com.stargazerproject.exception;

import com.stargazerproject.log.CoreLogManaged;

public class StargazerFileException extends Exception{
	private static final long serialVersionUID = 1473565781048771099L;

	public StargazerFileException(String exception) {
		switch (exception) {
		case "isDirectory":
			CoreLogManaged.ERROR(this,"Specify_a_location_parameter_is_illegal_specify_a_location_for_a_directory_not_a_file","");
			break;
		case "FileNameIsNull":
			CoreLogManaged.ERROR(this,"Specify_a_location_parameter_is_illegal_specify_a_location_for_a_directory_not_a_file","");
			break;
		case "CouldNotFindFile":
			CoreLogManaged.ERROR(this,"The_source_file_does_not_exist","");
			break;
		default:
			CoreLogManaged.ERROR(this,"Unknown_error","");
			break;
		}
	}
}
