package com.screencapture.rstepanyak.screencapture.model;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "LEASE".
 */
public class Lease {

    private Long id;
    private String item;
    private String comment;
    private Long leasedate;
    private Long returndate;

    public Lease() {
    }

    public Lease(Long id) {
        this.id = id;
    }

    public Lease(Long id, String item, String comment, Long leasedate, Long returndate) {
        this.id = id;
        this.item = item;
        this.comment = comment;
        this.leasedate = leasedate;
        this.returndate = returndate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Long getLeasedate() {
        return leasedate;
    }

    public void setLeasedate(Long leasedate) {
        this.leasedate = leasedate;
    }

    public Long getReturndate() {
        return returndate;
    }

    public void setReturndate(Long returndate) {
        this.returndate = returndate;
    }

}
