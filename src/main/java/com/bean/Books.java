package com.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * Description
 * Author AJAXXJ
 * Date 2021/08/30/下午5:30
 * Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {
	private Integer bookID;
	private String bookName;
	private Integer bookCounts;
	private String detail;
}
