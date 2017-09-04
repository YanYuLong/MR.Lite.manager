package cn.wkiki.Model;

/**
 * 用户类别信息
 * @author yulongy
 * 
 */
public class UserType {
	
	private int userTypeId;
	private String userTypeName;
	private String userTypeDiscription;
	
	public int getUserTypeId() {
		return userTypeId;
	}
	public void setUserTypeId(int userTypeId) {
		this.userTypeId = userTypeId;
	}
	public String getUserTypeName() {
		return userTypeName;
	}
	public void setUserTypeName(String userTypeName) {
		this.userTypeName = userTypeName;
	}
	public String getUserTypeDiscription() {
		return userTypeDiscription;
	}
	public void setUserTypeDiscription(String userTypeDiscription) {
		this.userTypeDiscription = userTypeDiscription;
	}
}
