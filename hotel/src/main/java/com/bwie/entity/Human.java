package com.bwie.entity;

public class Human {
    private Integer humanId;

    private String humanName;

    private String humanTel;

    private String humanArrivetime;

    private String humanIdcard;
    
    private String humanBackRoom;

    private String humanMoneytype;

    private String sex;

    private Integer days;

    private Integer roomId;

    private Integer accountId;

 
    private Room room;


    private Account account;

    public Integer getHumanId() {
        return humanId;
    }

    public void setHumanId(Integer humanId) {
        this.humanId = humanId;
    }

    public String getHumanName() {
        return humanName;
    }

    public void setHumanName(String humanName) {
        this.humanName = humanName;
    }

    public String getHumanTel() {
        return humanTel;
    }

    public void setHumanTel(String humanTel) {
        this.humanTel = humanTel;
    }

    public String getHumanArrivetime() {
        return humanArrivetime;
    }

    public void setHumanArrivetime(String humanArrivetime) {
        this.humanArrivetime = humanArrivetime;
    }

    public String getHumanIdcard() {
        return humanIdcard;
    }

    public void setHumanIdcard(String humanIdcard) {
        this.humanIdcard = humanIdcard;
    }

    public String getHumanMoneytype() {
        return humanMoneytype;
    }

    public void setHumanMoneytype(String humanMoneytype) {
        this.humanMoneytype = humanMoneytype;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }


	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}