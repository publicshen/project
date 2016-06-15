package com.bwie.entity;

public class Room {
	
    private Integer roomId;

    private Integer roomstatusId;

    private Integer roomtypeId;

    private String roomName;
    
    private Status status;
    
    private RoomType roomtype;

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public Integer getRoomstatusId() {
        return roomstatusId;
    }

    public void setRoomstatusId(Integer roomstatusId) {
        this.roomstatusId = roomstatusId;
    }

    public Integer getRoomtypeId() {
        return roomtypeId;
    }

    public void setRoomtypeId(Integer roomtypeId) {
        this.roomtypeId = roomtypeId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public RoomType getRoomtype() {
		return roomtype;
	}

	public void setRoomtype(RoomType roomtype) {
		this.roomtype = roomtype;
	}
    
    
}