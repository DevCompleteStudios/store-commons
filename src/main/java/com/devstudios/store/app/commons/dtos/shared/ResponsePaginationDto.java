package com.devstudios.store.app.commons.dtos.shared;

import java.util.List;



public class ResponsePaginationDto<T> extends ResponseDto<List<T>> {
    private Long countElements;
    private double maxPages;


    public ResponsePaginationDto() {
    }

    public ResponsePaginationDto(int status, List<T> data, Long countElements, double maxPages) {
        super(status, data);
        this.countElements = countElements;
        this.maxPages = maxPages;
    }

    public Long getCountElements() {
        return countElements;
    }
    public void setCountElements(Long countElements) {
        this.countElements = countElements;
    }
    public double getMaxPages() {
        return maxPages;
    }
    public void setMaxPages(double maxPages) {
        this.maxPages = maxPages;
    }
    
}
