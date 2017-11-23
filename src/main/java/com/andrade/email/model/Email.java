package com.andrade.email.model;

import org.jongo.marshall.jackson.oid.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonProperty;

@Document(indexName = "andrade", type = "emails")
public class Email {

	@JsonProperty("_id")
	@ObjectId
    private String id;

	@JsonProperty("sender")
	private String sender;

	@JsonProperty("recipients")
	private String recipients;

	@JsonProperty("cc")
	private String cc;

	@JsonProperty("text")
	private String text;

	@JsonProperty("mid")
	private String mid;

	@JsonProperty("fpath")
	private String fPath;

	@JsonProperty("bcc")
	private String bcc;

	@JsonProperty("to")
	private String to;

	@JsonProperty("replyTo")
	private String replyTo;

	@JsonProperty("ctype")
	private String cType;

	@JsonProperty("fName")
	private String fName;
	
	@JsonProperty("date")
	private String date;

	@JsonProperty("folder")
	private String folder;

	@JsonProperty("subject")
	private String subject;

	public Email() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getRecipients() {
		return recipients;
	}

	public void setRecipients(String recipients) {
		this.recipients = recipients;
	}

	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getfPath() {
		return fPath;
	}

	public void setfPath(String fPath) {
		this.fPath = fPath;
	}

	public String getBcc() {
		return bcc;
	}

	public void setBcc(String bcc) {
		this.bcc = bcc;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getReplyTo() {
		return replyTo;
	}

	public void setReplyTo(String replyTo) {
		this.replyTo = replyTo;
	}

	public String getcType() {
		return cType;
	}

	public void setcType(String cType) {
		this.cType = cType;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getFolder() {
		return folder;
	}

	public void setFolder(String folder) {
		this.folder = folder;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}



	public Email(String id, String sender, String recipients, String cc, String text, String to, String date,
			String subject) {
		this.id = id;
		this.sender = sender;
		this.recipients = recipients;
		this.cc = cc;
		this.text = text;
		this.to = to;
		this.date = date;
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Email{" +
				"id='" + id + '\'' +
				", sender='" + sender + '\'' +
				", recipients='" + recipients + '\'' +
				", cc='" + cc + '\'' +
				", text='" + text + '\'' +
				", to='" + to + '\'' +
				", date='" + date + '\'' +
				", subject='" + subject + '\'' +
				'}';
	}
}
