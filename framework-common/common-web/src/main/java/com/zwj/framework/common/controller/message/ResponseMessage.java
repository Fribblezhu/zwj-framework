package com.zwj.framework.common.controller.message;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author: zwj
 * @Date: 6/5/19
 * @Time: 4:32 PM
 * @description:
 */
@ApiModel(description = "响应实体")
public class ResponseMessage<T> {

    private T data;

    private String message;

    private int status;

    private Long timestamp;

    private String code;

    public static ResponseMessage success() {
        return ResponseMessage.success(null);
    }

    public static <T> ResponseMessage success(T data) {
        return new ResponseMessage<T>()
                .data(data)
                .status(200)
                .putTimestamp();
    }

    public static ResponseMessage error(String message) {
        return ResponseMessage.error(500, message);
    }

    public static ResponseMessage error(int status, String message) {
        return new ResponseMessage()
                .message(message)
                .status(status)
                .putTimestamp();

    }

    public ResponseMessage<T> data(T data) {
        this.data = data;
        return  this;
    }

    public ResponseMessage message(String message) {
        this.message = message;
        return this;
    }

    public ResponseMessage status(int status) {
        this.status = status;
        return this;
    }

    public  ResponseMessage code(String code) {
        this.code = code;
        return  this;
    }

    private ResponseMessage putTimestamp() {
        this.timestamp = System.currentTimeMillis();
        return this;
    }

    @ApiModelProperty("响应结果数据")
    public T getData() {
        return data;
    }

    @ApiModelProperty("响应结果消息")
    public String getMessage() {
        return message;
    }

    @ApiModelProperty("响应状态码")
    public int getStatus() {
        return status;
    }
    @ApiModelProperty("响应时间")
    public Long getTimestamp() {
        return timestamp;
    }
    @ApiModelProperty("响应业务码")
    public String getCode() {
        return code;
    }


}
