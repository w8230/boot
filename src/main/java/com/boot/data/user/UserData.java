package com.boot.data.user;

import lombok.Data;
/**
 * User Data Class
 * @author      김재일 <jerryKim>
 * @version     1.0
 * @since       2021/03/03
 **/
@Data
public class UserData {
    private String user_id;
    private String user_pwd;
    private String user_name;
    private String user_email;
    private int status;
}
