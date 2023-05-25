package data_model;

public class Posts {
	
	private int postid;
	private int userid;
	private String title;
	private String url ;
	
	
	
	public Posts(String title, String url) {
		super();
		this.title = title;
		this.url = url;
	}
	
	public int getPostid() {
		return postid;
	}


	public void setPostid(int postid) {
		this.postid = postid;
	}


	public int getUserid() {
		return userid;
	}


	public void setUserid(int userid) {
		this.userid = userid;
	}


	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
