package lh.com.pojo;


import lombok.Data;

import java.util.Date;

@Data
public class Order {
    private String id;
    private Date date;
    private String status;
    private int user_id;
}
