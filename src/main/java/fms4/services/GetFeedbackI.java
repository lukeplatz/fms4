package fms4.services;

import java.util.*;

import fms4.model.*;

public interface GetFeedbackI {

	public GetFeedbackResponseWrapper execute(GetFeedbackP pojo);
	public <T> T error(int statusCode,Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}