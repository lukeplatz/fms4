package fms4.model;

import java.util.*;

import org.threeten.bp.*;

import java.math.*;

import org.springframework.web.multipart.MultipartFile;

public class CreateFeedbackP {

	private FeedbackInput body;

	public CreateFeedbackP(){}

	public CreateFeedbackP(FeedbackInput body){
		 this.body=body;
	}


	public FeedbackInput getBody() {
		 return body;
	}

	public void setBody(FeedbackInput body) {
		 this.body=body;
	}
}