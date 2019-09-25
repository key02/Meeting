package com.qf.Pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Meetingdata {

  private Integer id;
  private String mettingName;
  private String mettingDescribe;
  private String mettingDataDetailsSite;
  private Integer informId;


}
