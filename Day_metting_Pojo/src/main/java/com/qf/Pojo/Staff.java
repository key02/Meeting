package com.qf.Pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Staff {

  private Integer id;
  private String staffName;
  private String staffPhone;
  private String image;
  private Integer departmentId;


}
