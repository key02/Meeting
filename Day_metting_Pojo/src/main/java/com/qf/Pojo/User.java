package com.qf.Pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

  private Integer id;
  private String loginName;
  private String userName;
  private String password;
  private String image;
  private String phone;

}
