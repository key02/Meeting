package com.qf.Pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Arrange {

  private Integer id;
  private String arrangeName;
  private Date meetingTime;
  private String meetingSite;
  private String meetingArrange;
  private Integer informId;


}
