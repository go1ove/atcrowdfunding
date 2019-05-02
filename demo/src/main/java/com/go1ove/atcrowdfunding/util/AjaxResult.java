package com.go1ove.atcrowdfunding.util;

/**
 * @author go1ove
 * @create 2019-04-30-16:03
 */
public class AjaxResult {
    private boolean success;

    private String message;

    private Page page;

    public void setPage(Page page) {
        this.page = page;
    }

    public Page getPage() {
        return page;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

}
