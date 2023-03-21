package com.ssafy.board.model;

public class BoardDto {

//	게시글 정보(db schema)에 해당하는 프로퍼티를 만들고 getter/setter를 만드세요.
	private int articleNo;
	private String userid;
	private String subject;
	private String content;
	private int hit;
	private String registerTime;

	public int getArticleNo() {
		return articleNo;
	}

	public void setArticleNo(int articleNo) {
		this.articleNo = articleNo;
	}

	public String getUserId() {
		return userid;
	}

	public void setUserId(String userid) {
		this.userid = userid;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public String getRegisterTime() {
		return registerTime;
	}

	public void setRegisterTime(String registerTime) {
		this.registerTime = registerTime;
	}

	@Override
	public String toString() {
		return "BoardDto [article_no=" + articleNo + ", user_id=" + userid + ", subject=" + subject + ", content="
				+ content + ", hit=" + hit + ", register_time=" + registerTime + "]";
	}
}
