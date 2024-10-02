package com.example.spring_study;

public enum OrderStatusVo {
    PLACED(0, "下单"),
    PAID(1,"支付"),
    COMPLETED(2, "完成"),
    CANCELLED(3,"退单");

    private final int code;
    private final String description;

    OrderStatusVo(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static OrderStatusVo fromCode(int code){
        for(OrderStatusVo status:OrderStatusVo.values()){
            if(status.getCode()==code){
                return status;
            }
        }
        throw new IllegalArgumentException("Invalid code for OrderStatus:"+code);
    }
}
