package com.qf.Pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Meetinginform {

  private Integer id;
  private String meetingName;
  private String meetingTime;
  private String meetingPosition;


}
