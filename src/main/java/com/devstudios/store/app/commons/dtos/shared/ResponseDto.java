package com.devstudios.store.app.commons.dtos.shared;

import java.time.LocalDateTime;



public class ResponseDto<T> {
    private int status;
    private LocalDateTime date = LocalDateTime.now();
    private T data;

    public ResponseDto(){}

    public ResponseDto(int status, T data) {
        this.status = status;
        this.data = data;
    }

    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public LocalDateTime getDate() {
        return date;
    }
    public void setDate(LocalDateTime date) {
        this.date = date;
    }
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }

}
