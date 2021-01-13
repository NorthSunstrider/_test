package com.northsunstrider.java8;

import java.util.List;

/**
 * @Description: TODO
 * @author: North
 * @date: 2018年4月28日 上午8:52:56
 */
public class Article {

	private final String title;
	private final String author;
	private final List<String> tags;

	public Article(String title, String author, List<String> tags) {
		super();
		this.title = title;
		this.author = author;
		this.tags = tags;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public List<String> getTags() {
		return tags;
	}

	@Override
	public String toString() {
		return "title:" + title + "\t author:" + author + "\t tags:" + tags.toString();
	}
}
