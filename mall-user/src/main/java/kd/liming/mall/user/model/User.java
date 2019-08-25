package kd.liming.mall.user.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
	private long id;
	private long memberLevelId;
	private String username;
	private String password;
	private String nickname;
	private String phone;
	private int status;
	private Date createTime;
	private String icon;
	private int gender;
	private Date birthday;
	private String city;
	private String job;
	private String personalizedSignature;
	private int sourceType;
	private int integration;
	private int growth;
	private int luckeyCount;
	private int historyIntegration;
}
