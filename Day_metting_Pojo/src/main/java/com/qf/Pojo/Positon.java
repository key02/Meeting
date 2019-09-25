package com.qf.Pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Positon {

  private Integer id;
  private String positionName;
  private String description;
  private Integer missionId;



}
